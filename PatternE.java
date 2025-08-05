public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 7; i++) {
		    for (int j = 1; j <= 7; j++) {
		        if ((i == 1) ||                  // Top horizontal bar
		            (i == 4) ||                  // Middle horizontal bar
		            (i == 7) ||                  // Bottom horizontal bar
		            (j == 1))                    // Left vertical bar
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}

	}

}
/*
*******
*      
*      
*******
*      
*      
*******
*/
