/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usiimportmodule;

import IHM.ImportExport;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;






/**
 *
 * @author lug13995
 */
public class ImportExportPlugin implements plugin.IModule{
    
    public ImportExportPlugin(){
    }

    @Override
    public void plug() {

    }

    @Override
    public void unplug() {
        
    }
    
    @Override
    public void start() {
        Runnable r = new Runnable(){
            public void run(){
                ImportExport win = new ImportExport();
                win.setVisible(true);
                win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); 
            }
        };
        SwingUtilities.invokeLater(r);
    }

    @Override
    public String getName() {
        return "Import\\Export";
    }

    
}
