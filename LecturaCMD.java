/**
 * @(#)LecturaCMD.java
 *
 *
 * @author 
 * @version 1.00 2016/10/16
 */
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.util.Timer;

public class LecturaCMD {

    public LecturaCMD() 
    	
   	{
   		
    }
    
    public static void LecturaCMD()
    {
    	try {
String line;
Process p = Runtime.getRuntime().exec("tasklist.exe /fo csv /nh");
BufferedReader input = new BufferedReader
(new InputStreamReader(p.getInputStream()));

	while ((line = input.readLine()) != null) 
	{
		    
		  String []separador;
		  char letra2='"';
		  line=line.replace(letra2+""," ");
		     separador=line.split(",");
		    
		      String [] filaProsces;

			     	if(separador[4].equals(separador[(separador.length)-1]))
			     		{
			     		System.out.println(separador[0]+" , "+separador[1]+", "+separador[2]+","+separador[3]+","+separador[(separador.length)-1]); 
						}
			      else{
			      
				      System.out.println(separador[0]+" , "+separador[1]+", "+separador[2]+","+separador[3]+","+separador[4].concat(separador[(separador.length)-1])); 
				      }

   
		}
		
	 input.close();
		    }
		        catch (Exception err) 
		        {
		        err.printStackTrace();
			}
    	
    }
    
    
    
    public static void main (String[] args) 
    	{
    		
TimerTask tarea=new TimerTask(){
public void run() {
LecturaCMD();
}
};
Timer temp=new Timer();
temp.schedule(tarea,new Date(), 06000);   	
}
}		
