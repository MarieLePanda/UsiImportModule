/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import myObject.Application;
import myObject.Capability;
import myObject.Segment;

/**
 *
 * @author Dreux
 */
public class ExportSQL {
    
    public static void exportSegment(){
        BufferedWriter file =null; 
        String nameFile = "UsiExportZone";
        try{
            File dir = new File("export");
            dir.mkdirs();
            FileWriter fileWriter = new FileWriter("export\\" + nameFile + ".csv");
            file = new BufferedWriter(fileWriter);
            file.write("Id : ");
            file.write("Nom : ");
            file.write("Description : ");
            file.write("Responsable : ");
            file.write("Responsable suppléant : ");
            file.write("Liste de quartier : ");
            file.newLine();
            for(Segment s : data.IHM.DataIHM.getListAllSegment()){  
                if(s.getName().equals("__Aucun") == false){
                    file.write(Integer.toString(s.getId()));
                    file.write(" : ");
                    file.write(objectValue(s.getName()));
                    file.write(" : ");
                    file.write(objectValue(s.getDescription()));
                    file.write(" : ");
                    file.write(objectValue(s.getResponsible()));
                    file.write(" : ");
                    file.write(objectValue(s.getResponsibledeputy()));
                    file.write(" : ");
                    for(myObject.Process p : s.getListProcess()){
                        file.write(objectValue(p));
                        file.write(";");
                    }
                    file.newLine();
                }
            }
        }catch(IOException err){
            err.toString();
        }
        finally{
            try {
                if(file != null)
                    file.close();
            } catch (IOException err) {
                err.getMessage();
            }
        }
    }
    
    public static void exportProcess(){
        BufferedWriter file =null; 
        String nameFile = "UsiExportQuartier";
        try{
            File dir = new File("export");
            dir.mkdirs();
            FileWriter fileWriter = new FileWriter("export\\" + nameFile + ".csv");
            file = new BufferedWriter(fileWriter);
            file.write("Id : ");
            file.write("Nom : ");
            file.write("Description : ");
            file.write("Responsable : ");
            file.write("Responsable suppléant : ");
            file.write("Date de début : ");
            file.write("Date de fin : ");
            file.write("Zone : ");
            file.write("Liste d'ilot : ");
            file.newLine();
            for(myObject.Process p : data.IHM.DataIHM.getListAllProcess()){ 
                if(p.getName().equals("__Aucun") == false){
                    file.write(Integer.toString(p.getId()));
                    file.write(" : ");
                    file.write(objectValue(p.getName()));
                    file.write(" : ");
                    file.write(objectValue(p.getDescription()));
                    file.write(" : ");
                    file.write(objectValue(p.getResponsible()));
                    file.write(" : ");
                    file.write(objectValue(p.getResponsibleDeputy()));
                    file.write(" : ");
                    file.write(objectValue(p.getValidFrom()));
                    file.write(" : ");
                    file.write(objectValue(p.getValideUntil()));
                    file.write(" : ");
                    file.write(objectValue(p.getSegment()));
                    file.write(" : ");
                    for(Capability c : p.getListCapability()){
                        file.write(objectValue(c));
                        System.out.println(objectValue(c));
                        file.write(";");
                    }
                    file.newLine();
                }
            }
        }catch(IOException err){
            err.toString();
        }
        finally{
            try {
                if(file != null)
                    file.close();
            } catch (IOException err) {
                err.getMessage();
            }
        }
    }
    
 public static void exportCapabilities(){
        BufferedWriter file =null; 
        String nameFile = "UsiExporIlot";
        
        try{
            File dir = new File("export");
            dir.mkdirs();
            FileWriter fileWriter = new FileWriter("export\\" + nameFile + ".csv");
            file = new BufferedWriter(fileWriter);
            file.write("Id : ");
            file.write("Nom : ");
            file.write("Description : ");
            file.write("Responsable : ");
            file.write("Responsable suppléant : ");
            file.write("Date de début : ");
            file.write("Date de fin : ");
            file.write("Quartier : ");
            file.write("Liste d'application : ");
            file.newLine();
            for(Capability c : data.IHM.DataIHM.getAllCapability()){   
                if(c.getName().equals("__Aucun") == false){
                   file.write(Integer.toString(c.getId()));
                   file.write(" : ");
                   file.write(objectValue(c.getName()));
                   file.write(" : ");
                   file.write(objectValue(c.getDescription()));
                   file.write(" : ");
                   file.write(objectValue(c.getResponsible()));
                   file.write(" : ");
                   file.write(objectValue(c.getResponsibleDeputy()));
                   file.write(" : ");
                   file.write(objectValue(c.getValidFrom()));
                   file.write(" : ");
                   file.write(objectValue(c.getValideUntil()));
                   file.write(" : ");
                   file.write(objectValue(c.getProcess()));
                   file.write(" : ");
                   for(Application a : c.getListApplication()){
                       file.write(objectValue(a));
                       System.out.println(objectValue(a));
                       file.write(";");
                   }
                   file.newLine();
                }
            }
        }catch(IOException err){
            err.toString();
        }
        finally{
            try {
                if(file != null)
                    file.close();
            } catch (IOException err) {
                err.getMessage();
            }
        }
    }
    
    public static String objectValue(Object o){
        if(o == null)
            return "N/A";
        else
            return o.toString();
    }
    
}
