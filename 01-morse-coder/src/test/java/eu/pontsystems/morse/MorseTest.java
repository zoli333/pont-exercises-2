
package eu.pontsystems.morse;

import org.junit.Assert;
import org.junit.Test;

public class MorseTest {
	
	@Test
	public void test1() {
		
		String expected = null;					
        String actual = Translator.encode("Hello World!");				

        Assert.assertEquals(expected, actual);					
        System.out.println("Suite Encode Test 1 is successful " + actual);        
        
	}

	
	@Test
	public void test2() {
		
		String expected = "- .... . -.-- .----. .-. . / - .-. -.-- .. -. --. / - --- / ... .- ...- . / --- -. / - .... . .. .-. / .--. .... --- -. . / -... .. .-.. .-..";					
        String actualEncoded = Translator.encode("THEY'RE TRYING TO SAVE ON THEIR PHONE BILL");				

        Assert.assertEquals(expected, actualEncoded);					
        System.out.println("Suite Encode Test 2 is successful " + actualEncoded);			
		
        
	}
	
	@Test
	public void test3() {
		String expected=".... --- .-- / - --- / -.-. --- -. ...- . .-. - / .- / -.-. .... .- .-. / - --- / .- / ... - .-. .. -. --. ..--..";
		String actual = Translator.encode("How to convert a char to a String?");
		Assert.assertEquals(expected, actual);					
        System.out.println("Suite Encode Test 3 is successful " + actual);

	}
	
	/**
	 * Test new line characters
	 */
	@Test
	public void test4() {
		String expected="----. ----. / -... --- - - .-.. . ... / --- ..-. / -... . . .-. / --- -. / - .... . / .-- .- .-.. .-.. --..-- / ----. ----. / -... --- - - .-.. . ... / --- ..-. / -... . . .-. .-.-.- / - .- -.- . / --- -. . / -.. --- .-- -. / .- -. -.. / .--. .- ... ... / .. - / .- .-. --- ..- -. -.. --..-- / ----. ---.. / -... --- - - .-.. . ... / --- ..-. / -... . . .-. / --- -. / - .... . / .-- .- .-.. .-.. .-.-.-";
		String actual = Translator.encode("99 bottles of beer on the wall, 99 bottles of beer.\r\n" + 
				"Take one down and pass it around, 98 bottles of beer on the wall.");
		Assert.assertEquals(expected, actual);					
        System.out.println("Suite Encode Test 4 is successful " + actual);

	}
	
		
	
	
}
