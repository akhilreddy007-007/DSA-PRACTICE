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
//map.put(i,map.getOrDefault(i,0)+1);

/*
Iteration 1: num = 10
Check: map.getOrDefault(10, 0) looks for the key 10. 
It is not there, so it returns the default value 0.
Calculate: 0 + 1 = 1.Update: map.put(10, 1) adds the pair to the map.
Current Map: {10=1}

Iteration 2: num = 20
Check: map.getOrDefault(20, 0) looks for 20.
It is not there, so it returns 0.
Calculate: 0 + 1 = 1.Update: map.put(20, 1) adds the pair to the map.
 Current Map: {10=1, 20=1}

Iteration 3: num = 10
Check: map.getOrDefault(10, 0) looks for 10.
It finds it! The current value is 1.
Calculate: 1 + 1 = 2.
Update: map.put(10, 2) overwrites the old value.
 Current Map: {10=2, 20=1}

Iteration 4: num = 3
0Check: map.getOrDefault(30, 0) looks for 30.
It is not there, so it returns 0.Calculate: 0 + 1 = 1.
Update: map.put(30, 1) adds the pair to the map. 
Current Map: {10=2, 20=1, 30=1}

Iteration 5: num = 2
0Check: map.getOrDefault(20, 0) looks for 20. 
It finds it! The current value is 1.Calculate: 1 + 1 = 2.
Update: map.put(20, 2) overwrites the old value.
 Current Map: {10=2, 20=2, 30=1}

Iteration 6: num = 10
Check: map.getOrDefault(10, 0) looks for 10. 
It finds it! The current value is 2.
Calculate: 2 + 1 = 3.
Update: map.put(10, 3) overwrites the old value.

 Final Map: {10=3, 20=2, 30=1}
*/
