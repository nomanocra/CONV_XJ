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

<<<<<<< HEAD
    public static void main(String[] args) {
        XmlToJson xTj = new XmlToJson();
        xTj.convert();

        String url = "moodle.json";
        String newPath = Saver.makePath(url, "xml");
        String textJSON = xTj.convert();

        JsonToXml jTx = new JsonToXml(textJSON);

        String xml = jTx.convert();

        System.out.println(textJSON);
        System.out.println(xml);

        Saver.save(newPath, xml);
=======
    public static void main(String[] args) throws FileNotFoundException {
		GUI gui = new GUI();
		gui.setVisible(true);
>>>>>>> eeb86d387fd572d6e1f721380b2c969eb06790de
    }
}
