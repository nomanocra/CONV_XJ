/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.info.dcll.convxj.graphicinterface;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import net.sf.json.JSONException;
import ups.info.dcll.convxj.Saver;
import ups.info.dcll.convxj.jsontoxml.JsonToXml;
import ups.info.dcll.convxj.xmltojson.XmlToJson;

/**
 *
 * @author David Duprat
 * @author Racim Fahssi
 * @author Alexis Paoleschi
 *
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI.
     */
    /**
     * @param xmlActive
     */
    private boolean xmlActive;
    /**
     * @param jsonActive
     */
    private boolean jsonActive;
    /**
     * @param textXml
     * @param textJson
     */
    private String textXml, textJson;
    /**
     * @param xmlPath
     * @param jsonPath
     */
    private String xmlPath, jsonPath;
    /**
     * @param backGroundText
     * @param borderColor
     */
    private Color backGroundText, borderColor;

    /**
     * Constructeur.
     *
     * @throws FileNotFoundException si erreur
     */
    public GUI() throws FileNotFoundException {
        initComponents();
        xmlActive = false;
        jsonActive = false;
        backGroundText = new Color(CONST248, CONST248, CONST248);
        borderColor = new Color(CONST102, CONST102, CONST255);
    }

    /**
     * initialisation des composants graphiques.
     *
     */
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        boutonImportXml = new javax.swing.JButton();
        boutonImportJson = new javax.swing.JButton();
        fieldXmlPath = new javax.swing.JTextField();
        fieldJsonPath = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollJson = new javax.swing.JScrollPane();
        textAreaJson = new javax.swing.JTextArea();
        jScrollXml = new javax.swing.JScrollPane();
        textAreaXml = new javax.swing.JTextArea();
        boutonConvXJ = new javax.swing.JButton();
        boutonConvJX = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        boutonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boutonImportXml.setText("import XML");
        boutonImportXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                boutonImportXmlActionPerformed();
            }
        });

        boutonImportJson.setText("import JSON");
        boutonImportJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                boutonImportJsonActionPerformed();
            }
        });

        fieldXmlPath.setEditable(false);
        fieldXmlPath.setBackground(new Color(CONST249, CONST249, CONST249));
        fieldXmlPath.setText("C:/");

        fieldJsonPath.setEditable(false);
        fieldJsonPath.setBackground(new Color(CONST247, CONST247, CONST247));
        fieldJsonPath.setText("C:/");

        initJPanel1Layout();

        textAreaJson.setBackground(new Color(CONST249, CONST249, CONST249));
        textAreaJson.setColumns(CONST20);
        textAreaJson.setRows(CONST5);
        textAreaJson.setBorder(null);
        jScrollJson.setViewportView(textAreaJson);

        textAreaXml.setBackground(new Color(CONST249, CONST249, CONST249));
        textAreaXml.setColumns(CONST20);
        textAreaXml.setRows(CONST5);
        jScrollXml.setViewportView(textAreaXml);

        boutonConvXJ.setText("XML -> JSON");
        boutonConvXJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                boutonConvXJActionPerformed();
            }
        });

        boutonConvJX.setText("XML <- JSON");
        boutonConvJX.setBorder(null);
        boutonConvJX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                boutonConvJXActionPerformed();
            }
        });

        initJPanel2Layout();

        boutonSave.setText("SaveAs");
        boutonSave.setEnabled(false);
        boutonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                boutonSaveActionPerformed();
            }
        });

        initJPanel3Layout();

        initLayout();

        pack();
    }

    /**
     * fonction initLayout. Initialise l'interface.
     *
     */
    private void initLayout() {
        javax.swing.GroupLayout layout =
                new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(
                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(
                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE)));
    }

    /**
     * fonction initJPanel1Layout. Initialise la partie haute de l'interface.
     */
    private void initJPanel1Layout() {
        javax.swing.GroupLayout jPanel1Layout =
                new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boutonImportXml)
                .addPreferredGap(
                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldXmlPath,
                javax.swing.GroupLayout.PREFERRED_SIZE, CONST289,
                javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(
                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boutonImportJson)
                .addPreferredGap(
                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldJsonPath,
                javax.swing.GroupLayout.PREFERRED_SIZE, CONST287,
                javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap()));

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
                new java.awt.Component[]{boutonImportJson, boutonImportXml});

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(CONST22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(boutonImportJson)
                .addComponent(fieldXmlPath,
                javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(fieldJsonPath,
                javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(boutonImportXml,
                javax.swing.GroupLayout.PREFERRED_SIZE, CONST41,
                javax.swing.GroupLayout.PREFERRED_SIZE))));

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL,
                new java.awt.Component[]{boutonImportJson, boutonImportXml});
    }

    /**
     * fonction initJPanel2Layout. Initialise la partie centrale de l'interface.
     *
     */
    private void initJPanel2Layout() {
        javax.swing.GroupLayout jPanel2Layout =
                new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollXml, javax.swing.GroupLayout.DEFAULT_SIZE,
                CONST387, Short.MAX_VALUE)
                .addPreferredGap(
                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(boutonConvJX,
                javax.swing.GroupLayout.DEFAULT_SIZE, CONST111, Short.MAX_VALUE)
                .addComponent(boutonConvXJ,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(
                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollJson,
                javax.swing.GroupLayout.DEFAULT_SIZE, CONST388, Short.MAX_VALUE)
                .addContainerGap()));

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
                new java.awt.Component[]{boutonConvJX, boutonConvXJ});

        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(CONST71, CONST71, CONST71)
                .addComponent(boutonConvXJ,
                javax.swing.GroupLayout.PREFERRED_SIZE, CONST31,
                javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(CONST86, CONST86, CONST86)
                .addComponent(boutonConvJX,
                javax.swing.GroupLayout.PREFERRED_SIZE, CONST32,
                javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(CONST203, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollJson)
                .addComponent(jScrollXml))
                .addContainerGap()));
    }

    /**
     * fonction initJPanel3Layout. Initialise la partie inférieure de
     * l'interface.
     */
    private void initJPanel3Layout() {
        javax.swing.GroupLayout jPanel3Layout =
                new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(CONST353, CONST353, CONST353)
                .addComponent(boutonSave,
                javax.swing.GroupLayout.PREFERRED_SIZE, CONST216,
                javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boutonSave,
                javax.swing.GroupLayout.PREFERRED_SIZE, CONST48,
                javax.swing.GroupLayout.PREFERRED_SIZE)));
    }

    /**
     * fonction boutonConvXJActionPerformed. Permet la converstion de la partie
     * xml en Json lorsqu'on clique sur le bouton correspondant
     */
    private void boutonConvXJActionPerformed() {
        xmlActive = false;
        jsonActive = true;
        textXml = textAreaXml.getText();


        try {
            textJson = new XmlToJson().convert(textXml);
            boutonSave.setEnabled(true);
            textAreaJson.setText(textJson);
            textAreaXml.setBackground(backGroundText);
            jScrollXml.setBorder(null);
            textAreaJson.setBackground(Color.white);
            jScrollJson.setBorder(
                    javax.swing.BorderFactory.createLineBorder(borderColor, 2));
        } catch (JSONException e) {
            textAreaJson.setText("!!! erreur de traduction !! ");
            boutonSave.setEnabled(false);
        }

    }

    /**
     * fonction boutonConvJXActionPerformed. Permet la converstion de la partie
     * Json en xml lorsqu'on clique sur le bouton correspondant
     */
    private void boutonConvJXActionPerformed() {
        jsonActive = false;
        xmlActive = true;
        textJson = textAreaJson.getText();

        try {
            textXml = new JsonToXml().convert(textJson);
            boutonSave.setEnabled(true);
            textAreaXml.setText(textXml);
            textAreaXml.setBackground(Color.white);
            jScrollXml.setBorder(
                    javax.swing.BorderFactory.createLineBorder(borderColor, 2));
            textAreaJson.setBackground(backGroundText);
            jScrollJson.setBorder(null);
        } catch (JSONException e) {
            textAreaXml.setText(" !!! erreur de traduction !!!");
            boutonSave.setEnabled(false);
        }

    }

    /**
     * fonction boutonImportXmlActionPerformed. Permet lorsqu'on appuie sur le
     * bouton "import xml" d'importer un fichier xml pour le visualiser.
     */
    private void boutonImportXmlActionPerformed() {
        CustomFileChooser xmlFileChooser =
                new CustomFileChooser("xml",
                "Choisir un fichier XML à importer");

        xmlFileChooser.showOpenDialog(this);

        if (xmlFileChooser.getSelectedFile() != null) {
            xmlPath = xmlFileChooser.getSelectedFile().getAbsolutePath();
            boutonSave.setEnabled(false);
            textXml = Saver.load(xmlPath);
            fieldXmlPath.setText(xmlPath);
            textAreaXml.setText(textXml);
            textAreaXml.setBackground(backGroundText);
            jScrollXml.setBorder(null);
            textAreaJson.setBackground(Color.white);
        }
    }

    /**
     * fonction boutonImportJsonActionPerformed. Permet lorsqu'on appuie sur le
     * bouton "import json" d'importer un fichier json pour le visualiser.
     */
    private void boutonImportJsonActionPerformed() {
        CustomFileChooser jsonFileChooser =
                new CustomFileChooser("json",
                "Choisir un fichier JSON à importer");
        jsonFileChooser.showOpenDialog(this);
        if (jsonFileChooser.getSelectedFile() != null) {
            boutonSave.setEnabled(false);
            jsonPath = jsonFileChooser.getSelectedFile().getAbsolutePath();
            textJson = Saver.load(jsonPath);
            fieldJsonPath.setText(jsonPath);
            textAreaJson.setText(textJson);
            textAreaJson.setBackground(backGroundText);
            jScrollJson.setBorder(null);
            textAreaXml.setBackground(Color.white);
        }

    }

    /**
     * fonction boutonSaveActionPerformed. Permet de sauvegarder dans le format
     * xml ou json la traduciton qui a été faites précedement.
     */
    private void boutonSaveActionPerformed() {
        if (jsonActive) {
            CustomFileChooser jsonFileChooser =
                    new CustomFileChooser("json",
                    "Choisir un nom de fichier JSON pour la sauvegarde");
            jsonFileChooser.showSaveDialog(this);
            if (jsonFileChooser.getSelectedFile() != null) {
                xmlPath = jsonFileChooser.getSelectedFile().getAbsolutePath();
                Saver.save(xmlPath + ".json", textXml);
            }
        } else if (xmlActive) {
            CustomFileChooser xmlFileChooser =
                    new CustomFileChooser("xml",
                    "Choisir un nom de fichier XML pour la sauvegarde");
            xmlFileChooser.showSaveDialog(this);
            if (xmlFileChooser.getSelectedFile() != null) {
                jsonPath = xmlFileChooser.getSelectedFile().getAbsolutePath();
                Saver.save(jsonPath + ".xml", textJson);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        /* Set the Nimbus look and feel
         <editor-fold defaultstate="collapsed" desc=" Look and
         feel setting code (optional) ">
         /* If Nimbus (introduced in Java SE 6) is not available,
         * stay with the default look and feel.
         */
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE,
                            null, ex);
                }
            }
        });
    }
    // Variables declaration
    /**
     * @param boutonConvJX
     */
    private javax.swing.JButton boutonConvJX;
    /**
     * @param boutonConvXJ
     */
    private javax.swing.JButton boutonConvXJ;
    /**
     * @param boutonImportJson
     */
    private javax.swing.JButton boutonImportJson;
    /**
     * @param boutonImportXml
     */
    private javax.swing.JButton boutonImportXml;
    /**
     * @param boutonSave
     */
    private javax.swing.JButton boutonSave;
    /**
     * @param fieldJsonPath
     */
    private javax.swing.JTextField fieldJsonPath;
    /**
     * @param fieldXmlPath
     */
    private javax.swing.JTextField fieldXmlPath;
    /**
     * @param jPanel1
     */
    private javax.swing.JPanel jPanel1;
    /**
     * @param jPanel2
     */
    private javax.swing.JPanel jPanel2;
    /**
     * @param jPanel3
     */
    private javax.swing.JPanel jPanel3;
    /**
     * @param jScrollJson
     */
    private javax.swing.JScrollPane jScrollJson;
    /**
     * @param jScrollXml
     */
    private javax.swing.JScrollPane jScrollXml;
    /**
     * @param textAreaJson
     */
    private javax.swing.JTextArea textAreaJson;
    /**
     * @param textAreaXml
     */
    private javax.swing.JTextArea textAreaXml;
    // End of variables declaration
    // Constante declaration
    /**
     * @param CONST249
     */
    private static final int CONST249 = 249;
    /**
     * @param CONST247
     */
    private static final int CONST247 = 247;
    /**
     * @param CONST353
     */
    private static final int CONST353 = 353;
    /**
     * @param CONST71
     */
    private static final int CONST71 = 71;
    /**
     * @param CONST86
     */
    private static final int CONST86 = 86;
    /**
     * @param CONST248
     */
    private static final int CONST248 = 248;
    /**
     * @param CONST102
     */
    private static final int CONST102 = 102;
    /**
     * @param CONST289
     */
    private static final int CONST289 = 289;
    /**
     * @param CONST287
     */
    private static final int CONST287 = 287;
    /**
     * @param CONST20
     */
    private static final int CONST20 = 20;
    /**
     * @param CONST22
     */
    private static final int CONST22 = 22;
    /**
     * @param CONST31
     */
    private static final int CONST31 = 31;
    /**
     * @param CONST32
     */
    private static final int CONST32 = 32;
    /**
     * @param CONST255
     */
    private static final int CONST255 = 255;
    /**
     * @param CONST41
     */
    private static final int CONST41 = 41;
    /**
     * @param CONST5
     */
    private static final int CONST5 = 5;
    /**
     * @param CONST387
     */
    private static final int CONST387 = 387;
    /**
     * @param CONST111
     */
    private static final int CONST111 = 111;
    /**
     * @param CONST388
     */
    private static final int CONST388 = 388;
    /**
     * @param CONST203
     */
    private static final int CONST203 = 203;
    /**
     * @param CONST216
     */
    private static final int CONST216 = 216;
    /**
     * @param CONST48
     */
    private static final int CONST48 = 48;
    // Constante declaration
}
