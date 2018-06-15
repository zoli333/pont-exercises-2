package eu.pontsystems.morse;

import java.io.IOException;
import java.util.Map;



public abstract class Alphabet {
	
	protected static Map<Character, String> table;
	protected static Character whiteSpaceChar='/';
	protected static Character newLineChar='|';
	
	public Alphabet() {}


	public String findCode(Character letter) throws IOException  {
		if(Character.isWhitespace(letter)) return (String.valueOf(whiteSpaceChar));
		if(letter.equals(newLineChar))return "/";
		if(!table.containsKey(letter)) throw new IOException("Character not found!!");
		return table.get(letter);
	}




		
	
	
}
