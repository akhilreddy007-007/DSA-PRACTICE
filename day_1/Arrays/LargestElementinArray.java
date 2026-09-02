package day_1.Arrays;

import java.util.Scanner;

public class LargestElementinArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
				int a[] = new int[n];

		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1;i<a.length;i++) {
if(a[i]>max)
{
	max=a[i];
}
		}
		System.out.println(max+" is the largest element in the array.");

	}
}
