package day_7.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class CheckDuplicates {
	public static void main(String[] args) {
		//change your source array type from the primitive int[] to the wrapper Integer[] 
		Integer []a = {1,2,3,4,5,5};
		HashSet <Integer>hs=new HashSet<>();
		  boolean duplicate = false;
		for (int num : a) {

	            if (hs.contains(num)) {
	                duplicate = true;
	                break;
	            }

	            hs.add(num);
	        }

	        System.out.println("Has duplicates: " + duplicate);

	}
}
