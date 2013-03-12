package ups.info.dcll.convxj.graphicinterface;

import java.io.File;

import javax.swing.JFileChooser;

/**
 *
 * @author Alexis Paoleschi
 *
*/
//Classe de choix de fichier personnalisé à un type de fichier
public class CustomFileChooser extends JFileChooser {

    /**
     * @param extension Extension du type de fichier désiré
     */
    private String extension;

    /**
     * Constructeur du filechooser.
     *
     * @param ext pour selectionner le type de fichier voulu.
     * @param titre le titre de la fenetre.
     *
     */
    public CustomFileChooser(final String ext, final String titre) {
        super();
        this.extension = ext;
        //Une sélection de multiples fichiers n'a pas lieu d'être
        this.setMultiSelectionEnabled(false);
        this.setDialogTitle(titre);
        //On définit le dossier de base au package "files"
        //contenant tous les fichiers nécessaires au parsing
        this.setCurrentDirectory(
                new File(".\\src\\main\\resources\\ups\\info\\dcll\\convxj\\"));

        //On empêche le choix de tous les fichiers
        this.setAcceptAllFileFilterUsed(false);

        //On applique le filtre de fichier personnalisé
        this.addChoosableFileFilter(new CustomFileFilter(this));

        this.setAcceptAllFileFilterUsed(false);
    }

    /**
     *
     * @return l'extension
     *
     */
    public final String getExtension() {
        return extension;
    }
}
