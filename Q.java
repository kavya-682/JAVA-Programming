public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 7; i++) {
		    for (int j = 1; j <= 7; j++) {
		        if ((i == 1 && j>1 && j<7) ||(i == 6 && j>1 && j<7) || (j == 1 && i>1 && i<6) || (j == 7 && i>1 && i<6)|| (i == j && i > 4))                          // Tail (diagonal leg)
		            System.out.print("+");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}


	}

}
/*
+++++ 
+     +
+     +
+     +
+   + +
 +++++ 
      +
      */
