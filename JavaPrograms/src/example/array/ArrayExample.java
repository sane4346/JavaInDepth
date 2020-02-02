package example.array;

public class ArrayExample {
		    // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
		  
		    static void typeCasting() {
		      System.out.println("\nInside typeCasting ...");
		      // Explicit casting
		      long y = 42;
		      //int x = y;
		      int x = (int)y;
		      
		      // Information loss due to out-of-range assignment
		      byte narrowdByte = (byte)123456;
			  System.out.println("narrowdByte: " + narrowdByte); 
			  
			  // Truncation
			  int iTruncated = (int)0.99;
			  System.out.println("iTruncated: " + iTruncated); 
			  
			  // Implicit cast (int to long)
			  y = x;
			  
			  // Implicit cast (char to int)
			  char cChar = 'A';
			  int iInt = cChar; 
			  System.out.println("iInt: " + iInt);
			  
			  // byte to char using an explicit cast
			  byte bByte = 65;
			  cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
			  System.out.println("cChar: " + cChar);
		    }
			
			public static void arrays() {
			   System.out.println("\nInside arrays ...");
			   int[] myArray = new int[]{9, 11, 2, 5, 4, 4, 6};
		       System.out.println("myArray.length: " + myArray.length);
			   System.out.println("myArray[1]: " + myArray[1]);
			   System.out.println("myArray[6]: " + myArray[6]);	   
			}

		    public static void threeDimensionalArrays() {
			   System.out.println("\nInside threeDimensionalArrays ...");
			   int[][][] unitsSold = new int[][][]{ 
												   { // New York
													 {0,0,0,0}, // Jan
													 {0,0,0,0}, // Feb
													 {0,0,0,0}, // Mar
													 {0,850,0,0}// Apr	
												   },
												   { // San Francisco
													 {0,0,0,0}, // Jan
													 {0,0,0,0}, // Feb
													 {0,0,0,0}, // Mar
													 {0,0,0,0}  // Apr
												   },
												   { 
													 {0,0,0,0},
													 {0,0,0,0},
													 {0,0,0,0},
													 {0,0,0,0}
												   },
												   {
													 {0,0,0,0},
													 {0,0,0,0},
													 {0,0,0,0},
													 {0,0,0,0}
												   }
												 };
				                    	 
				System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
			}	
		  
		    public static void main(String[] args) {	
			  // Language Basics 1
			  //print();				
			  //primitives();
			  //typeCasting();
			  //arrays();	
		      threeDimensionalArrays();	  
		    }       

}
