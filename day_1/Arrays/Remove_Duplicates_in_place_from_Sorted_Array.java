package day_1.Arrays;


import java.util.Scanner;
import java.util.TreeSet;

public class Remove_Duplicates_in_place_from_Sorted_Array {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size");
	int []a = new int[sc.nextInt()];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	TreeSet <Integer>ts=new TreeSet <Integer>();
	for(int i=0;i<a.length;i++) {
		ts.add(a[i]);
	}
	System.out.println(ts);
	
}
}
//space complexity for above code is o(n log n),becaues treeset is o(log n)and we used for loop it will have o(n) so combined o(n log n)
//time complexity for above code is o(n),because of tree set