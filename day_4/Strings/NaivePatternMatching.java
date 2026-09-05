package day_4.Strings;

import java.util.Scanner;

public class NaivePatternMatching {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String str=sc.next();//abcabc
	System.out.println("Enter pattern");
	String pattern = sc.next();//cab
	
	for(int i=0;i<str.length()-pattern.length();i++) {
		
		int j;
		for(j=0;j<pattern.length();j++) {
			if(pattern.charAt(j)!=str.charAt(i+j)) {
				break;
			}
		}
		if(j==pattern.length()) {
			System.out.println("pattern found at index "+i);
			System.exit(0);
		}
	}
	System.out.println("Pattern not found");
	
}
}

/*

str = "abcabc"
pattern = "cab"
First attempt
i = 0

text:
a b c a b c
↑
i

pattern:
c a b

Compare:

a != c

So:
break

Second attempt
i = 1
a b c a b c
  ↑
  i

Compare:
b != c

Again:
break

Third attempt
i = 2
a b c a b c
    ↑
    i

Now:

j = 0

text[i+j]
text[2+0]
text[2]
c

pattern[0]
c
c == c 

Next:

j = 1

text[2+1]
text[3]
a

pattern[1]
a
a == a 

Next:

j = 2

text[2+2]
text[4]
b

pattern[2]
b
b == b 

Now:

j == pattern.length()

So:

Pattern found at index 2

 why we write:

i <= text.length() - pattern.length()

Suppose:

text length = 6
pattern length = 3

Possible starting positions are:

0
1
2
3

At index 4, there aren't enough characters remaining for a 3-character pattern.

So:

6 - 3 = 3

and we allow:

i <= 3


Complexity

In the worst case, we may compare the pattern at almost every position.

Therefore:

Time:

O(n × m)

where:

n = text length
m = pattern length

Space:

O(1)

No additional data structure is required.



The two important lines are:

for (int i = 0; i <= str.length() - pattern.length(); i++)

and:

if (str.charAt(i + j) != pattern.charAt(j))

Naive Pattern Matching = try every possible starting position. 


*/