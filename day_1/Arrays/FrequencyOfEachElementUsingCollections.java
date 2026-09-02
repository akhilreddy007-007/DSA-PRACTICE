package day_1.Arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class FrequencyOfEachElementUsingCollections {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	ArrayList <Integer>al=new ArrayList <Integer>();
	for(int i=0;i<n;i++) {
		al.add(sc.nextInt());
	}
	System.out.println();
	/*
	for(int i=0;i<n;i++) {
	System.out.println("frequency of "+al.get(i)+" is "+Collections.frequency(al, al.get(i)));	
	}
	*/
	
/*		
5
5 6 4 2 4
frequency of 5 is 1
frequency of 6 is 1
frequency of 4 is 2
frequency of 2 is 1
frequency of 4 is 2
but here problem is, 4 value is 2 frequency and it is repeting 2 times
*/
	HashSet <Integer> hs = new HashSet <Integer>(al);
	for(int k:hs) {
		System.out.println("frequency of "+k+" is "+Collections.frequency(al,k));
	}

	
}
}
