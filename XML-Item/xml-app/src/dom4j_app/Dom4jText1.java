package dom4j_app;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.InputStream;
import java.util.List;

public class Dom4jText1 {
    @Test
    public void Test() throws DocumentException {
        SAXReader reader = new SAXReader();
        InputStream in = Dom4jText1.class.getResourceAsStream("/Contacts.xml");
        Document doc = reader.read(in);
        Element element = doc.getRootElement();
        System.out.println(element.getName());
        List<Element> elements = element.elements();
//        elements.forEach(e-> System.out.println(e.getName()));
        elements.forEach(e-> {
            System.out.println(e.getName());
            e.elements().forEach(t-> System.out.println(t.getName()+"="+t.getTextTrim()));});
    }
}
