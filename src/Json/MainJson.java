package Json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
public class MainJson {
	
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	
	//CSV file header
	private static final String FILE_HEADER = "id,name,url,season,number,runtime,summary";

	public static void writeCsvFile() throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		List<JsonClss> l = new ArrayList<JsonClss>();
		JsonParser parser = new JsonParser();
		JsonElement jElement = parser.parse(new FileReader(new File("/home/magnetto/workspace/Java-Pixels/txtdata/got.json")));
		JsonObject jObject = jElement.getAsJsonObject();
		JsonObject embedded = jObject.get("_embedded").getAsJsonObject();
		JsonArray episodes = embedded.get("episodes").getAsJsonArray();
		
		for (JsonElement episode : episodes) {
			JsonObject jEpisode = episode.getAsJsonObject();
		JsonClss js=new JsonClss(jEpisode.get("id").getAsString(), jEpisode.get("name").getAsString(), 
				jEpisode.get("url").getAsString(),	jEpisode.get("season").getAsString(),
jEpisode.get("number").getAsString(), jEpisode.get("runtime").getAsString(),jEpisode.get("summary").toString());
		l.add(js);
				}
		
	
	
		
		FileWriter fileWriter = null;
				
		try {
			fileWriter = new FileWriter(new File("/home/magnetto/workspace/Java-Pixels/txtdata/got_episodes.csv"));

			//Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());
			
			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);
			
			//Write a new student object list to the CSV file
			for (JsonClss s : l) {
				fileWriter.append("\"" + s.getId() + "\"");
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append("\"" +s.getName()+"\"");
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append("\"" +s.getUrl()+"\"");
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append("\"" +s.getSeason()+"\"");
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append("\"" +s.getNumber()+"\"");
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append("\"" +s.getRunime()+"\"");
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append( s.getSummary());
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			
	
			System.out.println("CSV file was created successfully !!!");
			
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		
		MainJson.writeCsvFile();
	}
}