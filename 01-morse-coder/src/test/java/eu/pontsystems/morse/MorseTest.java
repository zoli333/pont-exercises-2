package eu.pontsystems.morse;

import org.junit.Assert;
import org.junit.Test;

public class MorseTest {
	
	@Test
	public void test1() {
		Morse m = new Morse();
		String expected = null;					
        String actual = m.encode("Hello World!");				

        Assert.assertEquals(expected, actual);					
        System.out.println("Suite Encode Test 1 is successful " + actual);        
        
	}

	
	@Test
	public void test2() {
		Morse m = new Morse();
		String expected = "- .... . -.-- .----. .-. . / - .-. -.-- .. -. --. / - --- / ... .- ...- . / --- -. / - .... . .. .-. / .--. .... --- -. . / -... .. .-.. .-..";					
        String actualEncoded = m.encode("THEY'RE TRYING TO SAVE ON THEIR PHONE BILL");				

        Assert.assertEquals(expected, actualEncoded);					
        System.out.println("Suite Encode Test 2 is successful " + actualEncoded);			
		
        System.out.println();
        expected = "THEY'RE TRYING TO SAVE ON THEIR PHONE BILL";
        String actualDecoded = m.decode(actualEncoded);
        Assert.assertEquals(expected, actualDecoded);					
        System.out.println("Suite Decode Test 2 is successful " + actualDecoded);
        
	}
	
	@Test
	public void test3() {
		Morse m = new Morse();
		String expected=".... --- .-- / - --- / -.-. --- -. ...- . .-. - / .- / -.-. .... .- .-. / - --- / .- / ... - .-. .. -. --. ..--..";
		String actual = m.encode("How to convert a char to a String?");
		Assert.assertEquals(expected, actual);					
        System.out.println("Suite Encode Test 3 is successful " + actual);
        
        

	}
	
}
