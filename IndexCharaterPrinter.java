/*
 * Prints the character present at a given index in a string, and the index value should starts from 0.

If the index is invalid or the string is empty, output "Invalid index".

Sample Inputs & Outputs
Sample Input 1

TapAcademy
3
Sample Output 1
A

Sample Input 2
Testing
7
Output 2 >>
Invalid index
 */
package in.java;
import java.util.Scanner;
public class IndexCharaterPrinter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int index = scanner.nextInt();
         for(int i=0;i<input.length();i++) {
        	 if(i==index) {
        		 System.out.println(input.charAt(i));
        		 return;
        	 }
         }
         System.out.println("Invalid index");

	}

}
