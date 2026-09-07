package day_6.HashMap;
import java.util.ArrayList;
import java.util.HashMap;
public class GroupElements {
public static void main(String[] args) {
	int []a = {1,2,3,4,5};
	HashMap <String,ArrayList<Integer>> map = new HashMap<>();
	map.put("Even", new ArrayList<>());
	map.put("Odd", new ArrayList<>());
	for(int i : a) {
		if(i%2==0) {
			map.get("Even").add(i);
		}
		else {
			map.get("Odd").add(i);
		}
	}
	System.out.println(map);
}
}

