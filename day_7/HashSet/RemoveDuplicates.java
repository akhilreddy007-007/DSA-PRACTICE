package day_7.HashSet;
import java.util.Arrays;
import java.util.HashSet;
public class RemoveDuplicates {
public static void main(String[] args) {
	Integer []a = {1,2,3,4,5,5};
	HashSet <Integer>hs=new HashSet<>(Arrays.asList(a));
	System.out.println(hs);
	
	// or
	

int []b= {1,2,3,4,5,5};
HashSet <Integer>hs1=new HashSet<>(Arrays.stream(b).boxed().toList());
	System.out.println(hs1);
}
}