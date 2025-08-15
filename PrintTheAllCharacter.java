/*
 * Given a string, print each character in a new line.

Sample Inputs & Outputs
Sample Input 1

TapAcademy
Sample Output 1

T
a
p
A
c
a
d
e
m
y
Sample Input 2

HelloWorld
Sample Output 2

H
e
l
l
o
W
o
r
l
d
 */
package in.java;

import java.util.Scanner;

public class PrintTheAllCharacter {

	public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    for(int i=0;i<input.length();i++)
    {
    	System.out.println(input.charAt(i));
    }
	}

}
