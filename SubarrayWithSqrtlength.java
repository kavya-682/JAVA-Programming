/*
Problem
Given an array of integers, find and print all subarrays whose length is a perfect square.

Input Format
The first line contains a single integer N, the size of the array. The second line contains N space-separated integers denoting the elements of the array.

Output Format
Print each subarray with a length that is a perfect square, in a new line as space-separated integers. If no such subarrays exist, print 'None'.

Explanation:
Sample Input 1:
4  
1 2 3 4
Sample Output 1:
1
2
3
4
1 2 3 4
Explanation:
The array is [1, 2, 3, 4] and the possible subarray lengths are perfect squares {1, 4}.
We extract all subarrays of size 1 and subarrays of size 4.
Sample Inputs & Outputs
Sample Input 1

4
1 2 3 4
Sample Output 1

1
2
3
4
1 2 3 4
Sample Input 2

3
5 6 7
Sample Output 2

5
6
7
Constraints
1 ≤ N ≤ 50, -100 ≤ Array[i] ≤ 100

*/

package in.java;


import java.util.Scanner;

public class SubarrayWithSqrtlength {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i] = scanner.nextInt();
		}
		
		for(int size=1;size<=array.length;size++)
		{    
			int srt = (int)Math.sqrt(size);
			if(srt*srt == size)
			{
				for(int i=0;i<=array.length-size;i++)
				{
					for(int j=i;j<i+size;j++)
					{
						System.out.print(array[j]+" ");
	                }
	 				System.out.println();
				}
			}
		}
	}
	

}