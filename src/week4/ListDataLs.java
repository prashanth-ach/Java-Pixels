package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ListDataLs {
	public void executeCommand(String command) {
        StringBuffer output = new StringBuffer();
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = "";
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(output.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListDataLs a=new ListDataLs();
		a.executeCommand("cmd /c dir");
		

	}

}
