/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.info.dcll.convxj.graphicinterface;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import ups.info.dcll.convxj.Saver;
import ups.info.dcll.convxj.jsontoxml.JsonToXml;
import ups.info.dcll.convxj.xmltojson.XmlToJson;

/**
 *
 * @author David Duprat
 * @author Alexis Paoleschi
 * 
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    
    boolean xmlActive;
    boolean jsonActive;
    String textXml, textJson;
    String xmlPath, jsonPath;  
    
    Color backGroundText, borderColor;
    
    public GUI() throws FileNotFoundException {
        initComponents();
        xmlActive = false;
        jsonActive = false; 
        backGroundText = new java.awt.Color(248, 248, 248);
        borderColor = new java.awt.Color(102, 102, 255);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonImportXmlActionPerformed(evt);
            }
        });

        boutonImportJson.setText("import JSON");
        boutonImportJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonImportJsonActionPerformed(evt);
            }
        });

        fieldXmlPath.setEditable(false);
        fieldXmlPath.setBackground(new java.awt.Color(249, 249, 249));
        fieldXmlPath.setText("C:/");

        fieldJsonPath.setEditable(false);
        fieldJsonPath.setBackground(new java.awt.Color(247, 247, 247));
        fieldJsonPath.setText("C:/");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boutonImportXml)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldXmlPath, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(boutonImportJson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldJsonPath, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {boutonImportJson, boutonImportXml});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boutonImportJson)
                        .addComponent(fieldXmlPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fieldJsonPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(boutonImportXml, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {boutonImportJson, boutonImportXml});

        textAreaJson.setBackground(new java.awt.Color(249, 249, 249));
        textAreaJson.setColumns(20);
        textAreaJson.setRows(5);
        textAreaJson.setBorder(null);
        jScrollJson.setViewportView(textAreaJson);

        textAreaXml.setBackground(new java.awt.Color(249, 249, 249));
        textAreaXml.setColumns(20);
        textAreaXml.setRows(5);
        jScrollXml.setViewportView(textAreaXml);

        boutonConvXJ.setText("XML -> JSON");
        boutonConvXJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonConvXJActionPerformed(evt);
            }
        });

        boutonConvJX.setText("XML <- JSON");
        boutonConvJX.setBorder(null);
        boutonConvJX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonConvJXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollXml, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boutonConvJX, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(boutonConvXJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollJson, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {boutonConvJX, boutonConvXJ});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(boutonConvXJ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(boutonConvJX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollJson)
                    .addComponent(jScrollXml))
                .addContainerGap())
        );

        boutonSave.setText("SaveAs");
        boutonSave.setEnabled(false);
        boutonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(boutonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boutonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutonConvXJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonConvXJActionPerformed
        textXml = textAreaXml.getText();
        boutonSave.setEnabled(true);
        textJson = new XmlToJson().convert(textXml);
        textAreaJson.setText(textJson);
        textAreaXml.setBackground(backGroundText);
        jScrollXml.setBorder(null);
        textAreaJson.setBackground(Color.white);
        jScrollJson.setBorder(javax.swing.BorderFactory.createLineBorder(borderColor, 2));
        
    }//GEN-LAST:event_boutonConvXJActionPerformed

    private void boutonConvJXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonConvJXActionPerformed
        textJson = textAreaJson.getText();
        boutonSave.setEnabled(true);
        textXml = new JsonToXml().convert(textJson);
        textAreaXml.setText(textXml);
        textAreaXml.setBackground(Color.white);
        jScrollXml.setBorder(javax.swing.BorderFactory.createLineBorder(borderColor, 2));
        textAreaJson.setBackground(backGroundText);
        jScrollJson.setBorder(null);
    }//GEN-LAST:event_boutonConvJXActionPerformed

    private void boutonImportXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonImportXmlActionPerformed
        // TODO add your handling code here:
        xmlActive = false;
        jsonActive = true;
        
        JFileChooser fc = new JFileChooser();
        
        fc.showOpenDialog(this);
        
        if(fc.getSelectedFile() != null) {      	
        	xmlPath = fc.getSelectedFile().getAbsolutePath();  
        
	        textXml = Saver.load(xmlPath);
	        fieldXmlPath.setText(xmlPath);
	        textAreaXml.setText(textXml);
                textAreaXml.setBackground(backGroundText);
                jScrollXml.setBorder(null);       
                textAreaJson.setBackground(Color.white);
        }
    }//GEN-LAST:event_boutonImportXmlActionPerformed

    private void boutonImportJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonImportJsonActionPerformed
        // TODO add your handling code here:
        jsonActive = true;
        xmlActive = false;
        
        JFileChooser fc = new JFileChooser();
        
        fc.showOpenDialog(this);
        
        if(fc.getSelectedFile() != null) {	
        	jsonPath = fc.getSelectedFile().getAbsolutePath();    
        
	        textJson = Saver.load(jsonPath);
	        fieldJsonPath.setText(jsonPath); 
	        textAreaJson.setText(textJson);
                textAreaJson.setBackground(backGroundText);
                jScrollJson.setBorder(null);
                textAreaXml.setBackground(Color.white);
        }
        
    }//GEN-LAST:event_boutonImportJsonActionPerformed

    
    
    private void boutonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonSaveActionPerformed
        // TODO add your handling code here:

    	JFileChooser fc = new JFileChooser();
        
        fc.showSaveDialog(this);
    	
        if(jsonActive){
        	if(fc.getSelectedFile() != null) {
        		xmlPath = fc.getSelectedFile().getAbsolutePath();
        		Saver.save(xmlPath, textXml);
        	}
        }
        else{
        	if(fc.getSelectedFile() != null) {	
            	jsonPath = fc.getSelectedFile().getAbsolutePath();
            	Saver.save(jsonPath,textJson);
        	}
        }
    }//GEN-LAST:event_boutonSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonConvJX;
    private javax.swing.JButton boutonConvXJ;
    private javax.swing.JButton boutonImportJson;
    private javax.swing.JButton boutonImportXml;
    private javax.swing.JButton boutonSave;
    private javax.swing.JTextField fieldJsonPath;
    private javax.swing.JTextField fieldXmlPath;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollJson;
    private javax.swing.JScrollPane jScrollXml;
    private javax.swing.JTextArea textAreaJson;
    private javax.swing.JTextArea textAreaXml;
    // End of variables declaration//GEN-END:variables
}
