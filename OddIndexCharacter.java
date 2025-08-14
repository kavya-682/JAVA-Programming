/*
 * Extracts and prints all the characters present at odd indices in a given string in the order of their occurrence.

Input Format
The program takes a single line of input containing a string.

Output Format
Print the characters at odd indices in the order of their occurrence. If no characters are found at odd indices, output 'No characters found at odd indices.'

Sample Inputs & Outputs
Sample Input 1
TapAcademy
Sample Output 1
a A a e y

Sample Input 2
Testing
Sample Output 2
e t n
 */
package in.java;

import java.util.Scanner;

public class OddIndexCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
         for(int i=1;i<input.length();i=i+2) {
        		 System.out.print(input.charAt(i)+" ");
         }
         
	}

}
