package day_2.Strings;

import java.util.Scanner;

public class Palindrome_Using_StringBuilder {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	StringBuilder st = new StringBuilder();
	System.out.println("enter a String");
	st.append(sc.next());
	
	String s1=st.toString();
	String s2=st.reverse().toString();
	if(s1.equals(s2)){
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	}


}

