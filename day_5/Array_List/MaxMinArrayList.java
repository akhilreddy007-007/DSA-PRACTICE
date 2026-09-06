package day_5.Array_List;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class MaxMinArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(40, 10, 80, 20, 60));

        int max = list.get(0);
        int min = list.get(0);

        for (int num : list) {

            if (num > max)
                max = num;

            if (num < min)
                min = num;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("using collections");
    System.out.println(Collections.max(list));
    System.out.println(Collections.min(list));
    }
}