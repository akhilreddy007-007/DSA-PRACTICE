package day_2.Strings;

import java.util.Scanner;

public class Palindrome_Using_2_Pointers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String str = sc.next();
	
	int left = 0;
	int right = str.length() - 1;

	while (left < right) {

	    if (str.charAt(left) != str.charAt(right)) {
	        System.out.println("Not Palindrome");
	     //   return;
	    System.exit(0);
	    }

	    left++;
	    right--;
	}

	System.out.println("Palindrome");
}
}
