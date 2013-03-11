package ups.info.dcll.convxj.graphicinterface;

import java.io.File;

import javax.swing.filechooser.FileFilter;

/**
* @author Alexis Paoleschi
* @mail alexis.paoleschi@gmail.com
*/

//Classe du filtre de fichier personnalisé aux fichiers de type JSON et XML
public class CustomFileFilter extends FileFilter {
	private CustomFileChooser fileChooser;
        private static final String EXT_XML="xml";
        private static final String EXT_JSON="json";
	
	public CustomFileFilter(CustomFileChooser fc) {
		super();
		this.fileChooser = fc;
	}

	//Méthode d'acceptation des fichiers XML ou JSON
	@Override
	public boolean accept(File f) {
	    if (f.isDirectory()) {
	        return true;
	    }
            String nomFichier = f.getName().toLowerCase(); 
            return (nomFichier.endsWith(EXT_XML) || nomFichier.endsWith(EXT_JSON));
	}

	@Override
	public String getDescription() {
		return "Fichiers de type " + fileChooser.getExtension();
	}
}
