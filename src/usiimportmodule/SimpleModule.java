/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usiimportmodule;

import plugin.IModule;

/**
 *
 * @author lug13995
 */
public class SimpleModule implements IModule{
  
    public void plug(){ 
    System.out.println("Hello kernel !"); 
    } 

    public void unplug(){ 
    System.out.println("Bye kernel !"); 
    } 

    public String getName(){ 
    return "Simple module"; 
    } 
}
