package Factory.Example1;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class ReadXML1 {
    public static Object getObject(){
        try{
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("src/AbstractFactory/config1.xml"));
            NodeList n1=doc.getElementsByTagName("className");
            Node classNode=n1.item(0).getFirstChild();
            String cName =  "Factory.Example1."+classNode.getNodeValue();
            Class<?> c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
