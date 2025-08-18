/*
Problem
Count the number of substrings that consist of only consonants.

Input Format
A single string containing only lowercase alphabets.

Output Format
Print the count of substrings that consist of only consonants.

Sample Inputs & Outputs
Sample Input 1

abcd
Sample Output 1

6
Sample Input 2

aeiou
Sample Output 2

0
Constraints
1 <= Length of string <= 1000
*/

import java.util.Scanner;
class CountOnlyConsonatSubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //System.out.println(countVowelSubstrings(input));
        System.out.println(countConsonantSubstrings(input));
    }

    public static int countConsonantSubstrings(String input) {
        int count = 0;
        for(int size = input.length(); size >= 1; size--) {
            for(int i = 0; i <= input.length() - size; i++) {
                String t = "";
                for(int j = i; j < i + size; j++) {
                    t += input.charAt(j);
                }
                if(allCharactersConsonant(t)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean allCharactersConsonant(String t) {
        int i = 0;
        while(i < t.length()) {
            char ch = t.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    return false;
                }
            } else {
                return false;
            }
            i++;
        }
        return true;
    }
}
