package dedup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This TestClass is used to test the methods in @see DeDuplicate
 * 
 * @author godwin
 *
 */
public class DeDuplicateTest {

	int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18, 4,
			9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6, 19, 13,
			5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	@Test
	public void testRemoveDuplicate() {

		List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
				14, 15, 10000, 16, 17, 18, 19, 20, 25, 26, 34, 43, 45, 85, 86));
		DeDuplicate rd = new DeDuplicate();
		List<Integer> actualResult = rd.removeDuplicate(randomIntegers);
		Assert.assertNotNull(actualResult);
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Test
	public void testRemoveDuplicateAndRetainOrder() {

		List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(1, 2, 34, 25, 45, 3, 26, 85, 4, 86, 43,
				10000, 11, 16, 19, 18, 9, 20, 17, 8, 15, 6, 5, 10, 14, 12, 13, 7));
		DeDuplicate rd = new DeDuplicate();
		List<Integer> actualResult = rd.removeDuplicatesAndRetainOrder(randomIntegers);
		Assert.assertNotNull(actualResult);
		Assert.assertEquals(actualResult, expectedResult);

	}

	@Test
	public void removeDuplicateGuavaTest() {

		List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(1, 2, 34, 25, 45, 3, 26, 85, 4, 86, 43,
				10000, 11, 16, 19, 18, 9, 20, 17, 8, 15, 6, 5, 10, 14, 12, 13, 7));
		DeDuplicate rd = new DeDuplicate();
		List<Integer> actualResult = rd.removeDuplicateFast(randomIntegers);
		Assert.assertNotNull(actualResult);
		Assert.assertEquals(actualResult, expectedResult);
	}

}
