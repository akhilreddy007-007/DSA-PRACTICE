package day_10.Two_Pointers;

public class ReverseArray {
public static void main(String[] args) {
	int []a = {5,4,3,2,1};
	int left = 0;
	int right = a.length-1;
	
	while(left<right) {
		int temp = a[left];
		a[left]=a[right];
		a[right]=temp;
		left++;
		right--;
	}
	for(int k:a) {
	System.out.print(k+" ");
	}
}
}
