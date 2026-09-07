package day_6.HashMap;
import java.util.HashMap;
public class FirstNonRepeating {
public static void main(String[] args) {
	int []a = {1,2,3,4,4,5};
	HashMap<Integer,Integer>map=new HashMap<>();
	for(int i:a) {
		map.put(i,map.getOrDefault(i,0)+1);
	}
	for(int i:a) {
		if(map.get(i)==1) {
			System.out.println("First Non Repeating "+i);
			break;
		}
	}
}
}
