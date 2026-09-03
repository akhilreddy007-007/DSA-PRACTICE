package day_2.Strings;

public class First {
public static void main(String[] args) {
	String str = new String("hello");
	String str1 = "hello1";
	String str2="hello";
	
	if(str==str1) {
		System.out.println("equal address");
	}else {
		System.out.println("different address");
	}
	
	
	if(str1==str2) {
		System.out.println("equal address");
	}else {
		System.out.println("different address");
	}
	
	
	if(str.equals(str1)) {
		System.out.println("Both Strings are equal");
	}
	
	
}
}
