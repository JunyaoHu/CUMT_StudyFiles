from textrank4zh import TextRank4Keyword, TextRank4Sentence


def get_summer_loc(text):
    str = ""
    tr4w = TextRank4Keyword()

    tr4w.analyze(text=text, lower=True, window=2)  # py2中text必须是utf8编码的str或者unicode对象，py3中必须是utf8编码的bytes或者str对象

    # print( '关键词：' )
    for item in tr4w.get_keywords(10, word_min_len=1):
        str = str + item.word + ","
        # print(item.word, item.weight)

    # print()
    # print( '关键短语：' )
    for phrase in tr4w.get_keyphrases(keywords_num=20, min_occur_num=2):
        str = str + phrase + ","
        # print(phrase)

    tr4s = TextRank4Sentence()
    tr4s.analyze(text=text, lower=True, source='all_filters')
    str = str + "。"
    # print()
    # print( '摘要：' )
    for item in tr4s.get_key_sentences():
        str = str + item.sentence + "。"
        # print(item.index, item.weight, item.sentence)

    # print()
    return str


def get_summer(text):
    str = ""
    tr4s = TextRank4Sentence()
    tr4s.analyze(text=text, lower=True, source='all_filters')
    # str = str + "。"
    # print()
    # print( '摘要：' )
    # for item in tr4s.get_key_sentences(num=5):
    for item in tr4s.get_key_sentences():
        str = str + item.sentence + "。"
        # print(item.index, item.weight, item.sentence)

    # print()
    # print(str)
    return str


def get_key(text):
    str = []
    tr4w = TextRank4Keyword()

    tr4w.analyze(text=text, lower=True, window=2)  # py2中text必须是utf8编码的str或者unicode对象，py3中必须是utf8编码的bytes或者str对象

    # print('关键词：')
    # for item in tr4w.get_keywords(10, word_min_len=2):
    #     str.append(item.word)
    # print(item.word, item.weight)

    # print()
    # print('关键短语：')
    for phrase in tr4w.get_keyphrases(keywords_num=20, min_occur_num=2):
        str.append(phrase)
        # str = str + phrase + ","
        # print(phrase)

    # print()
    # print(str)
    return str
