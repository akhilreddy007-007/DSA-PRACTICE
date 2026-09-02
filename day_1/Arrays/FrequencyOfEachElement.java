package day_1.Arrays;
import java.util.Scanner;
public class FrequencyOfEachElement {
	
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter array size");
			int n = sc.nextInt();
					int a[] = new int[n];

			for (int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}
			
				freq(a);
				
		}
		//10 20 10 20 30 40
		public static void freq(int []a)
		{
			boolean b[] = new boolean[a.length];
			for(int i=0;i<a.length;i++) {
				
				if(b[i]==true) {
					continue;
				}
				
				int count=0;
				
				for(int j=0;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
						b[j]=true;	
					}
				}
				System.out.println(a[i]+" count is "+count);
				
				
			}
		}
	
}
