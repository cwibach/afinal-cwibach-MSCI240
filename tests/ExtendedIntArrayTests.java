/* Carter Ibach (20903582)
 * Final Assignment Coding Challenge
 * Started December 14th 2021
 * Finished December 14th 2021
 * This consists of test cases to check all constructors and methods of the 
 * 	ExtendedIntArray class
 */

import static org.junit.Assert.*; 
import org.junit.Test; // Used for writing of Junit tests

public class ExtendedIntArrayTests {
	@SuppressWarnings("unused")
	@Test
	public void testCreateSimpleArray() {
		/* Test creating an ExtendedIntArray with a simple array of integers
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testCreateBlankArray() {
		/* Test creating an ExtendedIntArray with an empty array
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {});
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testCreateNoArray() {
		/* Test creating an ExtendedIntArray with no array
		 */
		ExtendedIntArray array = new ExtendedIntArray();
	}
	
	@Test
	public void testSimpleArrayToString() {
		/* Test the string value of an ExtendedIntArray with integers
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		// check the string version
		assertEquals("[1, 3, 5, 7]", array.toString()); 
	}
	
	@Test
	public void testBlankArrayToString() {
		/* Test the string value of an ExtendedIntArray with a blank array
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {});
		
		assertEquals("[]", array.toString()); // check the string version
	}
	
	@Test
	public void testNoArrayToString() {
		/* Test the string value of an ExtendedIntArray with no input
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		assertEquals("[]", array.toString()); // check the string version
	}

	@Test
	public void testSimpleArrayLength() {
		/* Ensure the length of an ExtendedIntArray with an array of integers
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertEquals(4, array.getLength()); // ensure the length is 4
	}
	
	@Test
	public void testBlankArrayLength() {
		/* Ensure the length of an ExtendedIntArray with a blank array
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {});
		
		assertEquals(0, array.getLength()); // ensure the length is 0
	}
	
	@Test
	public void testNoArrayLength() {
		/* Ensure the length of an ExtendedIntArray with no input
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		assertEquals(0, array.getLength()); // ensure the length is 0
	}
	
	@Test
	public void testAddToEnd() {
		/* Test adding an integer to the end of an ExtendedIntArray
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		array.addToEnd(1); // add a 1 to the end
	}
	
	@Test
	public void testAddToEndRepeated() {
		/* Test adding multiple integers to an ExtendedIntArray
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		// Add 1 through 5 to the end of the ExtendedIntArray
		array.addToEnd(1);
		array.addToEnd(2);
		array.addToEnd(3);
		array.addToEnd(4);
		array.addToEnd(5);
	}
	
	@Test
	public void testAddToEndRepeatedToString() {
		/* Test that the string output is correct after adding integers
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		// add integers from 1 to 5 to the ExtendedIntArray
		array.addToEnd(1);
		array.addToEnd(2);
		array.addToEnd(3);
		array.addToEnd(4);
		array.addToEnd(5);
		
		// check the string output
		assertEquals("[1, 2, 3, 4, 5]", array.toString());
	}
	
	@Test
	public void testAddToEndRepeatedLength() {
		/* Test that the length changes as integers are added
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		// check the initial length
		assertEquals(0, array.getLength());
		
		// add every integer from 1 to 5 to the ExtendedIntArray
		array.addToEnd(1);
		array.addToEnd(2);
		array.addToEnd(3);
		array.addToEnd(4);
		array.addToEnd(5);
		
		// check the final length
		assertEquals(5, array.getLength());
	}
	
	@Test
	public void testGetSumSimple() {
		/* Test getting the sum of an ExtendedIntArray with integers
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertEquals(16, array.getSum()); // ensure the sum is 16
	}
	
	@Test
	public void testGetSumBlank() {
		/* Test getting the sum of an empty ExtendedIntArray
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		assertEquals(0, array.getSum()); // ensure the sum is 0
	}
	
	@Test
	public void testGetSumZero() {
		/* Test getting a sum of zero from an ExtendedIntArray
		 */
		ExtendedIntArray array = 
				new ExtendedIntArray(new int[] {5, 8, 4, -17});
		
		assertEquals(0, array.getSum()); // ensure the sum is 0
	}
	
	@Test
	public void testGetSumAddChanges() {
		/* Test the sum changes as integers are added
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertEquals(16, array.getSum()); // ensure the initial sum is 16
		
		array.addToEnd(-3); // add a -3 to the ExtendedIntArray
		
		assertEquals(13, array.getSum()); // ensure the sum is now 13
		
		array.addToEnd(7); // add a 7 to the ExtendedIntArray
		
		assertEquals(20, array.getSum()); // ensure the sum is now 20
		
		array.addToEnd(300); // add a 300 to the ExtendedIntArray
		
		assertEquals(320, array.getSum()); // ensure the sum is now 320
	}
	
	@Test
	public void testGetMeanSimple() {
		/* Test getting the mean of an ExtendedIntArray with integers
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		// ensure the mean is 4
		assertEquals(4, array.getMean(), 0.01);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testGetMeanBlank() {
		/* Test getting the mean of an empty ExtendedIntArray,
		 * 		Expect an IllegalArgumentException (length = 0)
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		// check the mean for 0 (what it could be considered)
		assertEquals(0, array.getMean(), 0.01);
	}
	
	@Test
	public void testGetMeanZero() {
		/* Test getting a zero mean of an ExtendedIntArray
		 */
		ExtendedIntArray array = 
				new ExtendedIntArray(new int[] {5, 8, 4, -17});
		
		// Ensure the mean is zero
		assertEquals(0, array.getMean(), 0.01);
	}
	
