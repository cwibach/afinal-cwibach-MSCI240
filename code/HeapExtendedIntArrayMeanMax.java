/* Carter Ibach (20903582)
 * Final Assignment Coding Challenge
 * Started December 14th 2021
 * Finished December 15th 2021
 * This class is heaps for finding the maximum mean values, 
 * 	and uses the HeapIntExtendedIntArray super class
 */

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class HeapExtendedIntArrayMeanMax extends HeapExtendedIntArray {
	
	/**
	 * Create an ExtendedIntArrayHeap for finding maximum mean values
	 */
	public HeapExtendedIntArrayMeanMax() {
		// Create new ArrayList for elements
		elements = new ArrayList<ExtendedIntArray>();
		// Add blank ExtendedIntArray to be index 0.
		elements.add(new ExtendedIntArray());
	}
	
	/**
	 * Add an ExtendedIntArray to the elements, then rise as it should be risen
	 * @param array: ExtendedIntArray to add 
	 */
	public void add(ExtendedIntArray value) {
		// Add the ExtendedIntArray to the end of elements
		elements.add(value);
		
		// Start at the index of the new ExtendedIntArray
		int i = elements.size() - 1; 
		// Set initial parent index
		int parent = parent(i);
		
		// while it has a parent, and this ExtendedIntArray has a higher mean
		// 		than the parent.
		while (hasParent(i) && 
				elements.get(i).getMean() > elements.get(parent).getMean()){
			
			// Swap this ExtendedIntArray and the parent
			swap(i, parent);
		     
			// Set the new index to the parents index
		    i = parent;
		    // Get the new parents index
		    parent = parent(i);
        }
	}
	
	/**
	 * Remove the top ExtendedIntArray and move the bottom to top and sink it
	 * @return: The removed ExtendedIntArray
	 */
	public ExtendedIntArray remove() {
		// If less than one useful element exists
		if (elements.size() <= 1){
            throw new NoSuchElementException();
        }
        
		// Get the first useful (2nd) element
        ExtendedIntArray result = elements.get(1);
        
        // Swap the 2nd and last elements
        swap(1, elements.size() - 1);
        
        // Remove what is now the last element
		elements.remove(elements.size() - 1);
		
		// Move the 2nd down to the correct location
		swimDown();
		
		// Return the original second that was removed
		return result;
	}
	
	/**
	 * Move the top value down the heap as far as it should be, replacing it 
	 * 		with the proper of its possible replacements
	 */
	private void swimDown() {
		// Set initial index of ExtendedIntArray as 1
		int i = 1;
		// Set initial left index
		int left = leftChild(i);
		// Set initial right index
		int right = rightChild(i);
		
		// While this ExtendedIntArray has a left with a greater mean, or
		// 		this ExtendedIntArray has a right with a greater mean.
		while((hasLeftChild(i) && 
				elements.get(i).getMean() < elements.get(left).getMean()) || 
					(hasRightChild(i) && elements.get(i).getMean() < 
						elements.get(right).getMean())) {
			
			// If there is no left (right has larger mean)
			if (!(hasLeftChild(i))) {
				
				// swap this ExtendedIntArray with the right
				swap(i, right);
				
				// set new index as the right
				i = right;
				
			// If there is no right (left has larger mean)
			} else if  (!(hasRightChild(i))) {
				
				// swap this ExtendedIntArray with the left
				swap(i, left);
				
				// set new index as the left
				i = left;
			
			// if the left has the largest mean
			} else if (elements.get(left).getMean() > 
							elements.get(right).getMean()) {
				
				// swap this ExtendedIntArray with the left
				swap(i, left);
				
				// set new index as the left
				i = left;
				
			// if the right has the largest mean
			} else {
				
				// swap this ExtendedIntArray with the right
				swap(i, right);
				
				// set new index as the right
				i = right;
			}
			
			// Set the new left and right indexes
			left = leftChild(i);
			right = rightChild(i);
		}
	}
}
