package ups.info.dcll.convxj.xmltojson;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestXmlToJson 
    extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestXmlToJson( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestXmlToJson.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        XmlToJson xTj=new XmlToJson();
        assertEquals(xTj.convert(XML_FILE),JSON_FILE);
    }
    
    
    /**
     * @param XML_FILE exemple de fichier xml, pour faire le teste
     */
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
    
    public static final String JSON_FILE = "{\n" +
"  \"realisateur\":   [\n" +
"        {\n" +
"      \"@id_realisateur\": \"real_01\",\n" +
"      \"prenom\": \"Martin\",\n" +
"      \"nom\": \"Scorsese\"\n" +
"    },\n" +
"        {\n" +
"      \"@id_realisateur\": \"real_02\",\n" +
"      \"prenom\": \"Quentin\",\n" +
"      \"nom\": \"Tarantino\"\n" +
"    },\n" +
"        {\n" +
"      \"@id_realisateur\": \"real_03\",\n" +
"      \"prenom\": \"Steven\",\n" +
"      \"nom\": \"Spielberg\"\n" +
"    }\n" +
"  ],\n" +
"  \"film\":   [\n" +
"        {\n" +
"      \"@id_film\": \"film_01\",\n" +
"      \"@id_realisateur\": \"real_03\",\n" +
"      \"@annee\": \"2001\",\n" +
"      \"titre\": \"Minority Report\",\n" +
"      \"resume\": [\"Un homme est victime d'une machination. Il est pris au piège d'un système qu'il a l'habitude de controler.\"]\n" +
"    },\n" +
"        {\n" +
"      \"@id_film\": \"film_02\",\n" +
"      \"@id_realisateur\": \"real_02\",\n" +
"      \"@annee\": \"2003\",\n" +
"      \"titre\": \"Kill Bill\",\n" +
"      \"resume\":       {\n" +
"        \"image\": {\"@source\": \"killbill.jpg\"},\n" +
"        \"text\": \"Une femme se venge des personnes qui ont voulu l'assassiner.\"\n" +
"      }\n" +
"    },\n" +
"        {\n" +
"      \"@id_film\": \"film_03\",\n" +
"      \"@id_realisateur\": \"real_01\",\n" +
"      \"@annee\": \"1995\",\n" +
"      \"titre\": \"Casino\",\n" +
"      \"resume\":       {\n" +
"        \"image\": {\"@source\": \"deniro.jpg\"},\n" +
"        \"text\": \"Le monde de la mafia italienne mêlée à celui des casinos...\"\n" +
"      }\n" +
"    },\n" +
"        {\n" +
"      \"@id_film\": \"film_04\",\n" +
"      \"@id_realisateur\": \"real_01\",\n" +
"      \"@annee\": \"1990\",\n" +
"      \"titre\": \"Les affranchis\",\n" +
"      \"resume\": [\"Inspiré d'un fait réel : histoire de mafia italienne.\"]\n" +
"    }\n" +
"  ]\n" +
"}";
}
