package ups.info.dcll.convxj;

import java.io.InputStream;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;
import org.apache.commons.io.IOUtils;
import ups.info.dcll.convxj.xmltojson.XmlToJson;

/**
 *
 * @author Racim Fahssi
 */
public class Main {

    public static void main(String[] args) throws Exception {
        XmlToJson xTj=new XmlToJson();
        xTj.convert();
    }
    private static final String xmlFile = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
            + "<important-data certified=\"true\" processed=\"true\">\n"
            + "  <timestamp>232423423423</timestamp>\n"
            + "  <authors>\n"
            + "    <author>\n"
            + "      <firstName>Tim</firstName>\n"
            + "      <lastName>Leary</lastName>\n"
            + "    </author>\n"
            + "  </authors>\n"
            + "  <title>Flashbacks</title>\n"
            + "  <shippingWeight>1.4 pounds</shippingWeight>\n"
            + "  <isbn>978-0874778700</isbn>\n"
            + "</important-data>";
}
