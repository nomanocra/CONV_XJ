package ups.info.dcll.convxj.jsontoxml;

import static org.junit.Assert.*;

import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;

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
		jtx = new JsonToXml(textJSON,urlEnd);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvert() {
		assertEquals(jtx.convert(), "TODO MATHIEU");
	}
	
	@Test
	public void testSave() {
		assertTrue(jtx.save("oui"));
	}
	
	@Test
	public void testmakeUrl() {
		assertEquals("oui.json",jtx.makeUrl("oui.xml"));
	}

}
