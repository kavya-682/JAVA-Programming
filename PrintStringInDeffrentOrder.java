package in.java;

import java.util.Scanner;

public class PrintStringInDeffrentOrder {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] res =printWords(s);
		for(int i=res.length/2-1;i>=0;i--)
		{
			System.out.print(res[i]+" ");
		}
		for(int i=res.length-1;i>=res.length/2;i--)
		{
			System.out.print(res[i]+" ");
		}
		

	}
	
	public static String[] printWords(String str)
	{
	  int j=0;
	  int count = countWords(str);
	  String[] ar = new String[count];
	  String t="";
	  for(int i=0;i<str.length();i++)
	  {
		  if(str.charAt(i)!=' ')
		  {
			  t=t+str.charAt(i);
		  }
		  else if(t.length()>0)
		  {
			  ar[j]=t;
			  j++;
			  t="";
		  }
	  }
	  if(t.length()>0) {
		  ar[j]=t;
	  }
	   return ar;
	}
	
	public static int countWords(String s)
	{
		int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ' )
			{
				count++;
			}
		}
		return s.charAt(0)==' ' ? count : count+1;
	}

}
/* input>> India is my country
 * output>> is India country my 
 */
