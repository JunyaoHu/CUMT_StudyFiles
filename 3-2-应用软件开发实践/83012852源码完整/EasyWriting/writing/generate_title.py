import os
# os.environ['TF_KERAS'] = '0'
os.environ['CUDA_VISIBLE_DEVICES'] = '-1'
os.environ["TF_KERAS"] = '1'
import pandas as pd
import numpy as np
from tqdm import tqdm
from bert4keras.backend import keras, K
from bert4keras.layers import Loss
from bert4keras.models import build_transformer_model
from bert4keras.tokenizers import Tokenizer, load_vocab
from bert4keras.optimizers import Adam
# from bert4keras.snippets import sequence_padding, open
from bert4keras.snippets import sequence_padding
# from bert4keras.snippets import DataGenerator, AutoRegressiveDecoder
from bert4keras.snippets import DataGenerator
from bert4keras.snippets import AutoRegressiveDecoder
from keras.models import Model
from rouge import Rouge  # pip install rouge
from nltk.translate.bleu_score import sentence_bleu, SmoothingFunction
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense, Activation
from tqdm import tqdm

# from sklearn.model_selection import train_test_split
# from sklearn.model_selection import train_test_split
from writing.keyword_and_summary import *

# 基本参数
maxlen = 512
batch_size = 1
epochs = 1

# bert配置
config_path = 'title_model/chinese_wobert_L-12_H-768_A-12/bert_config.json'
checkpoint_path = 'title_model/chinese_wobert_L-12_H-768_A-12/bert_model.ckpt'
dict_path = 'title_model/chinese_wobert_L-12_H-768_A-12/vocab.txt'




def get_title(content):


    # 加载并精简词表，建立分词器
    token_dict, keep_tokens = load_vocab(
        dict_path=dict_path,
        simplified=True,
        startswith=['[PAD]', '[UNK]', '[CLS]', '[SEP]'],
    )
    tokenizer = Tokenizer(token_dict, do_lower_case=True)

    class CrossEntropy(Loss):
        """交叉熵作为loss，并mask掉输入部分
        """

        def compute_loss(self, inputs, mask=None):
            y_true, y_mask, y_pred = inputs
            y_true = y_true[:, 1:]  # 目标token_ids
            y_mask = y_mask[:, 1:]  # segment_ids，刚好指示了要预测的部分
            y_pred = y_pred[:, :-1]  # 预测序列，错开一位
            loss = K.sparse_categorical_crossentropy(y_true, y_pred)
            loss = K.sum(loss * y_mask) / K.sum(y_mask)
            return loss

    model = build_transformer_model(
        config_path,
        checkpoint_path,
        application='unilm',
        keep_tokens=keep_tokens,  # 只保留keep_tokens中的字，精简原字表
    )

    output = CrossEntropy(2)(model.inputs + model.outputs)

    model = Model(model.inputs, output)
    model.compile(optimizer=Adam(1e-5))

    # model.summary()

    class AutoTitle(AutoRegressiveDecoder):
        """seq2seq解码器
        """

        @AutoRegressiveDecoder.wraps(default_rtype='probas')
        def predict(self, inputs, output_ids, states):
            token_ids, segment_ids = inputs
            token_ids = np.concatenate([token_ids, output_ids], 1)
            segment_ids = np.concatenate([segment_ids, np.ones_like(output_ids)], 1)
            return model.predict([token_ids, segment_ids])[:, -1]

        def generate(self, text, topk=1):
            max_c_len = maxlen - self.maxlen
            token_ids, segment_ids = tokenizer.encode(text, maxlen=max_c_len)
            output_ids = self.beam_search([token_ids, segment_ids],
                                          topk)  # 基于beam search
            return tokenizer.decode(output_ids)

    autotitle = AutoTitle(start_id=None, end_id=tokenizer._token_end_id, maxlen=80)

    model.load_weights('title_model/model2/best_model.weights')
    # model.summary()
    content = get_summer_loc(content)
    pred_title = ' '.join(autotitle.generate(content, 1)).lower()
    pred_title = pred_title.replace(" ", "")
    return pred_title
#


# print('开始对新闻生成标题，输入CTRL + Z，则退出')

# while True:
#     content = input("输入的新闻正文为:")
#     pred_title = get_title(content)
#     # pred_title = ' '.join(autotitle.generate(content, 1)).lower()
#     pred_title = pred_title.replace(" ","")
#     print()
#     print("生成的标题是："+ pred_title)
#     print()
