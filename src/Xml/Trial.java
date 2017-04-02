package Xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Trial {
	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {
		
		//if(args.length != 1)
			//throw new RuntimeException("The name of the XML file is required!");
		 String COMMA_DELIMITER = ",";
		String NEW_LINE_SEPARATOR = "\n";
		
		//CSV file header
		String FILE_HEADER = "Seller_Name,Description";
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		// Load the input XML document, parse it and return an instance of the
		// Document class.
		Document document = builder.parse(new File("/home/magnetto/workspace/Java-Pixels/txtdata/ebay.xml"));

		List<EbayCl> det = new ArrayList<EbayCl>();

		NodeList nodeList = document.getDocumentElement().getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {

			Node node = nodeList.item(i);

			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element elem = (Element) node;
				
//				EbayCl e = new EbayCl(elem.getElementsByTagName("seller_name").item(0).getChildNodes().item(0).getNodeValue(), elem.getElementsByTagName("seller_rating").item(0)
//						.getChildNodes().item(0).getNodeValue(),elem.getElementsByTagName("payment_types")
//						.item(0).getChildNodes().item(0).getNodeValue(),elem.getElementsByTagName("shipping_info")
//						.item(0).getChildNodes().item(0).getNodeValue(),elem.getElementsByTagName("current_bid")
//						.item(0).getChildNodes().item(0).getNodeValue(),elem.getElementsByTagName("time_left")
//						.item(0).getChildNodes().item(0).getNodeValue(),elem.getElementsByTagName("bidder_name")
//						.item(0).getChildNodes().item(0).getNodeValue(),elem.getElementsByTagName("bidder_rating")
//						.item(0).getChildNodes().item(0).getNodeValue(),elem.getElementsByTagName("location")
//						.item(0).getChildNodes().item(0).getNodeValue(),elem.getElementsByTagName("description")
//						.item(0).getChildNodes().item(0).getNodeValue());
				String s=elem.getElementsByTagName("seller_name").item(0).getTextContent();
				String d=elem.getElementsByTagName("description").item(0).getChildNodes().item(0).getNodeValue();
				EbayCl e = new EbayCl(s,d);
				det.add(e);
			}
		}
		FileWriter fileWriter = null;
		fileWriter = new FileWriter(new File("/home/magnetto/workspace/Java-Pixels/txtdata/ebay.csv"));

		//Write the CSV file header
		fileWriter.append(FILE_HEADER.toString());
		
		//Add a new line separator after the header
		fileWriter.append(NEW_LINE_SEPARATOR);
		
		for (EbayCl empl : det)
			
		{
			fileWriter.append("\"" +empl.getSeller_name()+"\"");
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append("\"" +empl.getDescription()+"\"");
			fileWriter.append(NEW_LINE_SEPARATOR);
		}
			fileWriter.close();
	}
}