package example.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemoClass {
	
	public void insideExceptionDemo() {
	System.out.println("Inside the ExceptionDemoClass ");
	
	
//Uncomment below line for unchecked exception
	//UncheckedException.arrayIndexOutOfBoundsException(); 
	
	
	
	//try {
		share();
	/*} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	System.out.println("Exiting ExceptionDemoClass");
}

private void share() {
	System.out.println("Inside the ExceptionDemoClass - Share ");
	try {
		HttpConnect.send(1, "hello", "http://www.guru84.com");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Connecting to second server ...");
	} catch (Exception e) {}  //this is not good practice to handle exception , we must provide details to handle it
	catch (Throwable e) {}
	System.out.println("Exiting ExceptionDemoClass- Share");
}

}
