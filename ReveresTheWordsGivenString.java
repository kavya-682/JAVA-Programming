package in.java;

public class ReveresTheWordsGivenString {
	    public static void main(String[] args) {
	        String input = "Indea is my Country";
	        String output = reverseEachWord(input);
	        System.out.println(output);
	    }

	    private static String reverseEachWord(String str) {
	        String result = "";
	        int i = 0;
	        int n = str.length();

	        while (i < n) {
	            // Skip spaces
	            while (i < n && str.charAt(i) == ' ') {
	                result += " ";
	                i++;
	            }

	            // Start of a word
	            int start = i;
	            while (i < n && str.charAt(i) != ' ') {
	                i++;
	            }
	            int end = i - 1;

	            // Reverse the current word manually
	            for (int j = end; j >= start; j--) {
	                result += str.charAt(j);
	            }
	        }
	        return result;
	    }
	


}
// output>> aednI si ym yrtnuoC