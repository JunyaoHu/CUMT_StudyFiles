package com.example.xml2word;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.FileOutputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class MainActivity extends AppCompatActivity {
    private Button button = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String content = "";

                    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder builder = factory.newDocumentBuilder();
                    InputStream inputStream = getResources().openRawResource(R.raw.goods);
                    Document doc = builder.parse(inputStream);
                    Element element = doc.getDocumentElement();
                    NodeList goodsNodes = element.getElementsByTagName("goods");
                    for (int i = 0; i < goodsNodes.getLength(); i++) {
                        Element goodsElement = (Element) goodsNodes.item(i);
                        content += "---------商品介绍---------\n";
                        content += "商品：" + goodsElement.getAttribute("name") + "\n";
                        NodeList aGoodsNodes = goodsElement.getChildNodes();
                        for (int j = 0; j < aGoodsNodes.getLength(); j++) {
                            if (aGoodsNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                if ("type".equals(aGoodsNodes.item(j).getNodeName())) {
                                    content += "类型：" + aGoodsNodes.item(j).getFirstChild().getNodeValue() + "\n";
                                } else if ("goodsunit".equals(aGoodsNodes.item(j).getNodeName())) {
                                    content += "单位：" + aGoodsNodes.item(j).getFirstChild().getNodeValue() + "\n";
                                } else {
                                    content += "价格：" + aGoodsNodes.item(j).getFirstChild().getNodeValue() + "\n";
                                }
                            }
                        }
                    }

                    String fileName = "result.doc";
                    System.out.println(content);
                    FileOutputStream fos;
                    fos = openFileOutput(fileName, MODE_PRIVATE);
                    fos.write(content.getBytes());
                    fos.close();
                    Toast.makeText(MainActivity.this, "转换完成"+getFilesDir(), Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    e.printStackTrace();
                }




            }
        });
    }
}