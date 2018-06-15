
package eu.pontsystems.morse;

import java.io.UncheckedIOException;

import org.junit.Assert;
import org.junit.Test;

public class MorseBrailleCoderTest {
	
	// ----------------- MORSE CODE TEST CASES -------------- //
	
	@Test(expected=UncheckedIOException.class)
	public void test1() throws ClassNotFoundException {
		
		Translator.encode("Hello World!", new MorseAlphabet());
        System.out.println("Suite Encode Test 1 is successful ");
	}
	
	@Test
	public void test2() throws ClassNotFoundException {
		
		String expected = "- .... . -.-- .----. .-. . / - .-. -.-- .. -. --. / - --- / ... .- ...- . / --- -. / - .... . .. .-. / .--. .... --- -. . / -... .. .-.. .-..";					
        String actualEncoded = Translator.encode("THEY'RE TRYING TO SAVE ON THEIR PHONE BILL", new MorseAlphabet());				

        Assert.assertEquals(expected, actualEncoded);					
        System.out.println("Suite Encode Test 2 is successful " + actualEncoded);			
		
        
	}
	
	@Test(expected=UncheckedIOException.class)
	public void test3() throws ClassNotFoundException {
		
		Translator.encode("How to convert a char to a String?", new MorseAlphabet());
		System.out.println("Suite Encode Test 3 is successful ");

	}
	
	
	@Test
	public void test4() throws ClassNotFoundException {
		String expected="----. ----. / -... --- - - .-.. . ... / --- ..-. / -... . . .-. / --- -. / - .... . / .-- .- .-.. .-.. --..-- / ----. ----. / -... --- - - .-.. . ... / --- ..-. / -... . . .-. .-.-.- / - .- -.- . / --- -. . / -.. --- .-- -. / .- -. -.. / .--. .- ... ... / .. - / .- .-. --- ..- -. -.. --..-- / ----. ---.. / -... --- - - .-.. . ... / --- ..-. / -... . . .-. / --- -. / - .... . / .-- .- .-.. .-.. .-.-.-";
		String actual = Translator.encode(("99 bottles of beer on the wall, 99 bottles of beer.\r\n" + 
				"Take one down and pass it around, 98 bottles of beer on the wall.").toUpperCase(), new MorseAlphabet());
		Assert.assertEquals(expected, actual);					
        System.out.println("Suite Encode Test 4 is successful " + actual);

	}
	
	
	// ----------------- BRAILLE CODE TEST CASES -------------- //
	
	@Test(expected=UncheckedIOException.class)
	public void test5() throws ClassNotFoundException {
		
		Translator.encode("THEY'RE TRYING TO SAVE ON THEIR PHONE BILL", new BrailleAlphabet());				
        System.out.println("Suite Encode Test 5 is successful ");
	}
	
	@Test
	public void test6() throws ClassNotFoundException {

		String expected = "10259 10261 10298 10240 10270 10261 10240 10249 10261 10269 10279 10257 10263 10270 10240 10242 10240 10249 10259 10242 10263 10240 10270 10261 10240 10242 10240 10254 10270 10263 10250 10269 10267";					
		
		String actual = Translator.encode("how to convert a char to a string", new BrailleAlphabet());
		 Assert.assertEquals(expected, actual);				
        System.out.println("Suite Encode Test 6 is successful ");
	}
	
	
	@Test(expected=UncheckedIOException.class)
	public void test7() throws ClassNotFoundException {
		
		Translator.encode("THEY'RE TRYING TO SAVE ON THEIR PHONE BILL", new BrailleAlphabet());				
        System.out.println("Suite Encode Test 7 is successful ");			
		
        
	}
}
