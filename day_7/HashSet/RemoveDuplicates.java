package day_7.HashSet;
import java.util.Arrays;
import java.util.HashSet;
public class RemoveDuplicates {
public static void main(String[] args) {
	//change your source array type from the primitive int[] to the wrapper Integer[] 
	Integer []a = {1,2,3,4,5,5};
	HashSet <Integer>hs=new HashSet<>(Arrays.asList(a));
	System.out.println(hs);
	
	// or
	
//Use Java Streams to box the primitive array elements into wrapper objects before passing them to the set
int []b= {1,2,3,4,5,5};
HashSet <Integer>hs1=new HashSet<>(Arrays.stream(b).boxed().toList());
	System.out.println(hs1);
}
}