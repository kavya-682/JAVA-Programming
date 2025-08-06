public class O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 7; i++) {
		    for (int j = 1; j <= 7; j++) {
		        if ((i == 1 || i == 7) && j > 1 && j < 7 ||
		            (j == 1 || j == 7) && i > 1 && i < 7)
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
+     +
+     +
 +++++ 
*/