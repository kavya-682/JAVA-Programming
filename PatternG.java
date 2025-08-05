public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 7; i++) {
		    for (int j = 1; j <= 7; j++) {
		        if ((i == 1 && j > 1) ||                    // Top horizontal bar (skip 1st column)
		            (i == 7 && j > 1) ||                    // Bottom horizontal bar
		            (j == 1 && i > 1 && i < 7) ||           // Left vertical bar (middle rows)
		            (i == 4 && j >= 4) ||                   // Middle horizontal bar (from j=4)
		            (j == 7 && i > 3 && i < 7))             // Right vertical bar (rows 4 to 6)
		            System.out.print("+");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}

	}

}
/*
  ++++++
+      
+      
+  ++++
+     +
+     +
 ++++++
 */
s