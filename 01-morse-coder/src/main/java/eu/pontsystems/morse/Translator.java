package eu.pontsystems.morse;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Translator {
	
	public Object AlphabetClass;
	
	public static String encode(String text, Alphabet alphabet) throws ClassNotFoundException {
		text = text.replace("\r\n", "|");
		Stream<Character> textStream = text.chars()
				  .mapToObj(c -> (char) c);
		
		String result = textStream.map(c -> {
			try {
				return alphabet.findCode(c);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new UncheckedIOException(e);
			}
		}).collect(Collectors.joining(" "));
		
		return result;
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(Translator.encode("hello world",new BrailleAlphabet()));
		System.out.println(Translator.encode("how to convert a char to a string",new BrailleAlphabet()));
		
	}
}

	
	

