/*
 Problem
Given two integer arrays, find the maximum length of a subarray that appears in both arrays. A subarray is defined as a contiguous sequence of elements within an array. Your task is to find the length of the longest contiguous subarray that is present in both arrays.

Input Format
The first line contains an integer `n`, the length of the first array.

The second line contains `n` space-separated integers, representing the elements of the first array.

The third line contains an integer `m`, the length of the second array.

The fourth line contains `m` space-separated integers, representing the elements of the second array.

Output Format
Print a single integer representing the maximum length of a repeated subarray found in both arrays.

Explanation:
if the input arrays are `[1, 2, 3, 2, 1]` and `[3, 2, 1, 4]`, the longest repeated subarray is `[3, 2, 1]`, with a length of `3`.

Sample Inputs & Outputs
Sample Input 1

5
1 2 3 2 1
4
3 2 1 4
Sample Output 1

3
Sample Input 2

4
1 2 3 4
3
5 6 7
Sample Output 2

0
Constraints
1 <= n, m <= 10^3 -100 <= array elements <= 100
 */
package in.java;

import java.util.Scanner;

public class MaximumLengthOfSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) 
        	{ 
        	B[i] = sc.nextInt();
        	}
        
        System.out.println(findLength(A, B));
	
     }

    public  static int findLength(int[] A, int[] B) 
    {
        int n = A.length, m = B.length;
        int[][] dp = new int[n + 1][m + 1];
        int maxLen = 0;

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= m; j++) 
            {
                if (A[i - 1] == B[j - 1]) 
                {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                } else 
                {
                    dp[i][j] = 0;
                }
            }

        }
        return maxLen;
     
    }
  }   
