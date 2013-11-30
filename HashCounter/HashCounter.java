/*
 * Stanley Wong
 * HashCounter.java
 * This module takes in an array of numbers for input and
 * then lists the number of times each of them show up. 
 * 
 */

import java.util.HashMap;
import java.util.Set;

public class HashCounter {

	HashMap<Integer, Integer> numHash;

	public HashCounter(Integer[] intArray) {
		super();
		this.numHash = new HashMap<Integer, Integer>();

		/*
		 * Setup the the HashMap with numbers in the list.
		 */
		for (int number : intArray) {
			
			if(!numHash.containsKey(number))
				numHash.put(number, 1);
			else
				numHash.put(number, numHash.get(number) + 1);
			
		}

		/*
		 * Display results
		 */
		printoutResults();

	}

	/*
	 * Output results to standard output
	 */
	public void printoutResults() {

		Set<Integer> keySet = numHash.keySet();

		System.out.println("------------------");

		/*
		 * Traverse the keys and display the content
		 * of the HashMap
		 */
		for (Integer key : keySet) {
			System.out.println("Key: " + key + " | Value: " + numHash.get(key));
			System.out.println("------------------");
		}

	}

}// end Class
