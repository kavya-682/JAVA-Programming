package in.java;

import java.util.Scanner;

public class CountLengthOfWordsInString {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        String input = scan.nextLine().trim();
        String output = reverseEachWord(input);
        System.out.println(output);
    }

    private static String reverseEachWord(String str) {
        String result = "";
        int i = 0;
        int n = str.length();
        

        while (i < n) {
            // Skip spaces
            while (i < n && str.charAt(i) == ' ') {
                result += " ";
                i++;
            }

            // Start of a word
            int start = i;
            int count=0;
            while (i < n && str.charAt(i) != ' ') {
                i++;
                count++;
            }
            int end = i - 1;

            // Reverse the current word manually
            for (int j = start; j <=end; j++) {
                result += str.charAt(j);
            }
            result+=count;
        }
        return result;
    }


}
//  input>>   kavya anju uppara 682
//  output>>  kavya5 anju4 uppara6 6823