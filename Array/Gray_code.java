package Array;


public class Gray_code {
	
	public static int gcd (int x , int y) { 
		
		if(y == 0) {
			return x;
		}
		else {
			return gcd(y , x % y);
		}
		
	}
	
	public static int sumOfArray(int [ ] num) {
		int sum =0;
		for( int k : num) {
			
			sum+=k;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		
//		System.out.println(gcd(12,15));
//		int [] nums = {2,4,5};
//		System.out.println(sumOfArray(nums));
//		int  num = 43532;
//		String s ="bhavesh"; 
//		String t = "BHaVESH";
//		char[] c = t.toCharArray();
//		System.out.println(c[0]);
		
		// String str = "I am Bhavesh";
		// String[] strarr = str.trim().split("\\str+");
		
		// System.out.println(strarr.length);
		// System.out.println(strarr[0]);
		// for(String s : strarr) {
		// 	System.out.print(s);
		// }
		// String s= String.join(" ", strarr);
		// System.out.println("\n"+s);

		System.out.println("Bhavesh khose");
		
		
		
	
		
		

	}

}
