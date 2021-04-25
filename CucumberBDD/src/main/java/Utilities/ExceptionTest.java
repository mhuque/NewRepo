package Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class ExceptionTest {
	
	public static void main(String[] args) {
//		arrayException();
//		throwsExample();
//		tryCatchExample();
//		mathExample();
//		mathExample2();
		
		mathExample3();
	}
	
	
	public static void arrayException() {
		int [] array = new int [3];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		
		System.out.println(Arrays.toString(array));
		
	}
	
	public static void throwsExample() throws FileNotFoundException {
		File file = new File("Config.properties");
		FileReader fr = new FileReader(file);
		
	}
	
	public static void tryCatchExample() {
		try {
		File file = new File("Config.properties");
		FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void mathExample() {
		int a=10, b=0, c=30;
		
		try {
			System.out.println("The result of a divided by b is :"+ a/b);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			
			System.out.println("The result of c divided by a is :"+ c/a);
		}
	}
	
	public static void mathExample2() {
		int a=10, b=0, c=30;
		System.out.println("The result of a divided by b is :"+ a/b);
		System.out.println("The result of c divided by a is :"+ c/a);
		
		
	}
	
	public static void mathExample3() {
		int a=10, b=0, c=30;
	System.out.println("The result of a divided by b is :"+ a/b);
		throw new ArithmeticException("Sorry, can't divide by 0");
			
		
	}

}
