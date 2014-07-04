/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import myObject.Responsible;

/**
 *
 * @author lug13995
 */
public class ImportSQL {
    
    public static void importSegment(File file){
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader fileOpen = new BufferedReader(fileReader);
            String line = null;
            while((line = fileOpen.readLine()) != null){
                for(String s : line.split(":")){
                    System.out.println(s);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {
                Logger.getLogger(ImportSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void importResponsible(File file){
        FileReader fileReader = null;
        Responsible r = new Responsible();
        try {
            fileReader = new FileReader(file);
            BufferedReader fileOpen = new BufferedReader(fileReader);
            String line = null;
            while((line = fileOpen.readLine()) != null){
                if(line.split(":").length > 1){
                    r.setName(line);
                }else{
                    r.setId(new Integer(line));
                    r.setName(line);
                }
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {
                Logger.getLogger(ImportSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
