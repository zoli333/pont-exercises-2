package eu.pontsystems.morse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Morse {
	
	public String whiteSpaceChar = "/";
	public String newLineChar = "|";
	public Map<String, String> table;
	public static final String dataPath = System.getProperty("user.dir") + "\\data\\morse.txt";
			
	public Morse() {
		table = new HashMap();
		readEncodingTable();
	}
	
	public void readEncodingTable() {
		File f = new File(dataPath);
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line;
			while ((line = br.readLine()) != null) {
		    	String[] splitline = line.split("  ");
		    	table.put(splitline[0], splitline[1]);
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public String encode(String text) {
		text = text.replace("\n", newLineChar).replace("\r", newLineChar);
		text = text.toUpperCase();
		System.out.println(text);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<text.length();i++) {
			String letter = Character.toString(text.charAt(i)); //table.get();
			if(letter.equalsIgnoreCase(" ")) {
				sb.append(whiteSpaceChar+" ");
			}else if(letter.equalsIgnoreCase(newLineChar)){
				sb.append(newLineChar);
			}else{
				if(i==text.length()-1) {
					sb.append(table.get(letter));	
				}else {
					sb.append(table.get(letter)+" ");
				}
				
			}
			
		}
		String encodedString = sb.toString();
		if(encodedString.contains("null")) {
			return null;
		}else {
			return encodedString;
		}
	}
	
	/**
	 * 
	 * @param morseText
	 */
	public String decode(String morseText) {
		StringBuilder sb = new StringBuilder();
		String[] splitMorseText = morseText.split(" ");
		for(int i=0;i<splitMorseText.length;i++) {
			String morseLetter = splitMorseText[i];
			if(morseLetter.equalsIgnoreCase(whiteSpaceChar)) {
				sb.append(" ");
				
			}else {
				sb.append(findKey(morseLetter));
			}
			
		}
		String decoderesult = sb.toString();
		if(decoderesult.contains("null")) {
			return null;
		}else {
			return decoderesult;
		}
		
	}
	
	public String findKey(String value) {
		for(Map.Entry<String, String> entry : table.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(value)) {
				return entry.getKey();
			}
		}
		return null;
	}
	

	public static void main(String[] args) {
		System.out.println(Morse.dataPath);
		
		Morse m = new Morse();
		//m.encode("Hello world\nenter");
		String result = m.encode("They're trying to save on their phone bill");
		if(result.equals(null)) {
			System.out.println("Invalid input character! Cannot be encoded!");
		}else {
			System.out.println("Succesful encoding: ");
			System.out.println(result);
		}
		
	}
}
