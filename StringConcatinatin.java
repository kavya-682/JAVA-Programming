/*
 * Concatenates two strings into a single string while preserving their original order.

Sample Inputs & Outputs
Sample Input 1

Tap
Academy
Sample Output 1

TapAcademy
Sample Input 2

Hello
123
Sample Output 2

Hello123
 */
package in.java;

import java.util.Scanner;

public class StringConcatinatin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		System.out.println(input1+input2);

	}

}
