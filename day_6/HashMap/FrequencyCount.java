package day_6.HashMap;
import java.util.HashMap;
public class FrequencyCount {
public static void main(String[] args) {
	int []a= {1,2,3,4,4,5};
	HashMap<Integer,Integer>map=new HashMap<>();
	for(int i:a) {
		map.put(i,map.getOrDefault(i,0)+1);
	}
	System.out.println(map);
	
}
}
