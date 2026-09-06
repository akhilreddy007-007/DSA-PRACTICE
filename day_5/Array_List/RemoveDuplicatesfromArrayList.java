package day_5.Array_List;

import java.util.*;

public class RemoveDuplicatesfromArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 20, 40));

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }

        System.out.println(result);
    }
}


