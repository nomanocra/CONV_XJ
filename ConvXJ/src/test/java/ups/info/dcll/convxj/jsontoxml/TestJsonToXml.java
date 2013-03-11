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
		jtx = new JsonToXml(textJSON);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvert() {
		
		String textXML = jtx.convert();
		XmlToJson xTj=new XmlToJson();
        String textJ = xTj.convert();        
        JsonToXml testjTx = new JsonToXml(textJ);
        
		assertEquals(textXML, testjTx.convert());
	}	

}
