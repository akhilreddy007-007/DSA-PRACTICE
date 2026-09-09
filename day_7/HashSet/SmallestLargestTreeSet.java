package day_7.HashSet;

import java.util.*;

public class SmallestLargestTreeSet {
    public static void main(String[] args) {

        int[] arr = {40, 10, 70, 20, 50};

        TreeSet<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("TreeSet = " + set);

        System.out.println("Smallest = " + set.first());
        System.out.println("Largest = " + set.last());
    }
}