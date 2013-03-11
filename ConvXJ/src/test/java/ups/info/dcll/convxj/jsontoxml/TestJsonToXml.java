package ups.info.dcll.convxj.jsontoxml;

import static org.junit.Assert.*;

import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;

import ups.info.dcll.convxj.xmltojson.XmlToJson;

public class TestJsonToXml {
	protected JsonToXml jtx;
	protected String textJSON;
	protected String urlEnd;

//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}

	@Before
	public void setUp() throws Exception {
		textJSON = "";
		urlEnd = "";
		jtx = new JsonToXml();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvert() {
		
	}
	
	private String getXML(){
		return
			"<quiz>" +
			"<!-- question: 0 -->" +
			"<question type=\"category\">" +
			"<category>" +
			"<text>$course$/Défaut pour 1SA3GL1</text>" +
			"</category>" +
			"</question>" +
			"<!-- question: 37095 -->" +
			"<question type=\"calculated\">" +
			"<name><text>Aire du cercle</text></name>" +
			"<questiontext format=\"moodle_auto_format\">" +
			"<text>Calcul de l'aire du cercle ayant pour rayon {R}</text>" +
			"</questiontext>" +
			"<image />" +
			"</question>" +
			"<!-- question: 37096 -->" +
			"<question type=\"description\">" +
			"<name><text>Consigne dispositif électronique</text></name>" +
			"<questiontext format=\"moodle_auto_format\">" +
			"<text>Pas de calculatrice !</text>" +
			"</questiontext>" +
			"<image />" +
			"<generalfeedback><text /></generalfeedback>" +
			"<defaultgrade>0</defaultgrade>" +
			"<penalty>0</penalty>" +
			"<hidden>0</hidden>" +
			"<shuffleanswers>0</shuffleanswers>" +
			"</question>" +
			"</quiz>";
	}
	
	private String getJSON(){
		return 
			"{" +
			"\"quiz\": {" +
		    "\"question\": [" +
		    "{" +
		    "\"-type\": \"category\"," +
		    "\"category\": { \"text\": \"$course$/Défaut pour 1SA3GL1\" }" +
		    "}," +
		    "{" +
		    "\"-type\": \"calculated\"," +
		    "\"name\": { \"text\": \"Aire du cercle\" }," +
		    "\"questiontext\": {" +
		    "\"-format\": \"moodle_auto_format\"," +
		    "\"text\": \"Calcul de l'aire du cercle ayant pour rayon {R}\"" +
		    "}" +
		    "}," +
		    "{" +
		    "\"-type\": \"description\"," +
		    "\"name\": { \"text\": \"Consigne dispositif électronique\" }," +
		    "\"questiontext\": {" +
		    "\"-format\": \"moodle_auto_format\"," +
		    "\"text\": \"Pas de calculatrice !\"" +
		    "}," +
		    "\"generalfeedback\": {}," +
		     "\"defaultgrade\": \"0\"," +
		     "\"penalty\": \"0\"," +
		     "\"hidden\": \"0\"," +
		     "\"shuffleanswers\": \"0\"" +
		     "}" +
		     "]" +
		  	 "}" +
			 "}" +
			 "}";
	}
}
