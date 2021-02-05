/**
 * This code is part of the lab exercises for the Data Structures course at Harokopio
 * University of Athens, Dept. of Informatics and Telematics.
 */
package org.hua.darray;

import java.util.Random;

public class App {

	public static final int ELEMENTS = 100;
	public static final int RANGE = 1000;

	public static void main(String args[]) {
		
		Random rng = new Random();

		DArray<Integer> v = new DynamicArray<>();

		for (int i = 0; i < ELEMENTS; i++) {
			v.add(rng.nextInt(RANGE));
		}
		
		for (int i = 0; i < ELEMENTS; i++) {
			System.out.println(v.get(i));
		}
		
	}

}
