package ups.info.dcll.convxj.graphicinterface;

import java.io.File;

/**
* @author Alexis Paoleschi
* @mail alexis.paoleschi@gmail.com
*/

//Classe des fichiers de type personnalisé
public class CustomFileType {
	//Définitions des extensions intéressantes au choix de fichiers personnalisé
    public final static String json = "json";
    public final static String xml = "xml";

    //Méthode de récupération de l'extension d'un fichier
    public static String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }
}
