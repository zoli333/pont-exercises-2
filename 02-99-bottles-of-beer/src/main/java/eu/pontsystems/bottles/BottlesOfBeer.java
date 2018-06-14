package eu.pontsystems.bottles;


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
	
	public void printOutBeer(int numberOfBottles) {
		if (numberOfBottles<0) {
			throw new IllegalArgumentException("number of bottles of beer cannot be less than 0!");
		}
		StringBuilder sb = new StringBuilder();
		String format = "%s of beer on the wall, %s bottles of beer.\nTake one down and pass it around, %s of beer on the wall.\n\n";
		for(int i = numberOfBottles; i > 0; i--) {
			String numOfBottles = (i > 1) ? String.valueOf(i + " bottles") : String.valueOf(i + " bottle");
			int decreasedBeer = i - 1;
			String takeDownBottles = (decreasedBeer == 0) ? String.valueOf("no more bottles") 
														  : String.valueOf( 
																  decreasedBeer==1
																	  		? (decreasedBeer + " bottle")
																	  		: (decreasedBeer + " bottles")
														   );
			System.out.printf(format, numOfBottles, numOfBottles, takeDownBottles); 
		}
		
		format = "No more bottles of beer on the wall, no more bottles of beer. \r\n" + 
				"Go to the store and buy some more, %s bottles of beer on the wall.";
		System.out.printf(format, String.valueOf(numberOfBottles));
	}
	
	
	public static void main(String[] args) {
		BottlesOfBeer bb = new BottlesOfBeer();
		bb.printOutBeer(99);
		//bb.printOutBeer(0);
		
	}

}
