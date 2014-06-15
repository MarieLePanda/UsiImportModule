/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usiimportmodule;

import IHM.ImportExport;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import plugin.IModule;


/**
 *
 * @author lug13995
 */
public class PluginTest implements IModule{
    
    public PluginTest(){
         JOptionPane.showMessageDialog(null,"Hello world !! I'm pluging !!!!!");

    }

    @Override
    public void plug() {
       JOptionPane.showMessageDialog(null,"Je me plug");
    }

    @Override
    public void unplug() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
