package eu.pontsystems.morse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ResourceReader {
	
	private static final String MorsedataPath = System.getProperty("user.dir") + "\\MorseData\\morse.txt";
	private static final String BrailledataPath = System.getProperty("user.dir") + "\\BrailleData\\braille.txt";	

	public static Map<Character, String> readMorseEncodingTable() {
		Map<Character, String> table = new HashMap<>();
		File f = new File(MorsedataPath);
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line;
			while ((line = br.readLine()) != null) {
		    	String[] splitline = line.split("  ");
		    	table.put(splitline[0].charAt(0), splitline[1]);
		    }
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return table;
	}
	
	
	public static Map<Character, String> readBrailleEncodingTable() {
		Map<Character, String> table = new HashMap<>();
		File f = new File(BrailledataPath);
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line;
			int i=0;
			while ((line = br.readLine()) != null) {
		    	String[] splitline = line.split("  ");
		    	if(i==0) {
		    		table.put(' ', splitline[1].trim());
		    	}else {
		    		table.put(splitline[0].charAt(0), splitline[1]);	
		    	}
		    	i++;
		    }
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return table;
	}
	
	public void printOutTable(Map<Character, String> table) {
		for(Entry<Character, String> entry : table.entrySet()) {
			System.out.println(entry.getKey() + "," +entry.getValue());
			
		}
	}
	
	
	


	
}
