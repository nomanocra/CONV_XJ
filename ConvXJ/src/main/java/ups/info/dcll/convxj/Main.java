package ups.info.dcll.convxj;

import ups.info.dcll.convxj.xmltojson.XmlToJson;
import ups.info.dcll.convxj.jsontoxml.JsonToXml;
/**
 * 
 * @author Racim Fahssi
 * @author Alexis Paoleschi
 * 
 */
public class Main {

    public static void main(String[] args) {
        XmlToJson xTj = new XmlToJson();
        xTj.convert();

        String url = "moodle.json";
        String newPath = Saver.makePath(url, "xml");
        String textJSON = xTj.convert();

        JsonToXml jTx = new JsonToXml(textJSON);

        String xml = jTx.convert();

        System.out.println(textJSON);
        System.out.println(xml);

        Saver.save(newPath, xml);
    }
}
