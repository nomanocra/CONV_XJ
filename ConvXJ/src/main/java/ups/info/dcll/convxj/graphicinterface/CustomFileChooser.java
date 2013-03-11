package ups.info.dcll.convxj.graphicinterface;

import java.io.File;

import javax.swing.JFileChooser;

/**
* @author Alexis Paoleschi
* @mail alexis.paoleschi@gmail.com
*/

//Classe de choix de fichier personnalisé à un type de fichier
public class CustomFileChooser extends JFileChooser {
	private static final long serialVersionUID = 1L;
	//Extension du type de fichier désiré
	private String extension;

	public CustomFileChooser(final String extension, String titre) {
		super();
		this.extension = extension;
		//Une sélection de multiples fichiers n'a pas lieu d'être
		this.setMultiSelectionEnabled(false);
		this.setDialogTitle(titre);
		//On définit le dossier de base au package "files" contenant tous les fichiers nécessaires au parsing
		this.setCurrentDirectory(new File(".\\src\\main\\resources\\ups\\info\\dcll\\convxj\\"));
		
		//On empêche le choix de tous les fichiers
		this.setAcceptAllFileFilterUsed(false);
		
		//On applique le filtre de fichier personnalisé
		this.addChoosableFileFilter(new CustomFileFilter(this));
		
		this.setAcceptAllFileFilterUsed(false);
	}

	public String getExtension() {
		return extension;
	}
}

