package example.exceptions;

import java.io.FileNotFoundException;

public class ExceptionDemoClass {
	
	public void insideExceptionDemo() {
	System.out.println("Inside the ExceptionDemoClass ");
	try {
		share();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Exiting ExceptionDemoClass");
}

private void share() throws FileNotFoundException {
	System.out.println("Inside the ExceptionDemoClass - Share ");
	//try {
		HttpConnect.send(0, "hello", "http://www.guru84.com");
	/*} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	System.out.println("Exiting ExceptionDemoClass- Share");
}

}
