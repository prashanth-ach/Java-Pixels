package JavaIO;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayReaderWriter {
	  public static void main(String[] ag) throws Exception {  
		    char[] ary = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };  
		    CharArrayReader reader = new CharArrayReader(ary);  
		    int k = 0;  
		    // Read until the end of a file  
		    while ((k = reader.read()) != -1) {  
		      char ch = (char) k;  
		      System.out.print(ch + " : ");  
		      System.out.println(k); 
		      CharArrayWriter out=new CharArrayWriter();    
	          out.write("Welcome to javaTpoint");    
	          FileWriter f1=new FileWriter("D:\\a.txt");    
	          FileWriter f2=new FileWriter("D:\\b.txt");    
	          FileWriter f3=new FileWriter("D:\\c.txt");    
	          FileWriter f4=new FileWriter("D:\\d.txt");    
	          out.writeTo(f1);    
	          out.writeTo(f2);    
	          out.writeTo(f3);    
	          out.writeTo(f4);    
	          f1.close();    
	          f2.close();    
	          f3.close();    
	          f4.close();    
	          System.out.println("Success...");    
		    }  }
}
