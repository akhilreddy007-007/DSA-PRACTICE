package day_1.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallLarge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
				int a[] = new int[n];

		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		if(a.length==1) {
			System.out.println("Second Smallest : -1");
			System.out.println("Second Largest : -1");
			System.exit(0);
		}
		Arrays.sort(a);
//		Second Smallest : 2  
//		Second Largest : 5 
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
}
		System.out.println("Second Smallest : "+a[1]);
		System.out.println("Second Largest : "+a[a.length-2]);
		
	}
}
