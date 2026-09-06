package day_5.Array_List;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(50, 10, 40, 20, 30));
 System.out.println("Before sort"+list);
        Collections.sort(list);
System.out.println("after sort"+list);
    }
}