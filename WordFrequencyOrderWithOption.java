/*
Problem
Write a Java program that processes a paragraph to count distinct word occurrences and display them based on the given sorting order. Words should be extracted after converting the text to lowercase and removing punctuation.

Input Format
The program should accept:

1) A single line of input

2) A number (0 or 1) on the next line.

Output Format
Display each distinct word followed by a space and its frequency on a new line. The ordering depends on the second input: 0 for alphabetical order, 1 for frequency descending.

Sample Inputs & Outputs
Sample Input 1

This is a paragraph. It contains words, and sentences, and separators.
0
Sample Output 
a 1
and 3
contains 2
has 1
is 1
it 2
paragraph 2
sentences 2
separators 1
this 1
three 1
words 2
Sample Input 2


This is a paragraph. It contains words, and sentences, and separators. 
1
Sample Output 
and 3
contains 2
it 2
paragraph 2
sentences 2
this 1
words 2
a 1
has 1
is 1
separators 1
three 1
*/
import java.util.*;

class WordFrequencyOrderWithOption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the paragraph input and convert to lowercase
        String input = scanner.nextLine().toLowerCase();

        // Read sorting option (0 - alphabetical, 1 - frequency)
        int option = scanner.nextInt();

        // Use TreeMap to automatically keep keys in alphabetical order
        TreeMap<String, Integer> map = new TreeMap<>();

        String s = ""; // Temporary variable to build each word

        // Iterate through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Keep letters or numbers as part of a word
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                s += ch;
            } else {
                // If a separator or punctuation is found, store the word
                if (!s.isEmpty()) {
                    map.put(s, map.getOrDefault(s, 0) + 1);
                    s = "";
                }
            }
        }

        // Handle the last word if string doesn't end with punctuation
        if (!s.isEmpty()) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // Option 0: alphabetical (TreeMap default)
        if (option == 0) {
            for (String key : map.keySet()) {
                System.out.println(key + " " + map.get(key));
            }
        }
        // Option 1: sort by frequency descending manually
        else {
            // Convert map entries to list for sorting by value
            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
            entryList.sort((a, b) -> {
                int freqCompare = b.getValue().compareTo(a.getValue());
                if (freqCompare == 0) {
                    return a.getKey().compareTo(b.getKey());
                }
                return freqCompare;
            });

            // Print results
            for (Map.Entry<String, Integer> entry : entryList) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        scanner.close();
    }
}



