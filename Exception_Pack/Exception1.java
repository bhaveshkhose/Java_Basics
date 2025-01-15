package Exception_Pack;

import java.util.Scanner;

public class Exception1 {
	
	public static void method1() throws Throwable {
		System.out.println("In the method1");
		method2();
		System.out.println("Method1 exit ");
	}
	public static void method2() throws Throwable {
		System.out.println("In the method2");
		
			try
			{
				method3();
			}
			catch(Exception e){
				
				System.out.println(e);
				
			}
			finally{
				System.out.println("Finallyyyy");
			}
		
		System.out.println("Method 2 exit");
	}
	public static void method3() throws Throwable {
		System.out.println("In the method3");
		int a=0;
		int b=0;
		int c=a/b;
		throw new Throwable("testing throw ");
		
			}
	public static void div(int a , int b) throws ArithmeticException{
		
		
		if(b==0)
			try{int c = a/ b;
	
			}
		catch(ArithmeticException E) {
			System.out.println(E);
		}
		
		else {
			int c=a/b;
			System.out.println(c);
		}
	}
	static void testException1() throws CustomExcep
	{
		//System.out.println(10/0);
		throw new CustomExcep("Just for expri");
		
	}
	static void testException2() throws CustomExcep2
	{
		try {
			
			throw new CustomExcep2("Testing");
			}
		catch(CustomExcep2 e) {
			
			e.addInformation("Exc");
			
			
		}
	}
	
	
	public static void main(String [] args) throws CustomExcep3{
		
// 		M1();
		
		
// 		}
// 	static void M1() {
// 		System.out.println("Enter in M1");
// 		M2();
// 		System.out.println("Exited form M!");
		
// 	}
// 	static void M2() {
// 		System.out.println("Enter in M2");
// 		try {
// 			M3();
// 		}
// 		catch(Exception e) {
// 			System.out.println("b")
// ;		}
// 		System.out.println("Exited form M2");
		
// 	}
// 	static void M3() {
// 	int a = 10 , b =0 ;
// 	int c = a/b;
// 	System.out.println(c);
// 	}

		int x =0;
		while(x<5){
			System.out.println(x);
			x++;
		}

		
			
		
			
	
	
	}
}

