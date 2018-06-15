package eu.pontsystems.bottles;

import org.junit.Assert;
import org.junit.Test;



public class BottlesTest {
	
	@Test(expected=IllegalArgumentException.class)
	public void test1() throws ClassNotFoundException {
		BottlesOfBeer.verse(0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test2() throws ClassNotFoundException {
		BottlesOfBeer.verse(-10);
	}
	
	@Test
	public void test3() throws ClassNotFoundException {
		String expected = "99 bottles of beer on the wall, 99 bottles of beer.\r\n" + 
				"Take one down and pass it around, 98 bottles of beer on the wall.\n\n";					
        String actual = BottlesOfBeer.verse(99);				
        Assert.assertEquals(expected, actual);
	}
	@Test
	public void test4() throws ClassNotFoundException {
		String expected = "55 bottles of beer on the wall, 55 bottles of beer.\r\n" + 
				"Take one down and pass it around, 54 bottles of beer on the wall.\n\n";					
        String actual = BottlesOfBeer.verse(55);				

        Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test5() throws ClassNotFoundException {
		String expected = "11 bottles of beer on the wall, 11 bottles of beer.\r\n" + 
				"Take one down and pass it around, 10 bottles of beer on the wall.\n\n";					
        String actual = BottlesOfBeer.verse(11);				

        Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test6() throws ClassNotFoundException {
		String expected = "7 bottles of beer on the wall, 7 bottles of beer.\r\n" + 
				"Take one down and pass it around, 6 bottles of beer on the wall.\n\n";					
        String actual = BottlesOfBeer.verse(7);				

        Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test7() throws ClassNotFoundException {
		String expected = "1 bottle of beer on the wall, 1 bottle of beer.\r\n" + 
				"Take one down and pass it around, no more bottles of beer on the wall.\n\n" +
				"No more bottles of beer on the wall, no more bottles of beer. \r\n" + 
				"Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";
							
        String actual = BottlesOfBeer.verse(1);				

        Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test8() throws ClassNotFoundException {
		String expected = "25 bottles of beer on the wall, 25 bottles of beer.\r\n" + 
				"Take one down and pass it around, 24 bottles of beer on the wall.\n\n" + 
				 
				"24 bottles of beer on the wall, 24 bottles of beer.\r\n" + 
				"Take one down and pass it around, 23 bottles of beer on the wall.\n\n" + 
				
				"23 bottles of beer on the wall, 23 bottles of beer.\r\n" + 
				"Take one down and pass it around, 22 bottles of beer on the wall.\n\n";
							
        String actual = BottlesOfBeer.verses(25,22);				

        Assert.assertEquals(expected, actual);
	}

	@Test
	public void test9() throws ClassNotFoundException {
		String expected = "5 bottles of beer on the wall, 5 bottles of beer.\r\n" + 
				"Take one down and pass it around, 4 bottles of beer on the wall.\n\n" + 
				
				"4 bottles of beer on the wall, 4 bottles of beer.\r\n" + 
				"Take one down and pass it around, 3 bottles of beer on the wall.\n\n" + 
				
				"3 bottles of beer on the wall, 3 bottles of beer.\r\n" + 
				"Take one down and pass it around, 2 bottles of beer on the wall.\n\n" + 
				 
				"2 bottles of beer on the wall, 2 bottles of beer.\r\n" + 
				"Take one down and pass it around, 1 bottle of beer on the wall.\n\n" + 
				 
				"1 bottle of beer on the wall, 1 bottle of beer.\r\n" + 
				"Take one down and pass it around, no more bottles of beer on the wall.\n\n" + 
				 
				"No more bottles of beer on the wall, no more bottles of beer. \r\n" + 
				"Go to the store and buy some more, 99 bottles of beer on the wall.\n\n"; 
				
							
        String actual = BottlesOfBeer.verses(5,0);				

        Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void test10() throws ClassNotFoundException {
		String expected = BottlesOfBeer.sing(); 
        String actual = BottlesOfBeer.verses(99,0);				

        Assert.assertEquals(expected, actual);
	}
	
}