	@Test
	public void testGetMeanAddChanges() {
		/* Test that the mean changes as integers are added to 
		 * 	the ExtendedIntArray
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		// ensure the initial mean is 4
		assertEquals(4, array.getMean(), 0.01);
		
		array.addToEnd(-3); // add -3 to the ExtendedIntArray
		
		// ensure the mean is now 2.6
		assertEquals(2.6, array.getMean(), 0.01);
		
		array.addToEnd(7); // add 7 to the ExtendedIntArray
		
		// ensure the mean is now 3.3333
		assertEquals(3.33333333, array.getMean(), 0.01);
		
		array.addToEnd(300); // add 300 to the ExtendedIntArray
		
		// ensure the mean is now 46.7143
		assertEquals(45.7143, array.getMean(), 0.01);
	}
	
	@Test
	public void testGetStdDevSimple() {
		/* Test the standard deviation of an ExtendedIntArray with integers
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		// Ensure the standard deviation is the square root of 5
		assertEquals(Math.sqrt(5), array.getStandardDeviation(), 0.01);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testGetStdDevBlank() {
		/* Test the standard deviation of an empty ExtendedIntArray
		 * 		Expect an IllegalArgumentException (length = 0)
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		// check if the standard deviation is 0 (what it could be considered)
		assertEquals(0, array.getStandardDeviation(), 0.01);
	}
	
	@Test
	public void testGetStdDevZero() {
		/* Test getting the standard deviation of an ExtendedIntArray where 
		 * 		the standard deviation is 0
		 */
		ExtendedIntArray array = 
				new ExtendedIntArray(new int[] {8, 8, 8, 8, 8, 8, 8});
		
		// Ensure the standard deviation is 0
		assertEquals(0, array.getStandardDeviation(), 0.01);
	}

	@Test
	public void testGetStdDevAddChanges() {
		/* Test that the standard deviation changes as integers are added
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		// Ensure the initial standard deviation is square root of 5
		assertEquals(Math.sqrt(5), array.getStandardDeviation(), 0.01);
		
		array.addToEnd(9); // add a 9 to the ExtendedIntArray
		
		// Ensure the standard deviation is square root of 8
		assertEquals(Math.sqrt(8), array.getStandardDeviation(), 0.01);
		
		array.addToEnd(5); // add a 5 to the ExtendedIntArray
		
		// Ensure the standard deviation is square root of 6.6667
		assertEquals(Math.sqrt(6.66667), array.getStandardDeviation(), 0.01);
		
		array.addToEnd(6); // add a 6 to the ExtendedIntArray
		
		// Ensure the standard deviation is square root of 5.8367
		assertEquals(Math.sqrt(5.8367), array.getStandardDeviation(), 0.01);
	}
	
	@Test
	public void testIsSorted() {
		/* Test that an ExtendedIntArray starts as unsorted and that sorting 
		 * 	works and changes the sorted status
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertFalse(array.isSorted()); // Ensure it is not initially sorted
		
		array.sortArray(); // Sort the ExtendedIntArray
		
		assertTrue(array.isSorted()); // Ensure it is now sorted
	}
	
	@Test
	public void testIsSortedAddChanges() {
		/* Ensure that an ExtendedIntArray becomes unsorted when adding
		 * 	an integer to the end
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertFalse(array.isSorted()); // Ensure it begins unsorted
		
		array.sortArray(); // Sort the ExtendedIntArray
		
		assertTrue(array.isSorted()); // Ensure it is now sorted
		
		array.addToEnd(15); // Add a 15 to the ExtendedIntArray
		
		assertFalse(array.isSorted()); // Ensure it is no longer sorted
	}
	
	@Test
	public void testSorting1() {
		/* Test that sorting an ExtendedIntArray puts the integers in 
		 * 	increasing order
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {3, 5, 1, 7});
		
		// Sort the ExtendedIntArray
		array.sortArray();
		
		// Check the string version
		assertEquals("[1, 3, 5, 7]", array.toString());
	}
	
	@Test
	public void testSorting2() {
		/* Test that sorting an ExtendedIntArray with negatives puts 
		 * 	the integers in increasing order
		 * 
		 */
		int[] temp = new int[] {0, -1, -7, 8, 3};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);
			
		// Sort the ExtendedIntArray
		array.sortArray();
		
