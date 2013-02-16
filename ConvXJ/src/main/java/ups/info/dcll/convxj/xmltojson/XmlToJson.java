package ups.info.dcll.convxj.xmltojson;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

/**
 *
 * @author Racim Fahssi
 */
public class XmlToJson {

    private XMLSerializer xmlSerializer;

    public XmlToJson() {
        xmlSerializer = new XMLSerializer();
    }

    public void convert() {
        JSON json = xmlSerializer.read(xmlFile);
        System.out.println(json.toString(2));
    }
    private static final String xmlFile = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
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
            + "    <film id_film=\"film_01\" id_realisateur=\"real_03\" annee=\"2001\">\n"
            + "        <titre>Minority Report</titre>\n"
            + "        <resume>\n"
            + "            <text>Un homme est victime d'une machination. Il est pris au piège d'un système qu'il a l'habitude de controler.</text>\n"
            + "        </resume>\n"
            + "    </film>\n"
            + "    <film id_film=\"film_02\" id_realisateur=\"real_02\" annee=\"2003\">\n"
            + "        <titre>Kill Bill</titre>\n"
            + "        <resume>\n"
            + "            <image source=\"killbill.jpg\"/>\n"
            + "            <text>Une femme se venge des personnes qui ont voulu l'assassiner.</text>\n"
            + "        </resume>\n"
            + "    </film>\n"
            + "    <film id_film=\"film_03\" id_realisateur=\"real_01\" annee=\"1995\">\n"
            + "        <titre>Casino</titre>\n"
            + "        <resume>\n"
            + "            <image source=\"deniro.jpg\"/>\n"
            + "            <text>Le monde de la mafia italienne mêlée à celui des casinos...</text>\n"
            + "        </resume>\n"
            + "    </film>\n"
            + "    <film id_film=\"film_04\" id_realisateur=\"real_01\" annee=\"1990\">\n"
            + "        <titre>Les affranchis</titre>\n"
            + "        <resume>\n"
            + "            <text>Inspiré d'un fait réel : histoire de mafia italienne.</text>\n"
            + "        </resume>\n"
            + "    </film>\n"
            + "</films>";
}
