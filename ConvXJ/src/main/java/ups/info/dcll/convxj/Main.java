package ups.info.dcll.convxj;

import ups.info.dcll.convxj.xmltojson.XmlToJson;
import ups.info.dcll.convxj.jsontoxml.JsonToXml;
/**
 *
 * @author Racim Fahssi
 */
public class Main {

    public static void main(String[] args) throws Exception {
        XmlToJson xTj=new XmlToJson();
        xTj.convert();
        
        JsonToXml jTx = new JsonToXml();
        
        jTx.convert();
    }
}
