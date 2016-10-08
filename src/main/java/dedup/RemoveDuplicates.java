package dedup;

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
		uniqueSet.forEach(arg0 -> System.out.println(arg0));
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
		orderedUniqueSet.forEach(display -> System.out.println(display));
		return new ArrayList<Integer>(orderedUniqueSet);
	}
}