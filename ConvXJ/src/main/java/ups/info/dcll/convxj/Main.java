package ups.info.dcll.convxj;

import java.io.FileNotFoundException;

import ups.info.dcll.convxj.graphicinterface.GUI;
/**
 * 
 * @author Racim Fahssi
 * @author Alexis Paoleschi
 * 
 */
public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        String s="text.xml";
        String ext = s.substring(s.lastIndexOf("."));
        System.out.println(ext);
		GUI gui = new GUI();
		gui.setVisible(true);
    }
}
