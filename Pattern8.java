public class p8 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++)
			{
				if(((i+j)-1)<10)
				{
					System.out.print("0");
				}
				System.out.print((i+j)-1  + " ");
				
			}
			  System.out.println();
		}

	}

}
/*
 01 02 03 04 05 
02 03 04 05 06 
03 04 05 06 07 
04 05 06 07 08 
05 06 07 08 09 
*/
