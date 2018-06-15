package eu.pontsystems.morse;

public class MorseAlphabet extends Alphabet{
	
	public MorseAlphabet() {
		table = ResourceReader.readMorseEncodingTable();
	}
}
