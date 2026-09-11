package day_8.Searching_Techniques;

/*
Complexity
Time  → O(log n)
Space → O(log n)   ← recursion stack
So:
Iterative Binary Search → O(1) extra space
Recursive Binary Search → O(log n) stack space
 */

import java.util.Scanner;

public class RecursiveBinarySearch {
	
	public static int binarySearch(int []a,int left,int right,int target) {
		
		if(left>right) {
			return -1;
		}
		int mid = left+(right-left)/2;
		if(a[mid]==target) {
			return mid;
		}
		if(a[mid]<target) {
			return binarySearch(a,mid+1,right,target);
		}
		return binarySearch(a,left,mid-1,target);
		

	}

	 public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	System.out.println("How many Elements want to insert");
	int n = sc.nextInt();
	int []arr = new int[n];
	System.out.println("Enter "+n+" Array Elements");
	        for(int i = 0;i<arr.length;i++) {
	        	arr[i]=sc.nextInt();
	        }
	System.out.println("Enter Target Element");
	        int target = sc.nextInt();

	        int result = binarySearch(arr,0,arr.length-1,target);
	if(result !=-1) {
	        System.out.println("Index: " + result);
	    }
	else {
		System.out.println("Not Found");
	}
	}
}
