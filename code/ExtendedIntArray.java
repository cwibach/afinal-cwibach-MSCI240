/* Carter Ibach (20903582)
 * Final Assignment Coding Challenge
 * Started December 6th 2021
 * Finished 
 * 
 */

import java.util.Arrays;

public class ExtendedIntArray{
	private int[] array;
	
	private int sum = 0;
	private boolean sumFound = false;
	private double mean = 0;
	private boolean meanFound = false;
	private double stdDev = 0;
	private boolean stdDevFound = false;
	private boolean sorted = false;
	
 	public ExtendedIntArray(int[] array) {
		this.array = array;
	}
	
	public ExtendedIntArray() {
		this.array = new int[0];
	}
	
	public void addToEnd(int value) {
		this.array = Arrays.copyOf(this.array, this.array.length + 1);
		
		this.array[this.array.length - 1] = value;
		
		sumFound = false;
		meanFound = false;
		stdDevFound = false;
		sorted = false;
	}
	
	public String toString() {
		if (getLength() == 0) {
			return "[]";
		}
		
		String result = "[";
		
		for (int i = 0; i < getLength(); i++) {
			if (result.equals("[")) {
				result += array[i] + ",";
			} else {
				result += " " + array[i] + ",";
			}
		}
		
		result = result.substring(0, result.length()-1) + "]";
			
		return result;
	}
	
	public int[] getArray() {
		return this.array;
	}
	
	public int getLength() {
		return getArray().length;
	}
	
	private void calculateSum() {
		if (this.sumFound) {
			return;
		}
		
		int sum = 0;
		
		for (int value: getArray()) {
			sum += value;
		}
		
		this.sum = sum;
		sumFound = true;
	}
	
	public int getSum() {
		if (!sumFound) {
			this.calculateSum();
		}
		return sum;
	}
	
	private void calculateMean() {
		if (this.meanFound) {
			return;
		}
		
		if (getLength() == 0) {
			throw new IllegalArgumentException("Invalid array of length 0");
		}
		
		this.mean = (double) this.getSum()/(double) getLength();
		meanFound = true;
	}
	
	public double getMean() {
		this.calculateMean();
		
		return this.mean;
	}
	
	private void calculateStdDev() {
		if (this.stdDevFound) {
			return;
		}
		
		if (getLength() == 0) {
			throw new IllegalArgumentException("Invalid array of length 0");
		}
		
		double mean = this.getMean();
		double deviation = 0.0;
		
		for (int value: getArray()) {
			deviation += Math.pow(value - mean, 2) / (double) array.length;
		}
		
		this.stdDev = Math.sqrt(deviation);
		stdDevFound = true;
	}
	
	public double getStandardDeviation() {
		this.calculateStdDev();
		
		return this.stdDev;
	}
	
	public boolean isSorted() {
		return this.isSorted();
	} 
	
	public void sortArray() {
		if (this.sorted) {
			return;
		}
		
		int[] array = this.getArray();
		
		for (int i = 1; i < getLength(); i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j-1]) {
					swap(array, j, j-1);
				}
			}
		}
		
		this.sorted = true;
	}
	
	private static void swap(int[] array, int first, int second) {
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
	
	public int[] find3Numbers(int sum) {
		if (getLength() < 3) {
			throw new IllegalArgumentException("Array length less than 3");
		}
		
		sortArray();
		
		int[] indexes = new int[] {-1, -1, -1};
		
		return indexes;
	}
	
	public static int[] find3Numbers(int[] array, int sum) {
		ExtendedIntArray goodArray = new ExtendedIntArray(array);
		
		return goodArray.find3Numbers(sum);
	}
}
