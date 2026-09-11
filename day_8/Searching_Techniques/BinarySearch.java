package day_8.Searching_Techniques;

/*
Complexity
Best Case  → O(1)
Worst Case → O(log n)
Space      → O(1)
 */

/*
Important interview point
Instead of:
int mid = (left + right) / 2;
prefer:
int mid = left + (right - left) / 2;

because it avoids integer overflow when left + right becomes too large.
 */


import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            
            //or int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
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

    	        int result = binarySearch(arr, target);
    	if(result !=-1) {
    	        System.out.println("Index: " + result);
    	    }
    	else {
    		System.out.println("Not Found");
    	}	
    }
}