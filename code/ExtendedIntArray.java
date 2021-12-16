/* Carter Ibach (20903582)
 * Final Assignment Coding Challenge
 * Started December 6th 2021
 * Finished December 14th 2021
 * This class has ExtendedIntArrays, objects that allow for manipulation 
 * 	and finding information of integer arrays
 */

import java.util.Arrays;

public class ExtendedIntArray{
	private int[] array; // primary array being manipulated
	
	private int sum = 0; // sum of array values
	private boolean sumFound = false; // whether sum is up to date
	private double mean = 0; // mean of array values
	private boolean meanFound = false; // whether mean is up to date
	private double stdDev = 0; // standard deviation of array values
	private boolean stdDevFound = false; // whether std. dev. is up to date
	private boolean sorted = false; // whether the array is definitely sorted
	
 	public ExtendedIntArray(int[] array) {
		this.array = array; // set the array
	}
	
	public ExtendedIntArray() {
		this.array = new int[0]; // set the array to be empty
	}
	
	public int get(int index) {
		// if the index is too high
		if (index >= getLength()) {
			throw new IllegalArgumentException("Error, too high index");
		}
		
		return getArray()[index]; // return the index's value
	}
	
	public void addToEnd(int value) {
		// set the array to be one larger
		this.array = Arrays.copyOf(this.array, this.array.length + 1);
		
		// add the value to be the last
		this.array[this.array.length - 1] = value;
		
		// Mark all values as not up to date
		sumFound = false;
		meanFound = false;
		stdDevFound = false;
		sorted = false;
	}
	
	public String toString() {
		// If the length is zero, return a visual empty array
		if (getLength() == 0) {
			return "[]";
		}
		
		String result = "["; // set basic string result
		
		// For every integer in the array
		for (int i = 0; i < getLength(); i++) {
			if (result.equals("[")) { // if it is the first integer
				result += array[i] + ","; // add the integer to the string
				
			} else { // if it is not the first integer
				result += " " + array[i] + ","; // add the integer to string
			}
		}
		
		// remove the last comma and add a ending square bracket
		result = result.substring(0, result.length()-1) + "]";
			
		return result; // return the amalgamized string
	}
	
	public int[] getArray() {
		return this.array; // return the current array
	}
	
	public int getLength() {
		return getArray().length; // return the length of the array
	}
	
	private void calculateSum() {
		if (this.sumFound) { // if the sum is up to date
			return; // do nothing
		}
		
		int sum = 0; // set the base sum to zero
		
		for (int value: getArray()) { // for each integer in the array
			sum += value; // add the integer to the sum
		}
		
		this.sum = sum; // set the sum
		sumFound = true; // mark the sum as up to date
	}
	
	public int getSum() {
		this.calculateSum(); // calculate the sum
		
		return sum; // return the sum
	}
	
	private void calculateMean() {
		if (this.meanFound) { // if the mean is up to date already
			return; // do nothing
		}
		
		if (getLength() == 0) { // if the length is zero
			throw new IllegalArgumentException("Invalid array of length 0");
		}
		
		// set the mean as the sum over the length
		this.mean = (double) this.getSum()/(double) getLength();
		meanFound = true; // mark the mean as up to date
	}
	
	public double getMean() {
		this.calculateMean(); // calculate the mean
		
		return this.mean; // return the mean
	}
	
	private void calculateStdDev() {
		if (this.stdDevFound) { // if the standard deviation is up to date
			return; // do nothing
		}
		
		if (getLength() == 0) { // if the length is zero
			throw new IllegalArgumentException("Invalid array of length 0");
		}
		
		double mean = this.getMean(); // find the mean of the data set
		double deviation = 0.0; // set base deviation to 0
		double length = (double) getLength(); // get the length of the array
		
		for (int value: getArray()) { // for each integer in the array
			// add the distance from mean squared to deviation over length
			deviation += Math.pow(value - mean, 2) / length;
		}
		
		// set the std Dev as the square root of the average deviation
		this.stdDev = Math.sqrt(deviation);
		stdDevFound = true; // mark as up to date
	}
	
	public double getStandardDeviation() {
		this.calculateStdDev(); // calculate standard deviation
		
		return this.stdDev; // return standard deviation
	}
	
	public boolean isSorted() {
		return sorted; // return if it confirmed to be sorted
	} 
	
	public void sortArray() {
		if (isSorted()) { // if it is currently sorted
			return; // do nothing
		}
		
		int[] array = this.getArray(); // retrieve the array to sort
		
		// for each integer in the array from the second
		for (int i = 1; i < getLength(); i++) {
			
			// for each integer from i to the second
			for (int j = i; j > 0; j--) {
				
				// if this integer is less than the prior integer
				if (array[j] < array[j-1]) {
					
					// swap the two integers
					swap(array, j, j-1);
				}
			}
		}
		
		this.sorted = true; // mark the array as sorted
	}
	
	private static void swap(int[] array, int first, int second) {
		// save the first location's value as a temporary integer
		int temp = array[first];
		// set the first location value to be the second's value
		array[first] = array[second];
		// set the second location's value to be the temporary value
		array[second] = temp;
	}

	public static int[] find3Numbers(int[] array, int sum) {
		// create an ExtendedIntArray with the array
		ExtendedIntArray goodArray = new ExtendedIntArray(array);
		
		// return the result of find3Numbers with the ExtendedIntArray
		return goodArray.find3Numbers(sum);
	}
	
	public int[] find3Numbers(int sum) {
		if (getLength() < 3) { // if the length is less than 3
			throw new IllegalArgumentException("Array length less than 3");
		}
		
		sortArray(); // sort the array
		
		// call the private partner with the 1st, 2nd and final indexes
		return find3Numbers(sum, getArray(), 0, 1, getLength()-1);
	}
	
	private static int[] find3Numbers(int sum, int[] array, 
			int base, int lower, int upper) {
		
		// find the sum of the three indexes
		int valueSum = array[base] + array[lower] + array[upper];
		
		// if the base is only one away from the upper (lower == upper)
		if (base + 1 == upper) {
			// there is no set that adds to the sum, return null
			return null; 
			
		} else if (valueSum == sum) { // if the sum is correct
			return new int[]{base, lower, upper}; // return the 3 indexes
			
		// if the lower is adjacent to the upper (and not correct)
		} else if (lower + 1 == upper) {
			// increment the base by 1, move the lower to 1 after the new base,
			// 		and move the upper to the end of the array again
			return find3Numbers(sum, array, base+1, base+2, array.length-1);
			
		} else if (valueSum < sum) { // if this sum is too low
			// move the lower index up one
			return find3Numbers(sum, array, base, lower+1, upper);
			
		} else { // if (valueSum > sum) {, this sum is too high
			// move the upper index down one
			return find3Numbers(sum, array, base, lower, upper-1);
		}
	}
}
