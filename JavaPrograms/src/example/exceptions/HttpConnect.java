package example.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HttpConnect {
	
	public static void send(int destination, String data, String partner) throws IOException {
		
		System.out.println("Inside the HttpConnect - send ");
		
		if (destination == 0 ) {
			throw new FileNotFoundException();
		} else if (destination == 1 ) {
			throw new IOException();
		}
		
		System.out.println("Exiting HttpConnect- send");
	}

}
