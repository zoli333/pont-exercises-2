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
        System.out.println("Suite Test 1 is successful " + actual);			
	}

	
	@Test
	public void test2() {
		Morse m = new Morse();
		String expected = "- .... . -.-- .----. .-. . / - .-. -.-- .. -. --. / - --- / ... .- ...- . / --- -. / - .... . .. .-. / .--. .... --- -. . / -... .. .-.. .-..";					
        String actual = m.encode("THEY'RE TRYING TO SAVE ON THEIR PHONE BILL");				

        Assert.assertEquals(expected, actual);					
        System.out.println("Suite Test 2 is successful " + actual);			
		
	}
	
	@Test
	public void test3() {
		Morse m = new Morse();
		String expected=".... --- .-- / - --- / -.-. --- -. ...- . .-. - / .- / -.-. .... .- .-. / - --- / .- / ... - .-. .. -. --. ..--..";
		String actual = m.encode("How to convert a char to a String?");
		Assert.assertEquals(expected, actual);					
        System.out.println("Suite Test 3 is successful " + actual);		

	}
	
}
