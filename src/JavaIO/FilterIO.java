package JavaIO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterIO {  
	 public static void main(String[] args) throws IOException {  
	        File data = new File("D:\\testout.txt");  
	        FileOutputStream file = new FileOutputStream(data);  
	        FilterOutputStream filter = new FilterOutputStream(file);  
	        String s="Welcome to javaTpoint.";      
	        byte b[]=s.getBytes();      
	        filter.write(b);     
	        filter.flush();  
	        filter.close();  
	        file.close();  
	        System.out.println("Success...");  
	        File dat = new File("D:\\testout.txt");  
	        FileInputStream  fil = new FileInputStream(dat);  
	        FilterInputStream filte = new BufferedInputStream(fil);  
	        int k =0;  
	        while((k=filte.read())!=-1){  
	            System.out.print((char)k);  
	        }  
	        file.close();  
	        filte.close();  
	    }  
	}
