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
}
