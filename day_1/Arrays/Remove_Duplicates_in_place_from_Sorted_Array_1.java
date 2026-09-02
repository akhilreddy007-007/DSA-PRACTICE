package day_1.Arrays;

import java.util.Scanner;

public class Remove_Duplicates_in_place_from_Sorted_Array_1 {
	
	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter size:");
	        int[] a = new int[sc.nextInt()];

	        System.out.println("Enter sorted elements:");

	        for (int i = 0; i < a.length; i++) {
	            a[i] = sc.nextInt();
	        }

	        int i = 0;
	        
	        for (int j = 1; j < a.length; j++) {

	            if (a[j] != a[i]) {
	                i++;
	                a[i] = a[j];
	            }
	        }

	       
	        int k = i + 1;

	        System.out.println("Number of unique elements: " + k);

	        System.out.println("Array after removing duplicates:");

	        for (int x = 0; x < k; x++) {
	            System.out.print(a[x] + " ");
	        }

	    }

//Approach	Time	 Two Pointer / Optimal
	//  time-o(n)
	//  space-o(1)
	  
}
