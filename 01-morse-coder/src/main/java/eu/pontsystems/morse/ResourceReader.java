package eu.pontsystems.morse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ResourceReader {
	
	public static final String dataPath = System.getProperty("user.dir") + "\\data\\morse.txt";
	

	public static Map<Character, String> readEncodingTable() {
		Map<Character, String> table = new HashMap();
		File f = new File(dataPath);
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line;
			while ((line = br.readLine()) != null) {
		    	String[] splitline = line.split("  ");
		    	table.put(splitline[0].charAt(0), splitline[1]);
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return table;
	}
	
}
