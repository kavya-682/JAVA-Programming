/*
Problem
Given an array of integers, write a program to find and print the subarray of length k with the minimum difference between the largest and smallest value of the subarray.

Input Format
The first line contains an integer N representing the number of elements in the array. The second line contains an integer k representing the length of the subarrays to be considered. The third line contains N space-separated integers representing the elements of the array.


Output Format
Print the subarray of length k with the minimum difference between the largest and smallest value of the subarray.

Sample Inputs & Outputs
Sample Input 1

7
3
7 3 2 4 9 12 56
Sample Output 1

3 2 4
*/
import java.util.*;

public class SubarrayWithMinmunDiffrenceOfMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();  // Number of elements
        int k = sc.nextInt();  // Subarray length
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;
        int startIndex = 0;

        // Loop through all subarrays of length k
        for (int i = 0; i <= n - k; i++) {
            int min = arr[i];
            int max = arr[i];
            
            // Find min and max in current subarray
            for (int j = i; j < i + k; j++) {
                if (arr[j] < min) min = arr[j];
                if (arr[j] > max) max = arr[j];
            }

            int diff = max - min;
            if (diff < minDiff) {
                minDiff = diff;
                startIndex = i;
            }
        }

        // Print the subarray with minimum difference
        for (int i = startIndex; i < startIndex + k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
