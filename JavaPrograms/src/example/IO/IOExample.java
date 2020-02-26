package example.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExample {
	
	static String inFileName = "input_file.png";
	static String outFileName = "outputFile.jpeg";
	
	public void fileByteCopyWithoutBuffer() {
		System.out.println("\nInside fileCopyNoBuffer ...");
		
		long startTime, elapsedTime; // for speed benchmarking

		// Print file length
		File fileIn = new File(inFileName);
		System.out.println("File size is " + fileIn.length() + " bytes");
		
		try( FileInputStream in = new FileInputStream(inFileName);
				FileOutputStream out = new FileOutputStream(outFileName)){
			startTime = System.nanoTime();
			int byteRead;
			// Read a raw byte, returns an int of 0 to 255.
			while((byteRead = in.read()) != -1) {
				// Write the least-significant byte of int, drop the upper 3
				// bytes
				out.write(byteRead);
			}
			elapsedTime = System.nanoTime() - startTime;
			System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
	public void fileByteCopyWithBuffer() {
		
		System.out.println("\nInside fileCopyWithBuffer ...");
		
		long startTime, elapsedTime; // for speed benchmarking

		// Print file length
		File fileIn = new File(inFileName);
		System.out.println("File size is " + fileIn.length() + " bytes");
		
		startTime = System.nanoTime();
		
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFileName));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFileName))) {
			
				byte [] byteBuffer = new byte[4000];
				int byteRead;
				
				while ((byteRead = in.read(byteBuffer)) != -1) {
					out.write(byteBuffer, 0, byteRead);
				}
					
			} catch(IOException e) {
					e.printStackTrace();
				}
		elapsedTime = System.nanoTime() - startTime;
		System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
	
		
	}

}
