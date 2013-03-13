package ups.info.dcll.convxj;

import ups.info.dcll.convxj.Saver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestSaver
    extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestSaver( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestSaver.class );
    }

    /**
     * Rigourous Test
     */
        
    public void testMakeUrl()
    {
        assertEquals("moodle.xml",Saver.makePath("moodle.json", "xml"));
    }
    
    public void testSave() throws FileNotFoundException
    {
        String content = "blabla\nblibli\nbloblo\n";
        String path = "testSave";
        
        Saver.save(path,content);
        
        Scanner scanner = new Scanner(new FileReader(path));
        String str = "";
        while (scanner.hasNextLine()) {
            str += scanner.nextLine()+"\n";            
        }
        scanner.close();
        File MyFile = new File("testSave");
        MyFile.delete(); 
        assertEquals(content,str);
    }
    
    public void testLoad() throws FileNotFoundException
    {
        String str = "bla\nbli\nblo\n";
        assertEquals(str, Saver.load("testLoad"));
    }
    
}
