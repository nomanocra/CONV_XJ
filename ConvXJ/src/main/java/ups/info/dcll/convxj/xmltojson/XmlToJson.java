package ups.info.dcll.convxj.xmltojson;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

/**
 *
 * @author Racim Fahssi
 * @author Alexis Paoleschi
 * 
 */
public class XmlToJson {

	/**
     * @param textXml contient le XML à parser
     * @param xmlSerializer est le parser
     */
    private String textXml;
    private XMLSerializer xmlSerializer;

    /**
     *
     * @param xml le xml à parser
     */
    public XmlToJson(final String xml) {
        this.textXml = xml;
        this.xmlSerializer = new XMLSerializer();
    }
	
    public XmlToJson() {
        xmlSerializer = new XMLSerializer();
    }
    
    //fonction qui prend qui convertie le fichier XML_FILE en json, et l'affiche
    //à l'écran (pour l'instant on l'utilise pour le debug)
    public String convert() {
        JSON json = xmlSerializer.read(textXml);
        System.out.println(json.toString(2));
        return json.toString(2);
    }
        //exemple de fichier xml, pour faire le teste
    public static final String XML_FILE = "<?xml version=\"1.0\" "
            + "encoding=\"UTF-8\"?>\n"
            + "<films>\n"
            + "    <realisateur id_realisateur=\"real_01\">\n"
            + "        <prenom>Martin</prenom>\n"
            + "        <nom>Scorsese</nom>\n"
            + "    </realisateur>\n"
            + "    <realisateur id_realisateur=\"real_02\">\n"
            + "        <prenom>Quentin</prenom>\n"
            + "        <nom>Tarantino</nom>\n"
            + "    </realisateur>\n"
            + "    <realisateur id_realisateur=\"real_03\">\n"
            + "        <prenom>Steven</prenom>\n"
            + "        <nom>Spielberg</nom>\n"
            + "    </realisateur>\n"
            + "    <film id_film=\"film_01\" id_realisateur=\"real_03\" "
            + "annee=\"2001\">\n"
            + "        <titre>Minority Report</titre>\n"
            + "        <resume>\n"
            + "            <text>Un homme est victime d'une machination. "
            + "Il est pris au piège d'un système qu'il a l'habitude de "
            + "controler.</text>\n"
            + "        </resume>\n"
            + "    </film>\n"
            + "    <film id_film=\"film_02\" id_realisateur=\"real_02\" "
            + "annee=\"2003\">\n"
            + "        <titre>Kill Bill</titre>\n"
            + "        <resume>\n"
            + "            <image source=\"killbill.jpg\"/>\n"
            + "            <text>Une femme se venge des personnes qui ont "
            + "voulu l'assassiner.</text>\n"
            + "        </resume>\n"
            + "    </film>\n"
            + "    <film id_film=\"film_03\" id_realisateur=\"real_01\" "
            + "annee=\"1995\">\n"
            + "        <titre>Casino</titre>\n"
            + "        <resume>\n"
            + "            <image source=\"deniro.jpg\"/>\n"
            + "            <text>Le monde de la mafia italienne mêlée à celui "
            + "des casinos...</text>\n"
            + "        </resume>\n"
            + "    </film>\n"
            + "    <film id_film=\"film_04\" id_realisateur=\"real_01\" "
            + "annee=\"1990\">\n"
            + "        <titre>Les affranchis</titre>\n"
            + "        <resume>\n"
            + "            <text>Inspiré d'un fait réel : histoire de mafia "
            + "italienne.</text>\n"
            + "        </resume>\n"
            + "    </film>\n"
            + "</films>";
}
