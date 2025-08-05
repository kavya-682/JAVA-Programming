public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 7; i++) {       // i = rows (1 to 7)
		    for (int j = 1; j <= 7; j++) {   // j = columns (1 to 7)
		        if ((i == 1 && j <= 6) || (i == 4 && j <= 6)|| (i == 7 && j <= 6)|| (j==1)|| (j == 7 && i > 1 && i < 4) || (j == 7 && i > 4 && i < 7)) {
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
****** 
*     *
*     *
****** 
*     *
*     *
****** 
*/