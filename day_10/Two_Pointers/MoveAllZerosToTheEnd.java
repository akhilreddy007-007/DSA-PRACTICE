package day_10.Two_Pointers;

public class MoveAllZerosToTheEnd {
public static void main(String[] args) {
	int []a = {0,0,0,1,0,3,12,14,0,16};
	int l=0;
	for(int k : a) {
		System.out.print(k+" ");
	}
	System.out.println();
	for(int r=1;r<a.length;r++) {
		if(a[l]==0 && a[r]==0) {
		continue;
		}
		else if(a[l]==0) {
			int temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
		}
	}
	
	for(int k : a) {
		System.out.print(k+" ");
	}
	
}
}
/*
 Complexity 
| ------- | ---- |
| Time    | O(n) |
| Space   | O(1) |
*/
