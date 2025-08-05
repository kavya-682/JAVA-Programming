public class A {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {           // i = rows (1 to 5)
		    for (int j = 1; j <= 9; j++) {       // j = columns (1 to 9)
		        if ((j == 6 - i) ||  (j == 4 + i) || (i == 3 && j > 3 && j < 7)){
		            System.out.print("*");
		        }
		        else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}


	}

}
/*
    *    
   * *   
  *****  
 *     * 
*       *
*/
