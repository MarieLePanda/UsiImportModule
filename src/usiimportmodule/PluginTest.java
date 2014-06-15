/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usiimportmodule;

import javax.swing.JOptionPane;
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
    public String getName() {
        return "Mon premier pluging";
    }
}
