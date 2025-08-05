public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 7; i++) {
		    for (int j = 1; j <= 7; j++) {
		        if ((i == 1 && j <= 6) ||      // Top horizontal line (skip last column)
		            (i == 7 && j <= 6) ||      // Bottom horizontal line
		            (j == 1) ||                // Left vertical bar
		            (j == 7 && i > 1 && i < 7)) // Right vertical curve (middle rows)
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
*     *
*     *
*     *
*     *
*     *
****** 
*/