package day_5.Array_List;

import java.util.*;
public class AddRemoveUpdateIterate {
public static void main(String[] args) {

	
	ArrayList <Integer> al =new ArrayList<Integer>();
	
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	System.out.println(al);
	al.remove(0);//remove by index
	al.remove(Integer.valueOf(30));//remove by value,first convert value into object.
	al.set(0, 10);
	System.out.println("printing elements using Iterator");
Iterator <Integer> i = al.iterator();
	while(i.hasNext()) {
	System.out.println(i.next());
	}
	ArrayList <Integer> all =new ArrayList<Integer>(al);
	if(all.contains(10)) {
	System.out.println("true");
	}
	else {
	System.out.println("false");
	}
	all.clear();
	if(all.isEmpty()) {
	System.out.println("empty");
	}
	else {
	System.out.println("not empty");
	}
	
}
}