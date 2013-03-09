package ups.info.dcll.convxj.jsontoxml;

import static org.junit.Assert.*;

import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;

public class TestJsonToXml {
	protected JsonToXml jtx;

//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}

	@Before
	public void setUp() throws Exception {
		jtx = new JsonToXml();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvert() {
		assertTrue(true);
	}

}
