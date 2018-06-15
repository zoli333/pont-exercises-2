package eu.pontsystems.bottles;

import java.io.PrintStream;

public class BottlesOfBeer {
	
	/**
	 * 
	 * @param numberOfBottles : number of bottles of beer as input
	 * This function generates the poet 99 bottles of beer.
	 * You input an integer number (the number of bottles of beers / beer),
	 * and the code generates the poet as string for you as well as prints it out
	 * your console.
	 *
	 * About the logic below, there are 3 parameters i: goes into the first row of the poet
	 *  and i-1: goes into the second row of the poet.
	 *  
	 *  @param numOfBottles: computes the number of beers to be displayed into the first row
	 *  @param decreasedBeer: helper parameter for decreased count of beer
	 *  @param takeDownBottles: number of beers as a counter going into the second row of the poet.
	 *  	This has two checks, whether the @decreasedBeer are equal to 0, then we 
	 *  	write out 'no more bottles', then we also check whether the number of beers are 0, then
	 *  	instead of bottles, we write bottle, else bottle. Then I also check whether the @decreasedBeer value is 1
	 *  	because of it can be misspelled when this is 1. This is important for the last but one row, to not to write
	 *  	out bottles instead of bottle
	 *  
	 */
	
	public static String sing() {
		return verses(99,0);
	}
	
	public static String verses(int start, int end) {
		StringBuilder sb = new StringBuilder();
		int i;
		for(i = start; i > end; i--) {
			sb.append(verse(i));
		}
		return sb.toString();
	}
	
	public static String verse(int number) {

		if(number<=0) {
			throw new IllegalArgumentException();
		}
		String numOfBottles = (number > 1) ? String.valueOf(number + " bottles") : String.valueOf(number + " bottle");
		int decreasedBeer = number - 1;
		String takeDownBottles = (decreasedBeer == 0) ? String.valueOf("no more bottles") 
													  : String.valueOf( 
															  decreasedBeer==1
																  		? (decreasedBeer + " bottle")
																  		: (decreasedBeer + " bottles")
													   );
		String result = "";
		result = numOfBottles+" of beer on the wall, " + numOfBottles +" of beer.\r\nTake one down and pass it around, "+takeDownBottles+" of beer on the wall.\n\n";
		if(decreasedBeer==0) {
			result+= ("No more bottles of beer on the wall, no more bottles of beer. \r\n" + 
					"Go to the store and buy some more, 99 bottles of beer on the wall.\n\n");
		}
		return result;
	}
	
	
	

}
