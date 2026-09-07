package day_6.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Crud {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashMap <Integer,String>map1= new	HashMap <Integer,String>();
	
System.out.println("enter how many elements want to insert");
	int n=sc.nextInt();
	System.out.println("enter "+n+" Strings to insert in hashmap");
	for(int i=0;i<n;i++) {
		map1.put(i+1, sc.next());//Insert            map1.put(1,'aaa');
	}
	
	System.out.println(map1);
	map1.put(1,"aaa");//update
	System.out.println(map1);
	map1.remove(3);//Delete
	System.out.println(map1);
	
	 for (HashMap.Entry<Integer, String> entry : map1.entrySet()) {

         System.out.println(
                 entry.getKey() + " -> " + entry.getValue());
     }

	
	
}
}
