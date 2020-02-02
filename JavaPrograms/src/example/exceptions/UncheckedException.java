package example.exceptions;

/* Unchecked exception  arise due to programming flaws or system errors
	1. Runtime Exceptions: If exceptions occur due to programming flaws. they can be 
			minimized at development and testing.
	2. Errors : If exceptions occur due to system errors its called errors. they 
			are rare and not easy to find.
			
	Note - Unchecked exceptions are not checked by compiler
*/
public class UncheckedException {
	
	public static void arrayIndexOutOfBoundsException() {
		int [] arr = new  int[]{ 1,5,6,3,2,4,7}; // new int[7];
		
		System.out.println("Array index out of bound - arr[7]" + arr[7]);
		
		//illegalAruguementException(-1);
	}
	
	/**
	 * @param argument
	 * @throws IllegalArgumentException generated if argument < 0 || argument > 5
	 */
	
	private static void illegalAruguementException(int argument)  {
		
		if (argument < 0 || argument > 5) {
			throw new IllegalArgumentException();
		}
		
	}

}
