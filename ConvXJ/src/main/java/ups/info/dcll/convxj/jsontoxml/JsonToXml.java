package ups.info.dcll.convxj.jsontoxml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
	final private String textJson;
	final private String url;

	public JsonToXml(String json, String tempUrl) {
		this.textJson = json;
		this.url = tempUrl;
	}

	/**
	 * 
	 * @return
	 */
	public final String convert() {
		XMLSerializer serializer = new XMLSerializer();
		JSON json = JSONSerializer.toJSON(textJson);
		serializer.setRootName("root");
		serializer.setTypeHintsEnabled(false);
		String xml = serializer.write(json);
		return xml;
	}

	/**
	 * Enregistre le texte en xml dans un fichier
	 * 
	 * @param xml
	 * @return
	 */
	public final boolean save(String xml) {
		String newUrl = makeUrl(url);
		try {
			FileWriter fw = new FileWriter(newUrl, false);
			BufferedWriter bf = new BufferedWriter(fw);
			bf.write(xml);
			bf.flush();
			bf.close();
		} catch (IOException io) {
			System.out.println("ERREUR : " + io);
		}

		System.out.println("Le fichier a été sauvegardé à l'adresse : "
				+ newUrl);
		return true;
	}

	/**
	 * Modifie l'extension du fichier de .xml a .json
	 * 
	 * @param url
	 * @return
	 */
	protected final String makeUrl(String url) {
		return null;
	}
}
