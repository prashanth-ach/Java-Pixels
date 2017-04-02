package Scrape;

//import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class Extract {

  public static void main(String[] args)  {
    try {
      String url = "http://www.imdb.com/title/tt0848228/";
      Document doc = Jsoup.connect(url).get();
    //  Elements paragraphs = doc.select("p");
      Elements data = doc.getElementsByClass("title_bar_wrapper");
      System.out.println(data);
//      FileWriter fileWriter = null;
//		fileWriter = new FileWriter(new File("/home/magnetto/workspace/Java-Pixels/txtdata/imdb.txt"));
//		fileWriter.append("title_bar_wrapper");
//		fileWriter.append("\n");
//		for(Element q : data){
//	    	  fileWriter.append(q.text());
//	    	  fileWriter.append("\n");
//	    
//	      }
//		fileWriter.append("\n");
//		
//      for(Element p : paragraphs){
//    	  fileWriter.append(p.text());
//    	  fileWriter.append("\n");
//    
     // }
  //
      
     // fileWriter.close();
    } 
    catch (IOException ex) {
      Logger.getLogger(Extract.class.getName())
            .log(Level.SEVERE, null, ex);
    }
  }
}