package JavaIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 String srg = "Hello Java!! \nWelcome to Javatpoint.";  
	        StringReader reader = new StringReader(srg);  
	        int k=0;  
	            while((k=reader.read())!=-1)
	            {  
	                System.out.print((char)k);  
	            }  
	            char[] ary = new char[512];  
	            StringWriter writer = new StringWriter();  
	            FileInputStream input = null;  
	            BufferedReader buffer = null;  
	            input = new FileInputStream("D://testout.txt");  
	            buffer = new BufferedReader(new InputStreamReader(input, "UTF-8"));  
	            int x;  
	            while ((x = buffer.read(ary)) != -1) {  
	                       writer.write(ary, 0, x);  
	            }  
	            System.out.println(writer.toString());        
	            writer.close();  
	            buffer.close();  
	}

}
