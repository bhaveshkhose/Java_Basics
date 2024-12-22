package Array;
import java.util.*;

public class ArrayOperation {
	
	/*
	 * This Method will print this pattren
	 * if n = 5 then
	 * 00005
	 * 0004
	 * 003
	 * 02
	 * 1
	 */
	public static void print(int n) {
				for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n -i-1; j++) {
				System.out.print(0);
			}	
			System.out.println(n -i);
		}
	}
	
	public static void insertElement(int[] nums , int n , int idx) {
		
		int[] result = new int[nums.length+1];
		
		result = nums;
		
		if(idx < 0 || idx > nums.length) {
			System.out.println("Index out of bound");
			return ;
		}
		
		for(int i = nums.length -2; i >= idx ; i--) {
			result[i +1] = result[i];
		}
		result[idx] = n;
		
		for(int i : result) {
			System.out.print(i +" ");
		}
				
	}
 	
	public static void printArray1(int[] arr) {
		System.out.print("[");
		for(int i =0 ; i < arr.length ; i ++) {
			System.out.print(arr[i]+" ,");
		}
		System.out.print("]");
		
	}
	
	public static void linearSearch(int[] arr , int target) {
		for(int i=0 ; i < arr.length ; i++) {
			if(arr[i] == target ) {
				System.out.println("\ntarget ("+target +") is found at index "+i);
				return ;
			}
		}
		
		System.out.println("target is not found in array");
	}
	public static int binarySearch(int[] arr , int target) {
		
		// [1,2,3,4,5,6,8]
		Arrays.sort(arr);
		int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid potential overflow

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1;
			
	}
	public static void findTheElement(int[] arr , int target) {
		//Scanner sc = new Scanner(System.in);
		for(int i =0 ; i < arr.length ; i++) {
			
			if(arr[i] == target) {
				System.out.printf("Element %d is found at the index %d \n",target , i);
				return;
			}
			//System.out.println("Element is not found ");
			
		}
	}
	
	
	
	public static void addAtIndex(int [] arr , int idx , int ele) {
		
		int[] newarr = new int[arr.length +1];
		int i ;
		for(  i=0 ; i < idx ; i++) {
			newarr[i] = arr[i];
		}
		
		newarr[i] =ele;
		
		for( i = idx ; i < newarr.length-1 ; i++) {
			newarr[i+1] = arr[i];
		}
		
		printArray1(newarr);
	}
			
		
		
		
		
	
	public static void main(String [] args) {
		
		int[] arr = {4,3,2,5,6};
		int [] result = new int[arr.length+1];
		
		insertElement(arr , 5 , 3);
		
		print(40);
		
		findTheElement(arr,6);
		String print1  = Arrays.toString(arr);
		System.out.println(print1);
		int[] array = {4,3,2,1,5};
		System.out.println(Arrays.toString(array));
		addAtIndex(array,3,10);
		linearSearch(array , 1);
		binarySearch(array, 5);
		System.out.println(binarySearch(array, 5));
		System.out.println(arr.hashCode());
		
		insertElement(arr, 10, 3);

	}

}
