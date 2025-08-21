/*
Problem
Calculate the Hamming distance between two integers `a` and `b`, which is the number of positions at which the corresponding bits are different.
Input Format
First line contains an integer which represents a.
Second line contains an integer which represents b.
Output Format
The largest number with k bits set to 1.
Sample Inputs & Outputs
Sample Input 1
1
4
Sample Output 1
2
Sample Input 2
1
2
Sample Output 2
2
*/

import java.util.Scanner;

public class HammingDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int xor = a ^ b;
        int count = 0;
        while (xor != 0) {
            count += xor & 1;
            xor >>= 1;
        }

        System.out.println(count);
    }
}
