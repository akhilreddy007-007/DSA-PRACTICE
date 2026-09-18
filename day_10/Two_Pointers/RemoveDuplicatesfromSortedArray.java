package day_10.Two_Pointers;

public class RemoveDuplicatesfromSortedArray {
public static void main(String[] args) {
	int []a= {1,1,2,2,3,3,4,4,5,5};
	int i=0;
	for(int j=1;j<a.length;j++) {
		if(a[i]!=a[j]) {
			i++;
			a[i]=a[j];
		}
	}
	for(int k=0;k<=i;k++) {
		System.out.print(a[k]+" ");
	}
}
}
