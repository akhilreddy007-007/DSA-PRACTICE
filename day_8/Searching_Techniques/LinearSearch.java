package day_8.Searching_Techniques;

/*
Complexity of program
Best Case  → O(1)
Average    → O(n)
Worst Case → O(n)
Space      → O(1)
 */



/*
 * When to use?
Use Linear Search when:
Array is unsorted
Array is small
You don't want to sort the array first
 */


import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
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

        int result = linearSearch(arr, target);
if(result !=-1) {
        System.out.println("Index: " + result);
    }
else {
	System.out.println("Not Found");
}
}
}