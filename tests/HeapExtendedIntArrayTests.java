/* Carter Ibach (20903582)
 * Final Assignment Coding Challenge
 * Started December 15th 2021
 * Finished December 15th 2021
 * This class contains tests to check all constructors and methods of all 
 * 	types of HeapExtendedIntArrays
 */

import static org.junit.Assert.*; 
import org.junit.Test; // Used for writing of Junit tests
import java.util.NoSuchElementException;

public class HeapExtendedIntArrayTests {
	@SuppressWarnings("unused")
	@Test
	public void testCreateSumHeap() {
		/* Test to create a Heap for sums of ExtendedIntArrays
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArraySumMin();
	}

	@Test
	public void testAddOneSumHeap() {
		/* Test adding one ExtendedIntArray to a sum heap
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArraySumMin();
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 4});
		
		heap.add(array); // add the ExtendedIntArray to the heap
	}
	
	@Test
	public void testAddMultipleSumHeap() {
		/* Test adding multiple ExtendedIntArrays to a sum heap
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArraySumMin();
		
		// Create six valid (length > 0) ExtendedIntArrays 
		ExtendedIntArray array1 = new ExtendedIntArray(new int[] {1, 3, 4});
		ExtendedIntArray array2 = new ExtendedIntArray(new int[] {-8, -2, 0});
		ExtendedIntArray array3 = new ExtendedIntArray(new int[] {0, 0, 0});
		ExtendedIntArray array4 = new ExtendedIntArray(new int[] {12, 0, -3});
		ExtendedIntArray array5 = new ExtendedIntArray(new int[] {8, 0, 0, 8});
		ExtendedIntArray array6 = new ExtendedIntArray(new int[] {50});
		
		// Add all 6 ExtendedIntArrays to the heap
		heap.add(array1);
		heap.add(array2);
		heap.add(array3);
		heap.add(array4);
		heap.add(array5);
		heap.add(array6);
	}
	
	@Test
	public void testRemoveTopSumHeap() {
		/* Test adding ExtendedIntArrays to sum heap and removing top, ensure 
		 * 	top is same as ExtendedIntArray with lowest sum.
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArraySumMin();
		
		// Create six valid (length > 0) ExtendedIntArrays 
		ExtendedIntArray array1 = new ExtendedIntArray(new int[] {1, 3, 4});
		ExtendedIntArray array2 = new ExtendedIntArray(new int[] {-8, -2, 0});
		ExtendedIntArray array3 = new ExtendedIntArray(new int[] {0, 0, 0});
		ExtendedIntArray array4 = new ExtendedIntArray(new int[] {12, 0, -3});
		ExtendedIntArray array5 = new ExtendedIntArray(new int[] {8, 0, 0, 8});
		ExtendedIntArray array6 = new ExtendedIntArray(new int[] {50});
		
		// Add all 6 ExtendedIntArrays to the heap
		heap.add(array1);
		heap.add(array2);
		heap.add(array3);
		heap.add(array4);
		heap.add(array5);
		heap.add(array6);
		
		// Remove the top ExtendedIntArray from the heap
		ExtendedIntArray first = heap.remove();
		
		// Ensure the top ExtendedIntArray is the same as the ExtendedIntArray 
		// 		with the lowest sum
		assertEquals(array2, first);
	}
	
	@Test
	public void testRemoveAllSumHeap() {
		/* Test adding several ExtendedIntArrays to a sum heap and removing 
		 * 	them all. Ensure order removed in is from smallest sum to largest
		 * 	sum.
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArraySumMin();
		
		// Create six valid (length > 0) ExtendedIntArrays 
		ExtendedIntArray array1 = new ExtendedIntArray(new int[] {1, 3, 4});
		ExtendedIntArray array2 = new ExtendedIntArray(new int[] {-8, -2, 0});
		ExtendedIntArray array3 = new ExtendedIntArray(new int[] {0, 0, 0});
		ExtendedIntArray array4 = new ExtendedIntArray(new int[] {12, 0, -3});
		ExtendedIntArray array5 = new ExtendedIntArray(new int[] {8, 0, 0, 8});
		ExtendedIntArray array6 = new ExtendedIntArray(new int[] {50});
		
		// Add all 6 ExtendedIntArrays to the heap
		heap.add(array1);
		heap.add(array2);
		heap.add(array3);
		heap.add(array4);
		heap.add(array5);
		heap.add(array6);
		
		// Remove all 6 ExtendedIntArrays from the heap
		ExtendedIntArray first = heap.remove();
		ExtendedIntArray second = heap.remove();
		ExtendedIntArray third = heap.remove();
		ExtendedIntArray fourth = heap.remove();
		ExtendedIntArray fifth = heap.remove();
		ExtendedIntArray last = heap.remove();
		
		// Ensure the order removed in is as expected
		assertEquals(array2, first);
		assertEquals(array3, second);
		assertEquals(array1, third);
		assertEquals(array4, fourth);
		assertEquals(array5, fifth);
		assertEquals(array6, last);
	}
	
	@SuppressWarnings("unused")
	@Test (expected = NoSuchElementException.class)
	public void testRemoveNoElementsSumHeap() {
		/* Test to remove element when none exist
		 * 		Expect NoSuchElementException (no elements added)
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArraySumMin();
		
		// Attempt to remove top item
		ExtendedIntArray array = heap.remove();
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testCreateMeanHeap() {
		/* Test to create a Heap for means of ExtendedIntArrays
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArrayMeanMax();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreateIllegalMeanHeap() {
		/* Test creating a mean heap and adding empty ExtendedIntArrays
		 * 		Expect IllegalArgumentException (length = 0)
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArrayMeanMax();
		
		// Create two empty ExtendedIntArrays
		ExtendedIntArray array1 = new ExtendedIntArray();
		ExtendedIntArray array2 = new ExtendedIntArray();
		
		// add both ExtendedIntArrays to the heap
		heap.add(array1);
		heap.add(array2);
	}
	
	@Test
	public void testAddOneMeanHeap() {
		/* Testing adding one ExtendedIntArray to a mean heap
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArrayMeanMax();
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 4});
		
		heap.add(array); // add the ExtendedIntArray to the heap
	}
	
	@Test
	public void testAddMultipleMeanHeap() {
		/* Test adding multiple ExtendedIntArrays to a mean heap
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArrayMeanMax();
		
		// Create six valid (length > 0) ExtendedIntArrays 
		ExtendedIntArray array1 = new ExtendedIntArray(new int[] {1, 3, 4});
		ExtendedIntArray array2 = new ExtendedIntArray(new int[] {-8, -2, 0});
		ExtendedIntArray array3 = new ExtendedIntArray(new int[] {0, 0, 0});
		ExtendedIntArray array4 = new ExtendedIntArray(new int[] {12, 0, -3});
		ExtendedIntArray array5 = new ExtendedIntArray(new int[] {8, 0, 0, 8});
		ExtendedIntArray array6 = new ExtendedIntArray(new int[] {50});
		
		// Add all 6 ExtendedIntArrays to the heap
		heap.add(array1);
		heap.add(array2);
		heap.add(array3);
		heap.add(array4);
		heap.add(array5);
		heap.add(array6);
	}
	
	@Test
	public void testRemoveTopMeanHeap() {
		/* Test adding ExtendedIntArrays to mean heap and removing top, ensure 
		 * 	top is same as ExtendedIntArray with highest mean.
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArrayMeanMax();
		
		// Create six valid (length > 0) ExtendedIntArrays 
		ExtendedIntArray array1 = new ExtendedIntArray(new int[] {1, 3, 4});
		ExtendedIntArray array2 = new ExtendedIntArray(new int[] {-8, -2, 0});
		ExtendedIntArray array3 = new ExtendedIntArray(new int[] {0, 0, 0});
		ExtendedIntArray array4 = new ExtendedIntArray(new int[] {12, 0, -3});
		ExtendedIntArray array5 = new ExtendedIntArray(new int[] {8, 0, 0, 8});
		ExtendedIntArray array6 = new ExtendedIntArray(new int[] {50});
		
		// Add all 6 ExtendedIntArrays to the heap
		heap.add(array1);
		heap.add(array2);
		heap.add(array3);
		heap.add(array4);
		heap.add(array5);
		heap.add(array6);
		
		// Remove the top ExtendedIntArray from the heap
		ExtendedIntArray first = heap.remove();
		
		// Ensure the top ExtendedIntArray is the same as the ExtendedIntArray 
		// 		with the highest mean
		assertEquals(array6, first);
	}
	
	@Test
	public void testRemoveAllMeanHeap() {
		/* Test adding several ExtendedIntArrays to a mean heap and removing 
		 * 	them all. Ensure order removed in is from largest mean to 
		 * 	smallest mean
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArrayMeanMax();
		
		// Create six valid (length > 0) ExtendedIntArrays 
		ExtendedIntArray array1 = new ExtendedIntArray(new int[] {1, 3, 4});
		ExtendedIntArray array2 = new ExtendedIntArray(new int[] {-8, -2, 0});
		ExtendedIntArray array3 = new ExtendedIntArray(new int[] {0, 0, 0});
		ExtendedIntArray array4 = new ExtendedIntArray(new int[] {12, 0, -3});
		ExtendedIntArray array5 = new ExtendedIntArray(new int[] {8, 0, 0, 8});
		ExtendedIntArray array6 = new ExtendedIntArray(new int[] {50});
		
		// Add all 6 ExtendedIntArrays to the heap
		heap.add(array1);
		heap.add(array2);
		heap.add(array3);
		heap.add(array4);
		heap.add(array5);
		heap.add(array6);
		
		// Remove all 6 ExtendedIntArrays from the heap
		ExtendedIntArray first = heap.remove();
		ExtendedIntArray second = heap.remove();
		ExtendedIntArray third = heap.remove();
		ExtendedIntArray fourth = heap.remove();
		ExtendedIntArray fifth = heap.remove();
		ExtendedIntArray last = heap.remove();
		
		// Ensure the order removed in is as expected
		assertEquals(array6, first);
		assertEquals(array5, second);
		assertEquals(array4, third);
		assertEquals(array1, fourth);
		assertEquals(array3, fifth);
		assertEquals(array2, last);
	}
	
	@SuppressWarnings("unused")
	@Test (expected = NoSuchElementException.class)
	public void testRemoveNoElementsMeanHeap() {
		/* Test to remove element when none exist
		 * 		Expect NoSuchElementException (no elements added)
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArrayMeanMax();
		
		// Attempt to remove top item
		ExtendedIntArray array = heap.remove();
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testCreateStdDevHeap() {
		/* Test to create a Heap for standard deviations of ExtendedIntArrays
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArrayStdDevMin();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreateIllegalStdDevHeap() {
		/* Test creating a standard deviation heap and adding empty 
		 * 	ExtendedIntArrays
		 * 		Expect IllegalArgumentException (length = 0)
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArrayStdDevMin();
		
		// create two empty ExtendedIntArrays
		ExtendedIntArray array1 = new ExtendedIntArray();
		ExtendedIntArray array2 = new ExtendedIntArray();
		
		// add both ExtendedIntArrays to the heap
		heap.add(array1);
		heap.add(array2);
	}
	
	@Test
	public void testAddOneStdDevHeap() {
		/* Test adding one ExtendedIntArray to a standard deviation heap
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArrayStdDevMin();
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 4});
		
		heap.add(array); // add the ExtendedIntArray to the heap
	}
	
	@Test
	public void testAddMultipleStdDevHeap() {
		/* Test adding multiple ExtendedIntArrays to a standard deviation heap
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArrayStdDevMin();
		
		// Create six valid (length > 0) ExtendedIntArrays 
		ExtendedIntArray array1 = new ExtendedIntArray(new int[] {1, 3, 4});
		ExtendedIntArray array2 = new ExtendedIntArray(new int[] {-8, -2, 0});
		ExtendedIntArray array3 = new ExtendedIntArray(new int[] {0, 0, 0});
		ExtendedIntArray array4 = new ExtendedIntArray(new int[] {12, 0, -3});
		ExtendedIntArray array5 = new ExtendedIntArray(new int[] {8, 0, 0, 8});
		ExtendedIntArray array6 = new ExtendedIntArray(new int[] {50});
		
		// Add all 6 ExtendedIntArrays to the heap
		heap.add(array1);
		heap.add(array2);
		heap.add(array3);
		heap.add(array4);
		heap.add(array5);
		heap.add(array6);
	}
	
	@Test
	public void testRemoveTopStdDevHeap() {
		/* Test adding ExtendedIntArrays to sum heap and removing top, ensure 
		 * 	top is same as ExtendedIntArray with lowest standard deviation.
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArrayStdDevMin();
		
		// Create six valid (length > 0) ExtendedIntArrays 
		ExtendedIntArray array1 = new ExtendedIntArray(new int[] {1, 3, 4});
		ExtendedIntArray array2 = new ExtendedIntArray(new int[] {-8, -2, 0});
		ExtendedIntArray array3 = new ExtendedIntArray(new int[] {0, 0, 0});
		ExtendedIntArray array4 = new ExtendedIntArray(new int[] {12, 0, -3});
		ExtendedIntArray array5 = new ExtendedIntArray(new int[] {8, 0, 0, 8});
		ExtendedIntArray array6 = new ExtendedIntArray(new int[] {50});
		
		// Add all 6 ExtendedIntArrays to the heap
		heap.add(array1);
		heap.add(array2);
		heap.add(array3);
		heap.add(array4);
		heap.add(array5);
		heap.add(array6);
		
		// Remove the top ExtendedIntArray from the heap
		ExtendedIntArray first = heap.remove();
		
		// Ensure the top ExtendedIntArray is the same as the ExtendedIntArray 
		// 		with the lowest standard deviation
		assertEquals(array3, first);
	}
	
	@Test
	public void testRemoveAllStdDevHeap() {
		/* Test adding several ExtendedIntArrays to a standard deviation
		 *  heap and removing them all. Ensure order removed in is from 
		 *  smallest standard deviation to largest standard deviation.
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArrayStdDevMin();
		
		// Create six valid (length > 0) ExtendedIntArrays 
		ExtendedIntArray array1 = new ExtendedIntArray(new int[] {1, 3, 4});
		ExtendedIntArray array2 = new ExtendedIntArray(new int[] {-8, -2, 0});
		ExtendedIntArray array3 = new ExtendedIntArray(new int[] {0, 0, 0});
		ExtendedIntArray array4 = new ExtendedIntArray(new int[] {12, 0, -3});
		ExtendedIntArray array5 = new ExtendedIntArray(new int[] {8, 0, 0, 8});
		ExtendedIntArray array6 = new ExtendedIntArray(new int[] {50});
		
		// Add all 6 ExtendedIntArrays to the heap
		heap.add(array1);
		heap.add(array2);
		heap.add(array3);
		heap.add(array4);
		heap.add(array5);
		heap.add(array6);
		
		// Remove all 6 ExtendedIntArrays from the heap
		ExtendedIntArray first = heap.remove();
		ExtendedIntArray second = heap.remove();
		ExtendedIntArray third = heap.remove();
		ExtendedIntArray fourth = heap.remove();
		ExtendedIntArray fifth = heap.remove();
		ExtendedIntArray last = heap.remove();
		
		// Ensure the order removed in is as expected
		assertEquals(array3, first);
		assertEquals(array6, second);
		assertEquals(array1, third);
		assertEquals(array2, fourth);
		assertEquals(array5, fifth);
		assertEquals(array4, last);
	}
	
	@SuppressWarnings("unused")
	@Test (expected = NoSuchElementException.class)
	public void testRemoveNoElementsStdDevHeap() {
		/* Test to remove element when none exist
		 * 		Expect NoSuchElementException (no elements added)
		 */
		HeapExtendedIntArray heap = new HeapExtendedIntArrayStdDevMin();
		
		// Attempt to remove top item
		ExtendedIntArray array = heap.remove();
	}
}
