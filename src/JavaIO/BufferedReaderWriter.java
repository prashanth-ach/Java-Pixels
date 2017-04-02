package JavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriter {
	 public static void main(String args[])throws Exception{    
         FileReader fr=new FileReader("D:\\testout.txt");    
         BufferedReader br=new BufferedReader(fr);    
 
         int i;    
         while((i=br.read())!=-1){  
         System.out.print((char)i);  
         }  
         br.close();    
         fr.close();    
         FileWriter writer = new FileWriter("D:\\testout.txt");  
         BufferedWriter buffer = new BufferedWriter(writer);  
         buffer.write("Welcome to javaTpoint.");  
         buffer.close();  
         System.out.println("Success");  
}
}