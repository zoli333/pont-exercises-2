package eu.pontsystems.morse;

import java.io.IOException;

public class BrailleAlphabet extends Alphabet{
	
	public BrailleAlphabet() {
		table=ResourceReader.readBrailleEncodingTable();
		
	}
	
	@Override
	public String findCode(Character letter) throws IOException {
		if(letter.equals(newLineChar)) return "/";
		if(!table.containsKey(letter)) throw new IOException("Character not found!!");
		return table.get(letter);
	}

	
}
