package ups.info.dcll.convxj;

import java.io.FileNotFoundException;
import ups.info.dcll.convxj.graphicinterface.GUI;

/**
 *
 * @author Racim Fahssi
 * @author Alexis Paoleschi
 *
 */
public final class Main {

    /**
     * Classe utilitaire.
     * Constructeur prive
     *
     */
    private Main() {  }

    /**
     * Fonction principale.
     *
     * @param args parametre du main.
     * @throws FileNotFoundException si erreur
     */
    public static void main(final String[] args) throws FileNotFoundException {
        GUI gui = new GUI();
        gui.setVisible(true);
    }
}