		// Check the string version
		assertEquals("[-7, -1, 0, 3, 8]", array.toString());
	}
	
	@Test
	public void testSorting3() {
		/* Test that sorting a decreasing order ExtendedIntArray 
		 * 	puts the integers in increasing order
		 * 
		 */
		int[] temp = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);
		
		// Sort the ExtendedIntArray
		array.sortArray();
		
		// Check the string version
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", array.toString());
	}
	
	@Test
	public void testSortingAddRepeat() {
		/* Test that adding an integer to a sorted ExtendedIntArray then 
		 * 	re-sorting puts the integers in increasing order
		 */
		int[] temp = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);

		array.sortArray(); // Sort the ExtendedIntArray
		
		// Check the string version
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", array.toString());
		
		array.addToEnd(0); // Add a 0 to the ExtendedIntArray
		
		array.sortArray(); // Re-sort the ExtendedIntArray
		
		// Check the string version
		assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", array.toString());
	}

	@Test (expected = IllegalArgumentException.class)
	public void testBlankFind3() {
		/* Test finding 3 for an empty ExtendedIntArray
		 * 		Expect an IllegalArgumentException (length < 3)
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		// Search for a sum of 0
		array.find3Numbers(0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testTooShortFind3() {
		/* Test finding 3 in an ExtendedIntArray between length 0 and 3
		 * 		Expect IllegalArgumentException (length < 3)
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 4});
		
		// Search for a sum of 0
		array.find3Numbers(0);
	}
	
	@Test
	public void testFind3Length3() {
		/* Test finding 3 in an ExtendedIntArray of length 3 that adds 
		 * 	up to the target sum
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {0, 1, 5});
		
		int expectedSum = 6; // sum to find
		
		// get array of indices
		int[] result = array.find3Numbers(expectedSum); 
		
		// get the sum of values at the indices
		int actualSum = array.get(result[0]) + array.get(result[1]) 
			+ array.get(result[2]);
		
		// Ensure the two sums are equal
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testFind3Length5() {
		/* Test finding 3 in an ExtendedIntArray of length 5 that has 
		 * integers that add up to the target sum
		 */
		int[] temp = new int[] {-7, -3, 5, 6, 10};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);
		
		int expectedSum = 13; // sum to find
		
		// get array of indices
		int[] result = array.find3Numbers(expectedSum);
		
		// get the sum of values at the indices
		int actualSum = array.get(result[0]) + array.get(result[1]) 
			+ array.get(result[2]);
		
		// Ensure the two sums are equal
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testFind3LongList() {
		/* Test finding 3 in a long ExtendedIntArray that has integers 
		 * 	that add up to the target sum
		 */
		int[] temp = 
				new int[] {0, 3, 12, 20, 35, 52, 67, 80, 104, 30005, 61234};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);
		
		int expectedSum = 91343; // sum to find
		
		// get array of indices
		int[] result = array.find3Numbers(expectedSum);
		
		// get the sum of values at the indices
		int actualSum = array.get(result[0]) + array.get(result[1]) 
			+ array.get(result[2]);
		
		// Ensure the two sums are equal
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testFind3UnsortedLength3() {
		/* Test finding 3 in an unsorted ExtendedIntArray of length 3 that
		 *  adds up to the target sum
		 */
		int[] temp = new int[] {1, 0, 5};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);
		
		int expectedSum = 6; // sum to find
		
		// get array of indices
		int[] result = array.find3Numbers(expectedSum);
		
		// get sum of values at indices
		int actualSum = array.get(result[0]) + array.get(result[1]) 
			+ array.get(result[2]);
		
		// ensure the two sums are equal
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testFind3UnsortedLength5() {
		/* Test finding 3 in an unsorted ExtendedIntArray of length 5 that
		 *  adds up to the target sum
		 */
		int[] temp = new int[] {5, 10, -3, -7, 6};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);
		
		int expectedSum = 13; // sum to find
		
		// get array of indices
		int[] result = array.find3Numbers(expectedSum);
		
		// get sum of values at indices
		int actualSum = array.get(result[0]) + array.get(result[1]) 
			+ array.get(result[2]);
		
		// ensure the two sums are equal
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testFind3NoSolution() {
		/* Test finding 3 in an ExtendedIntArray that has no solution
		 */
		int[] temp = new int[] {0, 3, 5, 13};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);
		
		int expectedSum = -2; // sum to find
		
		// get array of indices 
		int[] result = array.find3Numbers(expectedSum);
		
		// ensure result is null
		assertEquals(null, result);
	}
	
	public void testFind3NoSolutionAddForSolution() {
		/* Test finding 3 in an ExtendedIntArray that has no solution 
		 * 	then add an integer to make a solution and check again
		 */
		int[] temp = new int[] {0, 3, 5, 13};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);
		
		int expectedSum = -2; // sum to find
		
		// get array of indices
		int[] result = array.find3Numbers(expectedSum);
		
		// ensure initial result is null
		assertEquals(null, result);
		
		array.addToEnd(-15); // add a -15 to the ExtendedIntArray
		
		// get new array of indices
		result = array.find3Numbers(expectedSum);
		
		// get the sum of values at indices
		int actualSum = array.get(result[0]) + array.get(result[1]) 
			+ array.get(result[2]);
		
		// ensure the two sums are equal
		assertEquals(expectedSum, actualSum);
	}
}
