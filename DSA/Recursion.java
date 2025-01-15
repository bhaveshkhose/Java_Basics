package DSA;
import Array.ArrayOperation;

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

	//Method for inserting element in the array in alternate from
	public static void alterArrayPosition(int[] arr, int start, int end) { 
		if(end >= arr.length) {
			return;
		}
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		alterArrayPosition(arr , start +1 , end +1);
	}

	
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

	//Method to find the power og any number
	public static int power(int num , int pow){
		if(pow == 0){
			return 1;
		}
		int result = num *power(num , pow -1);

		return result;

	}
	
	//Method for find the power of any number using log function
	public static int  power2(int num , int pow) {
		if(pow == 1) return num;
		int a = power2(num , pow/2);
		int result = a *a;
		return result;
	}
	
	

	//Method for print the sum of n number
	public static int sum(int n , int sum){
		if(n == 0) return sum;
		return sum(n-1 , sum +n);
	}

	//Method that sum of multiple of number 
	public static void sumOfMultiple(int num, int end , int sum){
		//if(num == end)return;
		for(int i = num ; i <= end ; i+=num){
			sum = sum + i;

		}
		System.out.println(sum);
		

	}

	//Method for pre , in , post order expresion
	public static void preInPost(int n){
		if(n == 0)return;
		System.out.println("pre "+ n);
		preInPost(n -1);
		System.out.println("In " + n);
		preInPost(n -1);
		System.out.println("Post "+n);
		return;
	}


	public static void main(String [] args) {
		// printName("Bhavesh" , 5);
		// tableOfTwo(8 ,1);
		 //printNtoN(20,30);
		// int x = facto(4);
		// System.out.println(x);
		//print(5);
		//System.out.println(sum(5,0));
		
		// System.out.println(power(3 , 8));
		// System.out.println(power2(3,8 ));

		preInPost(2);
	}

}
