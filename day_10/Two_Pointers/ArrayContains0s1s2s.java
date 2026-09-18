package day_10.Two_Pointers;

/*
 *Given:
int[] a = {2, 0, 2, 1, 1, 0};
Sort it without using another array.
Expected:
0 0 1 1 2 2
The important condition is:
The array contains only 0, 1, and 2.
 
 *Time: O(n)
Every element is processed at most a constant number of times.
Space: O(1)
No extra array is created.
This is actually better than using a sorting algorithm like Bubble Sort here, which would take O(n²).
 
 
 
|  a[mid]  | Action           | Pointers     |
| -------- | ---------------- | ------------ |
|  0       | Swap with  low   | low++, mid++ |
|  1       | Do nothing       | mid++        |
|  2       | Swap with  high  | high--       |

 
 */

public class ArrayContains0s1s2s {

	public static void main(String[] args) {
		int[] a = {2, 0, 2, 1, 1, 0};

		int low = 0;
		int mid = 0;
		int high = a.length - 1;

		while (mid <= high) {

		    if (a[mid] == 0) {

		        int temp = a[low];
		        a[low] = a[mid];
		        a[mid] = temp;

		        low++;
		        mid++;
		    }

		    else if (a[mid] == 1) {

		        mid++;
		    }

		    else {

		        int temp = a[mid];
		        a[mid] = a[high];
		        a[high] = temp;

		        high--;
		    }
		}

		for (int i = 0; i < a.length; i++) {
		    System.out.print(a[i] + " ");
		}
	}
	
	
}
