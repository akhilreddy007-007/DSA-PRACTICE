package day_4.Strings;

import java.util.Scanner;

public class StringCompression {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String str=sc.next();//aaabbccaaa
	StringBuilder sb = new StringBuilder();
	int i = 0;
	while(i<str.length()) {

		int count=0;
		char ch = str.charAt(i);
		while(i<str.length() && str.charAt(i)==ch ) {
			count++;
			i++;
		}
		sb.append(ch);
		sb.append(count);
		
	}
	//Both will print Same output.
	System.out.println(sb);
	System.out.println(sb.toString());
	
	
	
	
}
}
