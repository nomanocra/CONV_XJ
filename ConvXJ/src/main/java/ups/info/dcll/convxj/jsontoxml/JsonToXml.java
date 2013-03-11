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
     * @param textJson contient le JSON à parser
     */
    private String textJson;

    /**
     *
     * @param json le json à parser
     */
    public JsonToXml(final String json) {
        this.textJson = json;
    }

    /**
     *
     * @return un String contenant du xml
     */
    public final String convert() {
        XMLSerializer serializer = new XMLSerializer();
        JSON json = JSONSerializer.toJSON(textJson);

        serializer.setTypeHintsEnabled(false);
        serializer.setRootName("root");
        serializer.setTypeHintsEnabled(false);

        String xml = serializer.write(json);
        return xml;
    }

}
