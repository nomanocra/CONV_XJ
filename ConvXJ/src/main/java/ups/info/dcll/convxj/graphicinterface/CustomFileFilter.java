package ups.info.dcll.convxj.graphicinterface;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 * @author Alexis Paoleschi
 * @author Racim Fahssi
 */

//Classe du filtre de fichier personnalisé aux fichiers de type JSON et XML
public class CustomFileFilter extends FileFilter {

    /**
     * @param fileChooser jfilechooser qui utilise ce filtre
     */
    private CustomFileChooser fileChooser;
    /**
     * @param EXT_JSON extension json
     */
    private static final String EXT_JSON = "json";
    /**
     * @param EXT_XML extension xml
     */
    private static final String EXT_XML = "xml";

    /**
     * Constructeur.
     *
     * @param fc le jfilechooser qui utilise ce filtre
     */
    public CustomFileFilter(final CustomFileChooser fc) {
        super();
        this.fileChooser = fc;
    }

    /**
     * Méthode d'acceptation des fichiers XML ou JSON.
     *
     * @param f le contenu du fichier xml à convertir.
     * @return true si c'est un dossier ou bien le fichier du bon type
     */
    @Override
    public final boolean accept(final File f) {
        if (f.isDirectory()) {
            return true;
        }
        String nomFichier = f.getName().toLowerCase();
        //Cas des fichiers JSON
        if (fileChooser.getExtension().equals("json")) {
            return nomFichier.endsWith(EXT_JSON);
        }

        //Cas des fichiers XML
        if (fileChooser.getExtension().equals("xml")) {
            return nomFichier.endsWith(EXT_XML);
        }

        //Autre types de fichiers
        return false;
    }

    /**
     *
     * @return la description de l'extension associé.
     */
    @Override
    public final String getDescription() {
        return "Fichiers de type " + fileChooser.getExtension();
    }
}
