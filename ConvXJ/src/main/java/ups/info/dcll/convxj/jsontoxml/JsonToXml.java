package ups.info.dcll.convxj.jsontoxml;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;
import net.sf.json.xml.XMLSerializer;

/**
 *
 * @author Legrand Mathieu
 * @author Mercier Guillaume
 *
 */

// Inspiré de
// http://answers.oreilly.com/topic/279-how-to-convert-json-to-xml-in-java

public class JsonToXml {

    /**
     * @param xmlSerializer est le parser
     */
    private XMLSerializer serializer = new XMLSerializer();

    /**
     * constructeur
     */
    public JsonToXml() {
    	serializer = new XMLSerializer();
    }

    /**
     *
     * @return un String contenant du xml
     */
    public final String convert(String textJson) {
        JSON json = JSONSerializer.toJSON(textJson);

        serializer.setTypeHintsEnabled(false);
        serializer.setRootName("root");
        serializer.setTypeHintsEnabled(false);

        String xml = serializer.write(json);
        return xml;
    }

}
