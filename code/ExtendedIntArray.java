
public class ExtendedIntArray{
	private int[] array;
	
	public ExtendedIntArray(int[] array) {
		this.array = array;
	}
	
	public ExtendedIntArray() {
		this.array = new int[0];
	}
	
	public String toString() {
		String result = "[";
		
		for (int i = 0; i < array.length; i++) {
			if (result.equals("[")) {
				result += array[i] + ",";
			} else {
				result += " " + array[i] + ",";
			}
		}
		
		result = result.substring(0, -1) + "]";
		
		return result;
	}
}
