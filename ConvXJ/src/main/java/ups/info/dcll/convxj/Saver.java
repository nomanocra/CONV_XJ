package ups.info.dcll.convxj;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.StringTokenizer;

class Saver {

    /**
     * Enregistre le texte en xml dans un fichier
     *
     * @param path le path où stocker le fichier
     * @param content
     *            contient le text à écrire dans le fichier
     * @return return true si tout c'est bien passé
     * lève une exception sinon
     */
    public static boolean save(final String path, final String content) {
        String newUrl = makePath(path, "xml");
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
     * @param path
     *            path du fichier parsé
     * @param newExt
     *            extention du fichier à enregistrer
     * @return le path du fichier avec le même nom et la nouvelle extension
     */
    public static String makePath(final String path, final  String newExt) {

        StringTokenizer st = new StringTokenizer(path, ".");
        String newUrl = "";
        int nbToken = st.countTokens();

        for (int i = 0; i < nbToken - 1; i++) {
            newUrl += st.nextToken() + ".";
        }

        newUrl += newExt;

        return newUrl;

    }
    
    public static String load(final String path) {
    	String content = null;
    	try {
    		BufferedInputStream in = new BufferedInputStream(new FileInputStream(path));
    		StringWriter out = new StringWriter();
    		int b;
    		while ((b=in.read()) != -1)
    			out.write(b);
    		out.flush();
    		out.close();
    		in.close();
    		content = new String(out.toString());
    	}
    	catch (IOException ie) {
    	         ie.printStackTrace(); 
    	}
		return content;
    }
}
