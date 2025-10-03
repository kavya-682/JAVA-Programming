/*
Problem
Write a program that reads an array of N integers and calculates the maximum number of disjoint groups that can be formed.

Input Format
The first line contains a single integer N, the number of elements in the array. The second line contains N space-separated integers, the elements of the array.

Output Format
Print a single integer, the maximum number of disjoint groups with at least one element repeating three times that can be formed from the array.

Sample Inputs & Outputs
Sample Input 1

10
1 2 2 2 3 4 4 4 4 5
Sample Output 1

2
Sample Input 2

7
1 2 3 3 4 3 5
Sample Output 2

1
*/

import java.util.*;

public class MaximumNumberOfDisjointGroups{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Frequency map
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        int groups = 0;
        for (int count : freq.values()) {
            groups += count / 3;  // each 3 occurrences can form one group
        }
        
        System.out.println(groups);
        
        sc.close();
    }
}
