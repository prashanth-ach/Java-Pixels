package movieData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class MainMovie{

    public static void main(String[] arg) throws Exception {

        StringTokenizer st ;
        BufferedReader TSVFile = new BufferedReader(new FileReader("E:/workspace/Java-Pixels/txtdata/chandra.txt"));
        List<String>dataArray = new ArrayList<String>() ;
        Set<Integer> lst=new HashSet<Integer>();
        String dataRow = TSVFile.readLine(); 

        while (dataRow != null){
            st = new StringTokenizer(dataRow,"\\t");
            while(st.hasMoreElements()){
                dataArray.add(st.nextElement().toString());
            }
            for (String item:dataArray) { 
            
               // System.out.print(item + "  "); 
            }
           // System.out.println(); 
            dataRow = TSVFile.readLine();
          
        }
        
        TSVFile.close();

       
        System.out.println();

    } 
} 