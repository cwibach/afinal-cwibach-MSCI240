/* Carter Ibach (20903582)
 * Final Assignment Coding Challenge
 * Started December 14th 2021
 * Finished December 14th 2021
 * This is a super class for heaps that use ExtendedIntArrays, 
 * 	it in an abstract class so the other heaps fill empty method bodies
 */

import java.util.ArrayList;

public abstract class HeapExtendedIntArray {
	// ArrayList with all useful ExtendedIntArrays starting from the 2nd index
	protected ArrayList<ExtendedIntArray> elements;
	
	protected int parent(int index) { 
		// return the index of the parent ExtendedIntArray
		return index/2; 
	}
	
	protected int leftChild(int index) {
		// return the index of the left ExtendedIntArray
		return index*2;
	}
	
	protected int rightChild(int index) {
		// Return the index of the right ExtendedIntArray
		return index*2 +1;
	}
	
	protected boolean hasParent(int index) {
		// true if this is past the index 1
		return index > 1;
	}
	
	protected boolean hasLeftChild(int index) {
		// ture if the left index is less than the elements size
		return leftChild(index) < elements.size();
	}
	
	protected boolean hasRightChild(int index) {
		// true if the right index is less than the elements size
		return rightChild(index) < elements.size();
	}
	
	protected void swap(int index1, int index2) {
		// save temporary ExtendedIntArray
		ExtendedIntArray temp = elements.get(index1);
		
		// Set the first index equal to the second
		elements.set(index1, elements.get(index2));
		
		// Set the second index equal to the temporary ExtendedIntArray
		elements.set(index2, temp);
	}
	
	// Abstract add method overwritten by all subclasses
	public abstract void add(ExtendedIntArray array);
	
	// Abstract remove method overwritten by all subclasses
	public abstract ExtendedIntArray remove();
}
