/* Carter Ibach (20903582)
 * Final Assignment Coding Challenge
 * Started December 14th 2021
 * Finished 
 * 
 */

import static org.junit.Assert.*; 
import org.junit.Test; // Used for writing of Junit tests

public class ExtendedIntArrayTests {
	
	@SuppressWarnings("unused")
	@Test
	public void testCreateSimpleArray() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testCreateBlankArray() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {});
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testCreateNoArray() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray();
	}
	
	@Test
	public void testSimpleArrayToString() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertEquals("[1, 3, 5, 7]", array.toString());
	}
	
	@Test
	public void testBlankArrayToString() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {});
		
		assertEquals("[]", array.toString());
	}
	
	@Test
	public void testNoArrayToString() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		assertEquals("[]", array.toString());
	}

	@Test
	public void testSimpleArrayLength() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertEquals(4, array.getLength());
	}
	
	@Test
	public void testBlankArrayLength() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {});
		
		assertEquals(0, array.getLength());
	}
	
	@Test
	public void testNoArrayLength() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		assertEquals(0, array.getLength());
	}
	
	@Test
	public void testAddToEnd() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		array.addToEnd(1);
	}
	
	@Test
	public void testAddToEndRepeated() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		array.addToEnd(1);
		array.addToEnd(2);
		array.addToEnd(3);
		array.addToEnd(4);
		array.addToEnd(5);
	}
	
	@Test
	public void testAddToEndRepeatedToString() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		array.addToEnd(1);
		array.addToEnd(2);
		array.addToEnd(3);
		array.addToEnd(4);
		array.addToEnd(5);
		
		assertEquals("[1, 2, 3, 4, 5]", array.toString());
	}
	
	@Test
	public void testAddToEndRepeatedLength() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		assertEquals(0, array.getLength());
		
		array.addToEnd(1);
		array.addToEnd(2);
		array.addToEnd(3);
		array.addToEnd(4);
		array.addToEnd(5);
		
		assertEquals(5, array.getLength());
	}
	
	@Test
	public void testGetSumSimple() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertEquals(16, array.getSum());
	}
	
	@Test
	public void testGetSumBlank() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		assertEquals(0, array.getSum());
	}
	
	@Test
	public void testGetSumZero() {
		/* 
		 */
		ExtendedIntArray array = 
				new ExtendedIntArray(new int[] {5, 8, 4, -17});
		
		assertEquals(0, array.getSum());
	}
	
	@Test
	public void testGetSumAddChanges() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertEquals(16, array.getSum());
		
		array.addToEnd(-3);
		
		assertEquals(13, array.getSum());
		
		array.addToEnd(7);
		
		assertEquals(20, array.getSum());
		
		array.addToEnd(300);
		
		assertEquals(320, array.getSum());
	}
	
	@Test
	public void testGetMeanSimple() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertEquals(4, array.getMean(), 0.01);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testGetMeanBlank() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		assertEquals(0, array.getMean(), 0.01);
	}
	
	@Test
	public void testGetMeanZero() {
		/* 
		 */
		ExtendedIntArray array = 
				new ExtendedIntArray(new int[] {5, 8, 4, -17});
		
		assertEquals(0, array.getMean(), 0.01);
	}
	
	@Test
	public void testGetMeanAddChanges() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertEquals(4, array.getMean(), 0.01);
		
		array.addToEnd(-3);
		
		assertEquals(2.6, array.getMean(), 0.01);
		
		array.addToEnd(7);
		
		assertEquals(3.33333333, array.getMean(), 0.01);
		
		array.addToEnd(300);
		
		assertEquals(45.7143, array.getMean(), 0.01);
	}
	
	@Test
	public void testGetStdDevSimple() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertEquals(Math.sqrt(5), array.getStandardDeviation(), 0.01);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testGetStdDevBlank() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		assertEquals(0, array.getStandardDeviation(), 0.01);
	}
	
	@Test
	public void testGetStdDevZero() {
		/* 
		 */
		ExtendedIntArray array = 
				new ExtendedIntArray(new int[] {8, 8, 8, 8, 8, 8, 8});
		
		assertEquals(0, array.getStandardDeviation(), 0.01);
	}

	@Test
	public void testGetStdDevAddChanges() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertEquals(Math.sqrt(5), array.getStandardDeviation(), 0.01);
		
		array.addToEnd(9);
		
		assertEquals(Math.sqrt(8), array.getStandardDeviation(), 0.01);
		
		array.addToEnd(5);
		
		assertEquals(Math.sqrt(6.66667), array.getStandardDeviation(), 0.01);
		
		array.addToEnd(6);
		
		assertEquals(Math.sqrt(5.8367), array.getStandardDeviation(), 0.01);
	}
	
	@Test
	public void testIsSorted() {
		/*
		 * 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertFalse(array.isSorted());
		
		array.sortArray();
		
		assertTrue(array.isSorted());
	}
	
	@Test
	public void testIsSortedAddChanges() {
		/*
		 * 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 3, 5, 7});
		
		assertFalse(array.isSorted());
		
		array.sortArray();
		
		assertTrue(array.isSorted());
		
		array.addToEnd(15);
		
		assertFalse(array.isSorted());
	}
	
	@Test
	public void testSorting1() {
		/*
		 * 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {3, 5, 1, 7});

		array.sortArray();
		
		assertEquals("[1, 3, 5, 7]", array.toString());
	}
	
	@Test
	public void testSorting2() {
		/*
		 * 
		 */
		int[] temp = new int[] {0, -1, -7, 8, 3};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);

		array.sortArray();
		
		assertEquals("[-7, -1, 0, 3, 8]", array.toString());
	}
	
	@Test
	public void testSorting3() {
		/*
		 * 
		 */
		int[] temp = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);

		array.sortArray();
		
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", array.toString());
	}
	
	@Test
	public void testSortingAddRepeat() {
		/*
		 * 
		 */
		int[] temp = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);

		array.sortArray();
		
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", array.toString());
		
		array.addToEnd(0);
		
		array.sortArray();
		
		assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", array.toString());
	}

	@Test (expected = IllegalArgumentException.class)
	public void testBlankFind3() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray();
		
		array.find3Numbers(0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testTooShortFind3() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {1, 4});
		
		array.find3Numbers(0);
	}
	
	@Test
	public void testFind3Length3() {
		/* 
		 */
		ExtendedIntArray array = new ExtendedIntArray(new int[] {0, 1, 5});
		
		int expectedSum = 6;
		int[] result = array.find3Numbers(expectedSum);
		
		int actualSum = array.get(result[0]) + array.get(result[1]) 
			+ array.get(result[2]);
		
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testFind3Length5() {
		/* 
		 */
		int[] temp = new int[] {-7, -3, 5, 6, 10};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);
		
		int expectedSum = 13;
		int[] result = array.find3Numbers(expectedSum);
		
		int actualSum = array.get(result[0]) + array.get(result[1]) 
			+ array.get(result[2]);
		
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testFind3LongList() {
		/* 
		 */
		int[] temp = 
				new int[] {0, 3, 12, 20, 35, 52, 67, 80, 104, 30005, 61234};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);
		
		int expectedSum = 91343;
		int[] result = array.find3Numbers(expectedSum);
		
		int actualSum = array.get(result[0]) + array.get(result[1]) 
			+ array.get(result[2]);
		
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testFind3UnsortedLength3() {
		/* 
		 */
		int[] temp = new int[] {1, 0, 5};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);
		
		int expectedSum = 6;
		int[] result = array.find3Numbers(expectedSum);
		
		int actualSum = array.get(result[0]) + array.get(result[1]) 
			+ array.get(result[2]);
		
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testFind3UnsortedLength5() {
		/* 
		 */
		int[] temp = new int[] {5, 10, -3, -7, 6};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);
		
		int expectedSum = 13;
		int[] result = array.find3Numbers(expectedSum);
		
		int actualSum = array.get(result[0]) + array.get(result[1]) 
			+ array.get(result[2]);
		
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testFind3NoSolution() {
		/* 
		 */
		int[] temp = new int[] {0, 3, 5, 13};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);
		
		int expectedSum = -2;
		int[] result = array.find3Numbers(expectedSum);
		
		assertEquals(null, result);
	}
	
	public void testFind3NoSolutionAddForSolution() {
		/* 
		 */
		int[] temp = new int[] {0, 3, 5, 13};
		
		ExtendedIntArray array = new ExtendedIntArray(temp);
		
		int expectedSum = -2;
		int[] result = array.find3Numbers(expectedSum);
		
		assertEquals(null, result);
		
		array.addToEnd(-15);
		
		result = array.find3Numbers(expectedSum);
		
		int actualSum = array.get(result[0]) + array.get(result[1]) 
			+ array.get(result[2]);
	
		assertEquals(expectedSum, actualSum);
	}
}
