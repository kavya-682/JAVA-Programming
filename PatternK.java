public class K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        for (int i = 1; i <= 7; i++) {           // Rows
		            for (int j = 1; j <= 7; j++) {       // Columns
		                if (j == 1 || (j==6-i && i<=4)||(i>4 && j==i-2) ) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();                // New line
		        }
		    }
		

		    }
		
