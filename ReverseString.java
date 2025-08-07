package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String res = reverse(s);
		System.out.println(res);
		

	}
	public static String reverse(String s) {
		String t ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			t = t + s.charAt(i);
		}
		return t;
	}

}