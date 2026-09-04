package day_3.Strings;

//This Approch is Sliding Window Approch.

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringNoRepeat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.next();

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);

            // If duplicate is found
            while (set.contains(ch)) {

                set.remove(str.charAt(left));
                left++;
            }

            // Add current character
            set.add(ch);

            // Calculate window length
            int length = right - left + 1;

            maxLength = Math.max(maxLength, length);
        }

        System.out.println("Longest substring length: " + maxLength);
    }
}
