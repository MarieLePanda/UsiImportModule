/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IHM;


import javax.swing.JFileChooser;

/**
 *
 * @author Dreux
 */
public class ImportExport extends javax.swing.JFrame {

    /**
     * Creates new form ImportExport
     */
    public ImportExport() {
        initComponents();
        buttonGroup1.add(jRadioButtonExport);
        buttonGroup1.add(jRadioButtonImport);
        jPanelList.setVisible(false);
        jPanelFile.setVisible(false);
        pack();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelRadio = new javax.swing.JPanel();
        jRadioButtonImport = new javax.swing.JRadioButton();
        jRadioButtonExport = new javax.swing.JRadioButton();
        jPanelList = new javax.swing.JPanel();
        jLabelList = new javax.swing.JLabel();
        jComboBoxTypeObject = new javax.swing.JComboBox();
        jPanelFile = new javax.swing.JPanel();
        jLabelFile = new javax.swing.JLabel();
        jPanelButton = new javax.swing.JPanel();
        jButtonNext = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jRadioButtonImport.setText("Importer des objets dans la base de données");

        jRadioButtonExport.setText("Exporter des objets de la base de données");

        javax.swing.GroupLayout jPanelRadioLayout = new javax.swing.GroupLayout(jPanelRadio);
        jPanelRadio.setLayout(jPanelRadioLayout);
        jPanelRadioLayout.setHorizontalGroup(
            jPanelRadioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRadioLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanelRadioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonExport)
                    .addComponent(jRadioButtonImport))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanelRadioLayout.setVerticalGroup(
            jPanelRadioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRadioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jRadioButtonImport)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonExport)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabelList.setText("Seléctionnez le type d'objet à ");

        jComboBoxTypeObject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelListLayout = new javax.swing.GroupLayout(jPanelList);
        jPanelList.setLayout(jPanelListLayout);
        jPanelListLayout.setHorizontalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelList)
                    .addComponent(jComboBoxTypeObject, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelListLayout.setVerticalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxTypeObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jLabelFile.setText("Seléctionnez le fichier à importer");

        javax.swing.GroupLayout jPanelFileLayout = new javax.swing.GroupLayout(jPanelFile);
        jPanelFile.setLayout(jPanelFileLayout);
        jPanelFileLayout.setHorizontalGroup(
            jPanelFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFileLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabelFile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFileLayout.setVerticalGroup(
            jPanelFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFileLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelFile)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jButtonNext.setText("Suivant");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Annuler");

        javax.swing.GroupLayout jPanelButtonLayout = new javax.swing.GroupLayout(jPanelButton);
        jPanelButton.setLayout(jPanelButtonLayout);
        jPanelButtonLayout.setHorizontalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButtonNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancel)
                .addGap(55, 55, 55))
        );
        jPanelButtonLayout.setVerticalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNext)
                    .addComponent(jButtonCancel))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        if(jPanelRadio.isVisible()){
            jPanelRadio.setVisible(false);
            jPanelList.setVisible(true);
            if(jRadioButtonImport.isSelected())
                jLabelList.setText(jLabelList.getText() + " importer");
            else
                jLabelList.setText(jLabelList.getText() + " exporter");
        }else if(jPanelList.isVisible() && jRadioButtonImport.isSelected()){
            jPanelList.setVisible(false);
            jPanelFile.setVisible(true);
            JFileChooser jf = new JFileChooser("aaaa");
            jPanelFile.add(jf);
            jf.setVisible(true);
        }else{
            System.out.println("Export de l'objet " + jComboBoxTypeObject.getSelectedItem());
        }
    }//GEN-LAST:event_jButtonNextActionPerformed

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
            java.util.logging.Logger.getLogger(ImportExport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportExport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportExport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportExport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImportExport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JComboBox jComboBoxTypeObject;
    private javax.swing.JLabel jLabelFile;
    private javax.swing.JLabel jLabelList;
    private javax.swing.JPanel jPanelButton;
    private javax.swing.JPanel jPanelFile;
    private javax.swing.JPanel jPanelList;
    private javax.swing.JPanel jPanelRadio;
    private javax.swing.JRadioButton jRadioButtonExport;
    private javax.swing.JRadioButton jRadioButtonImport;
    // End of variables declaration//GEN-END:variables
}
