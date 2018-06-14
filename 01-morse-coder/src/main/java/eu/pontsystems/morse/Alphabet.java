package eu.pontsystems.morse;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Alphabet {
	
	public static Map<Character, String> Table;
	public static Character whiteSpaceChar='/';
	
	static {
		Table = ResourceReader.readEncodingTable();
		//System.out.println("CALLED");
	}
	
	/***
	 * 
	 * @param letter An alphabet character in String 
	 */
	public static String findCode(Character letter) {
		if(Character.isWhitespace(letter)) {
			return (String.valueOf(whiteSpaceChar+" "));
		}else if(letter.equals('|')){
			return "/ ";
		}else{
			return Table.get(letter)+" ";
		}
		
	}
	
	

}
