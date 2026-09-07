package map;

import java.util.HashMap;

public class EqualArrays {
public static void main(String[] args) {
	int []a = {1,2,3,4,5};
	int []b = {1,2,3,4,5};
	HashMap <Integer,Integer>map1 = new HashMap<>();
	HashMap <Integer,Integer>map2 = new HashMap<>();
	
	for(int k:a) {
		map1.put(k,map1.getOrDefault(k,0)+1);
	}
	
	for(int k:a) {
		map2.put(k,map2.getOrDefault(k,0)+1);
	}
	
	if(map1.equals(map2)) {
		System.out.println("Both are Equal");
	}
	else {
		System.out.println("Both are not Equal");
	}
	
}
}
