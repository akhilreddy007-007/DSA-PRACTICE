package day_4.Strings;

import java.util.Scanner;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of strings:");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        String prefix = words[0];

        for (int i = 1; i < n; i++) {

            int j = 0;

            while (j < prefix.length()
                    && j < words[i].length()
                    && prefix.charAt(j) == words[i].charAt(j)) {

                j++;
            }

            prefix = prefix.substring(0, j);

            if (prefix.length() == 0) {
                break;
            }
        }

        System.out.println("Longest Common Prefix: " + prefix);
    }
}


//Enter number of strings:
//2
//Enter strings:
//flower
//flight
//Longest Common Prefix: fl

