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
	
	/**
	 * Find the index of the parent of a given index
	 * @param index: initial index
	 * @return: index of this location's parent
	 */
	protected int parent(int index) { 
		// return the index of the parent ExtendedIntArray
		return index/2; 
	}
	
	/**
	 * Find the index of the left child of a given index
	 * @param index: Index to find left child of
	 * @return: Left child location of index
	 */
	protected int leftChild(int index) {
		// return the index of the left ExtendedIntArray
		return index*2;
	}
	
	/**
	 * Find the index of the right child of a given index
	 * @param index: Index to find right child of
	 * @return: Right child location of index
	 */
	protected int rightChild(int index) {
		// Return the index of the right ExtendedIntArray
		return index*2 +1;
	}
	
	/**
	 * Determine if the given index has a parent
	 * @param index: Index to check for the parent of
	 * @return: True if it is high enough to have a parent
	 */
	protected boolean hasParent(int index) {
		// true if this is past the index 1
		return index > 1;
	}
	
	/**
	 * Determine if the given index has a left child
	 * @param index: Index to check for a left child of
	 * @return: True if the index is low enough in list to have left child
	 */
	protected boolean hasLeftChild(int index) {
		// ture if the left index is less than the elements size
		return leftChild(index) < elements.size();
	}
	
	/**
	 * Determine if the given index has a right child
	 * @param index: Index to check for a right child of
	 * @return: True if the index is low enough in list to have left child
	 */
	protected boolean hasRightChild(int index) {
		// true if the right index is less than the elements size
		return rightChild(index) < elements.size();
	}
	
	/**
	 * Swap values at given indexes
	 * @param index1: First index to swap
	 * @param index2: Second index to swap
	 */
	protected void swap(int index1, int index2) {
		// save temporary ExtendedIntArray
		ExtendedIntArray temp = elements.get(index1);
		
		// Set the first index equal to the second
		elements.set(index1, elements.get(index2));
		
		// Set the second index equal to the temporary ExtendedIntArray
		elements.set(index2, temp);
	}
	
	/**
	 * Add an ExtendedIntArray to the elements, then rise as it should be risen
	 * @param array: ExtendedIntArray to add 
	 */
	public abstract void add(ExtendedIntArray array);
	
	/**
	 * Remove the top ExtendedIntArray and move the bottom to top and sink it
	 * @return: The removed ExtendedIntArray
	 */
	public abstract ExtendedIntArray remove();
}
