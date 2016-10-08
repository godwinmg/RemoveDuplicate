package dedup;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * This class can be used for removing the duplicates from an integer array.
 * 
 * @author godwin
 *
 */
public class RemoveDuplicates {

	public RemoveDuplicates() {
		super();
	}

	/**
	 * This method accepts an array of Integers and convert it to a list. When
	 * we create List from array of primitive values, java wont automatically do
	 * boxing
	 * 
	 * @param dupArray
	 * @return List<Integer>
	 */
	public List<Integer> removeDuplicate(int[] dupArray) {
		List<Integer> listOfInteger = IntStream.of(dupArray).boxed().collect(Collectors.toList());
		HashSet<Integer> uniqueSet = new HashSet<Integer>(listOfInteger);
		// uniqueSet.forEach(arg0 -> System.out.println(arg0));
		return new ArrayList<Integer>(uniqueSet);

	}

	/**
	 * This method accepts an array of Integers and converts it to a List. Then
	 * it uses LinkedHashSet to remove duplicates and retain the order.
	 * 
	 * @param dupArray
	 * @return
	 */
	public List<Integer> removeDuplicatesAndRetainOrder(int[] dupArray) {
		List<Integer> listOfInteger = IntStream.of(dupArray).boxed().collect(Collectors.toList());
		LinkedHashSet<Integer> orderedUniqueSet = new LinkedHashSet<Integer>(listOfInteger);
		// orderedUniqueSet.forEach(display -> System.out.println(display));
		return new ArrayList<Integer>(orderedUniqueSet);
	}

	public static void main(String args[]) {
		int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18,
				4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
				19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

		RemoveDuplicates obj = new RemoveDuplicates();
		System.out.println("***********Removing duplicates*********");
		obj.removeDuplicate(randomIntegers).forEach(action -> System.out.printf(" %d ", action));
		System.out.println("\n***********Removing duplicates And retain order *********");
		obj.removeDuplicatesAndRetainOrder(randomIntegers).forEach(action -> System.out.printf(" %d ", action));
	}
}