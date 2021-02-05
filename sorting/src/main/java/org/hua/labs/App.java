/**
 * This code is part of the lab exercises for the Data Structures course at Harokopio
 * University of Athens, Dept. of Informatics and Telematics.
 */
package org.hua.labs;

import java.util.Random;

public class App {

	private static void usage() {
		System.out.println("Usage: driver algorithm count seed\n");
		System.out.println("algorithm is one of quicksort, mergesort, selectionsort, insertionsort, bubblesort\n");
		System.out.println("count is the number of element to sort\n");
		System.out.println("seed is the seed for the random number generator\n");
		System.exit(0);
	}

	public static void main(String args[]) {

		if (args.length != 3) {
			usage();
		}

		int count = Integer.parseInt(args[1]);
		if (count == 0) {
			usage();
		}

		int seed = Integer.parseInt(args[2]);
		Random rng = new Random(seed);

		int[] array = new int[count];

		for (int i = 0; i < count; i++) {
			array[i] = rng.nextInt() % 1000;
		}

		long start = System.currentTimeMillis();

		switch (args[0]) {
		case "quicksort":
			Sorting.quickSort(array, count, rng);
			break;
		case "mergesort":
			Sorting.mergeSort(array, count);
			break;
		case "selectionsort":
			Sorting.selectionSort(array, count);
			break;
		case "insertionsort":
			Sorting.insertionSort(array, count);
			break;
		default:
			Sorting.bubbleSort(array, count);
		}

		long end = System.currentTimeMillis();

		for (int i = 1; i < count; i++) {
			assert (array[i] >= array[i - 1]);
		}

		double elapsed = ((double) end - start) / 1000.0;
		System.out.println(
				String.format("Algorithm %s took %.9f seconds to sort %d elements.\n", args[0], elapsed, count));

	}

}
