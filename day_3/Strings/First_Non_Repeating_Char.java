package day_3.Strings;
import java.util.Scanner;
public class First_Non_Repeating_Char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int []freq=new int[26];
		
		/*
		 * index=str.charAt(i)-'a';
		 * freq[index]=freq[index]+1;
		 * in simple freq[index]++; 
		 */
		
		for(int i=0;i<str.length();i++) {
			freq[str.charAt(i)-'a']++;
		}
		
		for (int i = 0; i < str.length(); i++)	
		{ 
		if (freq[str.charAt(i) - 'a'] == 1)
		{ 
			System.out.println("First non-repeating character: " + str.charAt(i));
			return; 
		}
		}
		System.out.println("No non-repeating character found.");
	}
}
