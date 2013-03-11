package ups.info.dcll.convxj;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;

import ups.info.dcll.convxj.jsontoxml.JsonToXml;

public class TestSaver {
    @Before
    public void setUp() throws Exception {
        
    }

    @After
    public void tearDown() throws Exception {
    }

    
    public void testMakeUrl()
    {
        assertEquals("moodle.xml",Saver.makeUrl("moodle.json", "xml"));
    }
    
    public void testSave() throws FileNotFoundException
    {
        String content = "blabla\nblibli\nbloblo";
        String path = "testSave";
        
        Saver.save(path,content);
        
        Scanner scanner = new Scanner(new FileReader(path));
        String str = null;
        while (scanner.hasNextLine()) {
            str += scanner.nextLine();            
        }
        
        assertEquals(content,str);
    }
}
