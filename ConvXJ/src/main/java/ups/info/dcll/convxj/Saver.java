package ups.info.dcll.convxj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class Saver {

    /**
     * Enregistre le texte en xml dans un fichier
     *
     * @param url l'url où stocker le fichier
     * @param content
     *            contient le text à écrire dans le fichier
     * @return return true si tout c'est bien passé
     * lève une exception sinon
     */
    public static boolean save(final String url, final String content) {
        String newUrl = makeUrl(url, "xml");
        try {
            FileWriter fw = new FileWriter(newUrl, false);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write(content);
            bf.flush();
            bf.close();
        } catch (IOException io) {
            System.out.println("ERREUR : " + io);
        }

        System.out.println("Le fichier a été sauvegardé à l'adresse : "
                + newUrl);
        return true;
    }

    /**
     * Modifie l'extension du fichier de .xml a .json
     *
     * @param url
     *            url du fichier parsé
     * @param newExt
     *            extention du fichier à enregistrer
     * @return l'url du fichier avec le même nom et la nouvelle extension
     */
    public static String makeUrl(final String url, final  String newExt) {

        StringTokenizer st = new StringTokenizer(url, ".");
        String newUrl = "";
        int nbToken = st.countTokens();

        for (int i = 0; i < nbToken - 1; i++) {
            newUrl += st.nextToken() + ".";
        }

        newUrl += newExt;

        return newUrl;

    }
}
