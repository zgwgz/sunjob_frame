package test;

import jdk.internal.util.xml.XMLStreamException;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

/**
 * xml的解析
 */
public class TestXml {


    @Test
    public  void testCreatXml() throws XMLStreamException, IOException {
        //使用dom4j创建一个xml文件
        //创建一个document对象
        Document document= DocumentHelper.createDocument();

        //创建根节点
        Element root = document.addElement("books");

        //创建子节点
        Element book1 = root.addElement("book");
        //设置属性
        book1.addAttribute("show","yes");
        book1.addAttribute("id","20");
        book1.setText("钟国威");

        XMLWriter xmlWriter=new XMLWriter(new FileWriter("d://sunjob/a.xml"), OutputFormat.createPrettyPrint());
        xmlWriter.write(document);
        xmlWriter.close();
    }
    @Test
    public void test02() throws DocumentException {
        //创建 saxrreader对象
        SAXReader saxReader=new SAXReader();
        //获取文档对象
        Document document = saxReader.read(new File("d://sunjob/a.xml"));
        System.out.println(document);

        Document document1 = document.getDocument();
        //获取根标签
        Element root = document.getRootElement();
        System.out.println(root);

    }
}
