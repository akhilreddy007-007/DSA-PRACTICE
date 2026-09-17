package day_10.Two_Pointers;

public class TwoSum {
public static void main(String[] args) {
	int []a= {1,2,3,4,6,8};
	int target=10;
	boolean flag=false;
	int left=0,right=a.length-1;
	while(left<right) {
		int sum = a[left]+a[right];
		if(sum==target) {
			System.out.println("for "+target+", sum of 2 numbers from given array are "+a[left]+","+a[right]);
			flag=true;
			break;
		}
		else if(sum<target) {
			left++;
		}
		else {
			right--;
		}
	}
	if(!flag) {
		System.out.println("no numbers in array matches");
	}
}
}
