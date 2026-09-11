package day_8.Searching_Techniques;
/*
First occurrence → target found → go LEFT

Last occurrence  → target found → go RIGHT
*/
import java.util.Scanner;

public class LastOccurrence {

    public static int lastOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int answer = -1;
        while (left <= right) {

            int mid = left + (right - left) / 2;
            
            //or int mid = (left + right) / 2;

            if (arr[mid] == target) {
            	answer=mid;
//            	right = mid - 1;    for first occurrence            
            	left = mid + 1;  
            	}

            else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
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

    	        int result = lastOccurrence(arr, target);
    	if(result !=-1) {
    	        System.out.println("Index: " + result);
    	    }
    	else {
    		System.out.println("Not Found");
    	}	
    }
}