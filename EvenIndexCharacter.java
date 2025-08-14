/*
 * Extracts and prints all the characters present at even indices in a given string in the order of their occurrence.

Sample Input 1
TapAcad
Sample Output 1
T p c d

Sample Input 2
12345
Sample Output 2
1 3 5
 */
package in.java;

import java.util.Scanner;

public class EvenIndexCharacter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
         for(int i=0;i<input.length();i=i+2) {
        		 System.out.print(input.charAt(i)+" ");
         }

	}

}
