package day_3.Strings;
import java.util.Scanner;
public class AnagramCheckDsaApproch {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter first string:");
	        String s1 = sc.next();

	        System.out.println("Enter second string:");
	        String s2 = sc.next();

	        // Different lengths cannot be anagrams
	        if (s1.length() != s2.length()) {
	            System.out.println("Not Anagram");
	            return;
	        }
	    	/*
	    	 * index=str.charAt(i)-'a';
	    	 * freq[index]=freq[index]+1;
	    	 * in simple freq[index]++; 
	    	 */
	    	
	        int[] freq = new int[26];

	        // Count characters of first string                     0 0 0 0 0 ......... 1.. 1.. 2..  3
	        //	index												0 1 2 3 4 ......... 12..18..22..24 
	        for (int i = 0; i < s1.length(); i++) {
	            freq[s1.charAt(i) - 'a']++;
	        }

	        // Remove characters of second string					    0 0 0 0 0 ......... 0.. 0.. 0.. 0
	        //	                                                  		0 1 2 3 4 ......... 12..18..22..24 
	        for (int i = 0; i < s2.length(); i++) {
	            freq[s2.charAt(i) - 'a']--;
	        }

	        // Check if all frequencies are zero
	        for (int i = 0; i < 26; i++) {

	            if (freq[i] != 0) {
	                System.out.println("Not Anagram");
	                return;
	            }
	        }

	        System.out.println("Anagram");
	    }
}
