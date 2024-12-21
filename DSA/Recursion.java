package DSA;

public class Recursion {
	
	// Method of printing name 5 times using recursion
	public static String printName(String name , int  n) {
		
		if(n == 0) return null ;
		System.out.println(name );
		return printName(name, n -1);
	}

	//Method to print the sum of the n number 
	public static int printSum(int n){
		if(n == 0)return 0;

		return n + printSum(n -1);
	}

	//Method 

	
	// Method for printing the table of number
	public static void tableOfTwo(int num , int to) {
		if(to == 11)return;
		int n = num * to;
		System.out.printf("%d x %d = %d \n",num,to,n);
		tableOfTwo(num , to+1);
	}
	
	//Method to print the number form 1 to n
	public static void printNtoN(int m ,int n ) {
		if(m == n +1) return;
		System.out.println(m);
		printNtoN(m +1 , n );
	}
	
	//Method to print the factorial of number
	public static int facto(int num) {
		if(num == 0 || num ==1)return num;
	
		
		return num * facto(num -1);			
	}
	public static void main(String [] args) {
		// printName("Bhavesh" , 5);
		// tableOfTwo(8 ,1);
		// printNtoN(1,10);
		// int x = facto(4);
		// System.out.println(x);

		System.out.println(printSum(5));
		
	}

}
