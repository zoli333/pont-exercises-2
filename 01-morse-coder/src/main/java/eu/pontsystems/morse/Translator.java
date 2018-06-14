package eu.pontsystems.morse;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Translator {
	
	public Translator() {
		new Alphabet();
	}
	
	public static String encode(String text) {
		text = text.replace("\r\n", "|");
		text = text.toUpperCase();
		Stream<Character> textStream = text.chars()
				  .mapToObj(c -> (char) c);
		
		String result = textStream.map(c -> Alphabet.findCode(c)).collect(Collectors.joining());
		
		if(result.contains("null")) {
			return null;
		}else {
			return result.trim();
		}
		
	}
	
	public static void main(String[] args) {
		Translator.encode("Hello World!");
	}
	
	
}
