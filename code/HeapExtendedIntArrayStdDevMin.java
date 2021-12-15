/* Carter Ibach (20903582)
 * Final Assignment Coding Challenge
 * Started December 14th 2021
 * Finished 
 * 
 */

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class HeapExtendedIntArrayStdDevMin extends HeapExtendedIntArray {
	
	public HeapExtendedIntArrayStdDevMin() {
		elements = new ArrayList<ExtendedIntArray>();
		elements.add(new ExtendedIntArray());
	}
	
	public void add(ExtendedIntArray value) {
		elements.add(value);
		
		// swim up as necessary for ordering
		int i = elements.size() - 1;
		int parent = parent(i);
				
		while (hasParent(i) && 
				elements.get(i).getStandardDeviation() < 
					elements.get(parent).getStandardDeviation()){
					
			swap(i, parent);
		            
		     i = parent;
		     parent = parent(i);
		}
	}
	
	public ExtendedIntArray remove() {
		if (elements.size() <= 1){
            throw new NoSuchElementException();
        }
        
        ExtendedIntArray result = elements.get(1);
        swap(1, elements.size() - 1);
		elements.remove(elements.size() - 1);
		
		swimDown();
		
		return result;
	}
	
	private void swimDown() {
		int i = 1;
		int left = leftChild(i);
		int right = rightChild(i);
		
		while((hasLeftChild(i) && 
				elements.get(i).getStandardDeviation() > 
					elements.get(left).getStandardDeviation()) || 
						(hasRightChild(i) && 
							elements.get(i).getStandardDeviation() > 
								elements.get(right).getStandardDeviation())) {
			
			if (!(hasLeftChild(i))) {
				
				swap(i, right);
				i = right;
				
			} else if  (!(hasRightChild(i))) {
				
				swap(i, left);
				i = left;

			} else if (elements.get(left).getStandardDeviation() < 
							elements.get(right).getStandardDeviation()) {
				
				swap(i, left);
				i = left;
			} else {
				
				swap(i, right);
				i = right;
			}
			
			left = leftChild(i);
			right = rightChild(i);
		}
	}
}
