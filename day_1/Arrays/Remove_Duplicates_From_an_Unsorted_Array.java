package day_1.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_From_an_Unsorted_Array {
public static void main(String[] args) {
	int[] arr = {2, 3, 1, 9, 3, 1, 3, 9};
	Set<Integer> set = new HashSet<>();

	for (int num : arr)
	{ 
		set.add(num); 
	}
	System.out.println ("Array after removing duplicates:"); 
	for (int num : set) 
	{
		System.out.print(num + " "); 
	}
}
}


/*
HashSet
time-O(n) average
space-O(n)
*/