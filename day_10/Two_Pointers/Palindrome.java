package day_10.Two_Pointers;

public class Palindrome {
public static void main(String[] args) {
	int []a = {1,2,3,4,5,5,4,3,2,1};
	int left=0,right=a.length-1;
	while(left<right) {
		if(a[left]!=a[right]) {
			System.out.println("Not a Palindrome");
			System.exit(0);
		}
		left++;right--;
	}
System.out.println("Array is Palindrome");
}
}
