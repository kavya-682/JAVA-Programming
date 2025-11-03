/*
Problem
Given a string `S` consisting of lowercase English letters, and two integers `K` and `M`, your task is to determine the length of the longest substring of `S` that satisfies the following conditions: 1. **At Most K Distinct Characters:** The substring contains no more than `K` distinct characters. 2. **Minimum Frequency:** Each distinct character in the substring appears at least `M` times. If no such substring exists, return `0`.

Input Format
The first line contains a string `S` consisting of lowercase English letters. The second line contains two space-separated integers `K` and `M`.

Output Format
Print a single integer representing the length of the longest valid substring.

Explanation:
S = "aaabbcc", K = 2, and M = 2.

Analyzing the string:

Possible Substrings:
"aaabb": Contains 2 distinct characters 'a' and 'b'. 'a' appears 3 times, 'b' appears 2 times. Valid, length = 5.
"aabbc": Contains 3 distinct characters 'a', 'b', and 'c'. Exceeds K = 2. Invalid.
"abbcc": Contains 3 distinct characters 'a', 'b', and 'c'. Exceeds K = 2. Invalid.
"aaabbc": Contains 3 distinct characters. Invalid.
Other shorter substrings either have fewer distinct characters or do not meet the minimum frequency requirement.

Longest Valid Substring: "aaabb" with length 5.

Sample Inputs & Outputs
Sample Input 1

aaabbcc
2 2
Sample Output 1

5
Sample Input 2

abacbebebe
3 2
Sample Output 2

6

*/

package in.java;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class LongestValidStringLength 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		int k = scanner.nextInt();
		int m =scanner.nextInt();
		
	 System.out.println(  longestValidString( s, k, m));
	 
	}
	
	public static int longestValidString(String s,int k,int m)
	{    
		
		for(int size=s.length();size>0;size--)
		{   
			for(int i=0;i<=s.length()-size;i++)
			{   String temp="";
				for(int j=i;j<i+size;j++)
				{
					 temp=temp+s.charAt(j) ;
				}
				if(isValid(temp,k,m))
				{
				  return temp.length();
				}
				
			}
		}
		
		return 0;
	}
	
	public static boolean isValid(String s,int k,int m)
	{
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
		}
		
		if(map.size()>k)
		{
			return false;
		}
		else
		{
			Set<Character> set= map.keySet();
			for(Character x:set)
			{
				if(map.get(x)< m)
				{
					return false;
				}
			}
			
		}
		
		return true;
	}
	
}