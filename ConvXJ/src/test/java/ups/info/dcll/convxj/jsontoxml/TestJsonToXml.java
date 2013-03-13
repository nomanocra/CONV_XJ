package ups.info.dcll.convxj.jsontoxml;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestJsonToXml 
    extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestJsonToXml( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestJsonToXml.class );
    }

    /**
     * Rigourous Test
     */
    public void testApp()
    {
        JsonToXml jTx=new JsonToXml();           
        assertEquals(jTx.convert(JSON_FILE),XML_FILE);
    }
    
    
    /**
     * @param XML_FILE exemple de fichier xml, pour faire le teste
     */
    public static final String XML_FILE =

"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+
"<root>\n"+
"  <film>\n"+
"    <e annee=\"2001\" id_film=\"film_01\" id_realisateur=\"real_03\">\n"+
"      <resume>\n"+
"        <e>Un homme est victime d'une machination. Il est pris au piège d'un système qu'il a l'habitude de controler.</e>\n"+
"      </resume>\n"+
"      <titre>Minority Report</titre>\n"+
"    </e>\n"+
"    <e annee=\"2003\" id_film=\"film_02\" id_realisateur=\"real_02\">\n"+
"      <resume>\n"+
"        <image source=\"killbill.jpg\"/>\n"+
"        <text>Une femme se venge des personnes qui ont voulu l'assassiner.</text>\n"+
"      </resume>\n"+
"      <titre>Kill Bill</titre>\n"+
"    </e>\n"+
"    <e annee=\"1995\" id_film=\"film_03\" id_realisateur=\"real_01\">\n"+
"      <resume>\n"+
"        <image source=\"deniro.jpg\"/>\n"+
"        <text>Le monde de la mafia italienne mêlée à celui des casinos...</text>\n"+
"      </resume>\n"+
"      <titre>Casino</titre>\n"+
"    </e>\n"+
"    <e annee=\"1990\" id_film=\"film_04\" id_realisateur=\"real_01\">\n"+
"      <resume>\n"+
"        <e>Inspiré d'un fait réel : histoire de mafia italienne.</e>\n"+
"      </resume>\n"+
"      <titre>Les affranchis</titre>\n"+
"    </e>\n"+
"  </film>\n"+
"  <realisateur>\n"+
"    <e id_realisateur=\"real_01\">\n"+
"      <nom>Scorsese</nom>\n"+
"      <prenom>Martin</prenom>\n"+
"    </e>\n"+
"    <e id_realisateur=\"real_02\">\n"+
"      <nom>Tarantino</nom>\n"+
"      <prenom>Quentin</prenom>\n"+
"    </e>\n"+
"    <e id_realisateur=\"real_03\">\n"+
"      <nom>Spielberg</nom>\n"+
"      <prenom>Steven</prenom>\n"+
"    </e>\n"+
"  </realisateur>\n"+
"</root>\n";

    
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

