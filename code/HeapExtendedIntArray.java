/* Carter Ibach (20903582)
 * Final Assignment Coding Challenge
 * Started December 14th 2021
 * Finished 
 * 
 */

import java.util.ArrayList;

public class HeapExtendedIntArray {
	protected ArrayList<ExtendedIntArray> elements;
	
	protected int parent(int index) { 
		return index/2; 
	}
	
	protected int leftChild(int index) {
		return index*2;
	}
	
	protected int rightChild(int index) {
		return index*2 +1;
	}
	
	protected boolean hasParent(int index) {
		return index > 1;
	}
	
	protected boolean hasLeftChild(int index) {
		return leftChild(index) < elements.size();
	}
	
	protected boolean hasRightChild(int index) {
		return rightChild(index) < elements.size();
	}
	
	protected void swap(int index1, int index2) {
		ExtendedIntArray temp = elements.get(index1);
		elements.set(index1, elements.get(index2));
		elements.set(index2, temp);
	}
}
