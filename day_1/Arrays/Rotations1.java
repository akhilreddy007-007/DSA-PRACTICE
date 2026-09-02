package day_1.Arrays;
import java.util.Scanner;
public class Rotations1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        //  Read rotation steps (k)
        int k = sc.nextInt();
        
        //  Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        //  Handle cases where k is greater than array size
        k = k % n; 
        
        //  Create a temporary array to store the rotated result
        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            // Formula for left rotation: shift index backwards by k positions
            int newPosition = (i - k + n) % n;
            rotatedArr[newPosition] = arr[i];
        }
        
       
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
        
   
    }
}
