/* Carter Ibach (20903582)
 * Final Assignment Coding Challenge
 * Started December 15th 2021
 * Finished December 15th 2021
 * This program shows a sample of what this is capable of, and explains each
 * 	step. It also describes how to use the methods and what causes errors.
 */

public class SampleRun {

	public static void main(String[] args) {
		// Try to allow for wait with thread.sleep
		try {
			// Default wait times to use in milliseconds
			long shortTime = 750;
			long normalTime = 1000;
			long longTime = 1250;
			long veryLongTime = 1500;
			long veryShortTime = 500;
			
			System.out.println("Hello World! This program shows what "
					+ "this project is capable of.");
			Thread.sleep(normalTime); // wait
			
			System.out.println("First let's see what we can do with "
					+ "ExtendedIntArrays.");
			Thread.sleep(normalTime); // wait
			
			System.out.println("These are integer arrays that have "
					+ "some additional functionality.");
			Thread.sleep(normalTime); // wait
			
			System.out.println("You can create one with or without an "
					+ "existing integer array.");
			Thread.sleep(normalTime); // wait
			
			System.out.println(); // print blank line to indicate section
			System.out.println("Let's start by making one with the "
					+ "following array: {-6, 8, 3, -12, 50, 0}");
			Thread.sleep(longTime); // wait
			
			// Create ExtendedIntArray for samples
			ExtendedIntArray first = 
					new ExtendedIntArray(new int[] {-6, 8, 3, -12, 50, 0});
			
			System.out.println("A simple method is toString(), "
					+ "which returns: " + first.toString());
			Thread.sleep(normalTime); // wait
			
			System.out.println("We can also retrieve values from indexes with "
					+ "get(index), here get(1) returns: " + first.get(1));
			Thread.sleep(longTime); // wait
			
			System.out.println("The last simple functionality is getLength(), "
					+ "here it returns: " + first.getLength());
			Thread.sleep(longTime); // wait
			
			System.out.println(); // print blank line to indicate section
			System.out.println("Now we get into the more interesting methods");
			Thread.sleep(shortTime); // wait
			
			System.out.println("The method getMean() returns the mean: " 
					+ first.getMean());
			Thread.sleep(normalTime); // wait
			
			System.out.println("The method getSum() returns the sum: " 
					+ first.getSum());
			Thread.sleep(normalTime); // wait
			
			System.out.println("And getStandardDeviation() returns the "
					+ "standard deviation: " + first.getStandardDeviation());
			Thread.sleep(longTime); // wait
			
			System.out.println(); // print blank line to indicate section
			System.out.println("You can also see if it has been sorted with "
					+ "isSorted(): " + first.isSorted());
			Thread.sleep(normalTime);
			
			System.out.println("To then sort it, sortArray() can be used.");
			Thread.sleep(shortTime);
			
			// Sort the ExtendedIntArray
			first.sortArray();
			
			System.out.println("Now the array is sorted: " + first.isSorted());
			Thread.sleep(shortTime);
			
			System.out.println("The new sorted order is :" + first.toString());
			Thread.sleep(normalTime);
			
			System.out.println("So now get(1) retrieves: " + first.get(1));
			Thread.sleep(normalTime);
			
			System.out.println(); // print blank line to indicate section
			System.out.println("Another interesting method is "
					+ "addToEnd(value)");
			Thread.sleep(normalTime);
			
			// Add a 2 to the ExtendedIntArray
			first.addToEnd(2);
			
			System.out.println("addToEnd(2) puts a 2 at the end of the "
					+ "array: " + first.toString());
			Thread.sleep(veryLongTime);
			
			System.out.println("Now the array is no longer sorted: " 
					+ first.isSorted());
			Thread.sleep(normalTime);
			
			System.out.println(); // print blank line to indicate section
			System.out.println("And the other values have also changed.");
			Thread.sleep(shortTime);
			
			System.out.println("Length: " + first.getLength());
			Thread.sleep(veryShortTime); // wait
			
			System.out.println("Mean: " + first.getMean());
			Thread.sleep(veryShortTime); // wait
			
			System.out.println("Sum: " + first.getSum());
			Thread.sleep(veryShortTime); // wait
			
			System.out.println("Standard Deviarion: " 
					+ first.getStandardDeviation());
			Thread.sleep(shortTime); // wait
			
			System.out.println(); // print blank line to indicate section
			System.out.println("Now the last method is find3Numbers()");
			Thread.sleep(normalTime); // wait
			
			System.out.println("This finds the indexes of the 3 numbers "
					+ "that add up to a target sum");
			Thread.sleep(normalTime); // wait
			
			System.out.println("and returns them as a 3 digit array.");
			Thread.sleep(shortTime); // wait
			
			// Find indexes to add up to -18
			int[] temp = first.find3Numbers(-18);
			
			System.out.println("for example, find3Numbers(-18) returns: "
					+ "{" + temp[0] + ", " + temp[1] + ", " + temp[2] + "}");
			Thread.sleep(longTime); // wait
			
			System.out.println("These values are: {" + first.get(temp[0]) 
				+ ", " + first.get(temp[1]) + ", " + first.get(temp[2]) + "}");
			Thread.sleep(normalTime); // wait
			
			System.out.println("This also sorts the array when it happens: " 
					+ first.toString());
			Thread.sleep(longTime); // wait
			
			System.out.println("If a sum cannot be reached, null is returned");
			Thread.sleep(normalTime); // wait
			
			// Find that no indexes add up to 1
			int[] temp2 = first.find3Numbers(1);
			
			System.out.println("Using find3Numbers(1) returns: "  + temp2);
			Thread.sleep(normalTime); // wait
			
			System.out.println(); // print blank line to indicate section
			System.out.println("With these, attributes can be found for "
					+ "arrays, and existing data can be added to.");
			Thread.sleep(longTime); // wait
			
			System.out.println("However, if only the sums is searched for, "
					+ "it can be done without creating an ExtendedIntArray");
			Thread.sleep(veryLongTime); // wait
			
			System.out.println("Example, find3Numbers(new int[] "
					+ "{-12, -6, 0, 2, 3, 8, 50}) returns the same value as "
					+ "with the ExtendedIntArray");
			Thread.sleep(veryLongTime); // wait
			
			System.out.println(); // print blank line to indicate section
			System.out.println("There are some scenarios where errors "
					+ "are raised");
			Thread.sleep(normalTime); // wait
			
			System.out.println("If the mean or standard deviation is "
					+ "attempted with 0 integers, an error is raised.");
			Thread.sleep(veryLongTime); // wait
			
			System.out.println("If find3Numbers() is attempted with less "
					+ "than 3 integers an error is raised.");
			Thread.sleep(longTime); // wait
			
			System.out.println(); // print blank line to indicate section
			System.out.println("Finally, there exist 3 types of heaps that "
					+ "use ExtendedIntArrays");
			Thread.sleep(longTime); // wait
			
			System.out.println("For sums of ExtendedIntArrays, smaller sums "
					+ "are brought to the top,");
			Thread.sleep(longTime); // wait
			
			System.out.println("for means of ExtendedIntArrays, larger means "
					+ "are brought to the top,");
			Thread.sleep(longTime); // wait
			
			System.out.println("and for standard deviations of "
					+ "ExtendedIntArrays, the smallest will be brought "
					+ "to the top");
			Thread.sleep(veryLongTime); // wait
			
			System.out.println("All three types of heap will throw an "
					+ "exception if remove is used without an element "
					+ "added first");
			Thread.sleep(veryLongTime); // wait
			
			System.out.println("All of these heaps work as most heaps and "
					+ "use add() and remove() to add new ExtendedIntArrays "
					+ "and find the top ExtendedIntArray");
			
		} catch (InterruptedException e) { // if waiting goes awry
			
			e.printStackTrace(); // print error that arose
		}
	}

}
