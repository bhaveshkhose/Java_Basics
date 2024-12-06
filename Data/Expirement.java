package Data;


public class Expirement {
	
	public static void main(String args[]) {
		
//		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//		
//		int n = arr.length;
//		System.out.println(n);
//		int m = arr[n-1].length;
//		System.out.println(m);
//		
//		int pri=0;
//		int sec =0;
//		
//		for(int i=0 ; i<n;i++)
//		{
//			pri += arr[i][i];
//			sec +=arr[i][n-i-1];
//		}
//		int sum=0;
//		
//		if(m==n) {
//			sum = pri+ sec -arr[m-2][n-2];
//		}
//		System.out.println(sum);
//		
		int n = 30;
		
		   int zeroes = 0;
	       while(n >= 5){
	        n/= 5;
	        zeroes += n;
	       }

	   System.out.println(zeroes);
	
	
	}
	
}
