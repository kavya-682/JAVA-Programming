public class C {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for (int i = 1; i <= 7; i++) {       // Outer loop: rows (1 to 7)
		    for (int j = 1; j <= 7; j++) {   // Inner loop: columns (1 to 7)
		        if (
		            (i == 1 && j > 1) || 
		            (i == 7 && j > 1) || 
		            (j == 1 && i > 1 && i < 7)
		           )
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}

		

	}

}
/*
  ******
*      
*      
*      
*      
*      
 ******

 */

