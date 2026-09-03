package day_2.Strings;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	System.out.println(sb.capacity());

	System.out.println("enter string");
	System.out.println("Reverse String is : "+sb.append(sc.next()).reverse());

}
}
