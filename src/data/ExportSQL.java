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
import jxl.*;
import jxl.write.*;
import myObject.Segment;

/**
 *
 * @author Dreux
 */
public class ExportSQL {
    
    public static void exportSegment(){

         BufferedWriter fichier =null; 
        int column = 0, row = 0;
        try{
            	FileWriter ficherEcriture = new FileWriter("repertoire.txt");
                fichier = new BufferedWriter(ficherEcriture);
            for(Segment s : data.IHM.DataIHM.getListAllSegment()){
                
               sheet.addCell(new Label(column, row, Integer.toString(s.getId())));
               column++;
               sheet.addCell(new Label(column, row, s.getName()));
               column++;
               //fichier.write(s.getDescription());
               sheet.addCell(new Label(column, row, s.getResponsible().toString()));
               column++;
               sheet.addCell(new Label(column, row, s.getResponsibledeputy().toString()));
               column = 0;
               row++;
               System.out.println(s.getListProcess());
               System.out.println("---------------------------------------");
            }
        }catch(IOException | WriteException err){
            err.getMessage();
        }
        finally{
            try {
                if(workbook != null)
                    workbook.close();
            } catch (IOException | WriteException err) {
                err.getMessage();
            }
        }
    }
    
}
