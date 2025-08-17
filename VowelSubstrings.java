/*
Print all substrings that consist of only vowels.

Sample Input 1
bcd
Sample Output 1
No vowel substrings

Sample Input 2
aeiou
Sample Output 2
a e i o u ae ei io ou aei eio iou aeio eiou aeiou
*/
package in.java;

import java.util.*;

public class VowelSubstrings {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        sc.close();

        int n = s.length();
        List<String> result = new ArrayList<>();

        // loop for substring size
        for (int size = 1; size <= n; size++) {
            for (int i = 0; i + size <= n; i++) {

                // build substring manually
                String sub = "";
                boolean allVowels = true;

                for (int k = i; k < i + size; k++) {
                    char ch = s.charAt(k);

                    // check vowel
                    if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                        allVowels = false;
                    }

                    sub += ch; // manually append
                }

                if (allVowels) {
                    result.add(sub);
                }
            }
        }

        if (result.isEmpty()) {
            System.out.println("No vowel substrings");
        } else {
            // print without join() (also inbuilt)
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i));
                if (i != result.size() - 1) System.out.print(" ");
            }
        }
    }
}



