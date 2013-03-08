package ups.info.dcll.convxj.jsontoxml;

import java.io.IOException;
import java.io.InputStream;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;
import net.sf.json.xml.XMLSerializer;

import org.apache.commons.io.IOUtils;

/**
 *
 * @author Legrand Mathieu
 * @author Mercier Guillaume
 * 
 */

// Inspiré de
// http://answers.oreilly.com/topic/279-how-to-convert-json-to-xml-in-java

public class JsonToXml {

	public void convert() throws IOException {
		InputStream is = JsonToXml.class.getResourceAsStream("moodle.json");
		String jsonData = IOUtils.toString(is);

		XMLSerializer serializer = new XMLSerializer();
		JSON json = JSONSerializer.toJSON(jsonData);

		serializer.setRootName("Root");
        serializer.setTypeHintsEnabled(false);
        String xml = serializer.write( json );  
        System.out.println(xml);
	}

}
