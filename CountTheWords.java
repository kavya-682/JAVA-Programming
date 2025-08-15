/*
 * Counts the number of words in a given string[words might be separated by multiple space].


Sample Inputs & Outputs
Sample Input 1

Hello World!
Sample Output 1
2

Sample Input 2
Programming is fun
Sample Output 2
3

 */
package in.java;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();
       System.out.println(countWords(input));
	}
	
	public static int countWords(String input) {
		int count=0;
		for(int i=0;i<input.length()-1;i++) {
			if(input.charAt(i)==' '&& input.charAt(i+1)!=' ') {
				count++;
			}
		}
		int  res=input.charAt(0)==' '? count:count+1;
         return res;
	}

}

