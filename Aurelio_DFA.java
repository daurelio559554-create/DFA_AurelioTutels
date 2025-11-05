package DFA_simu;


	import java.util.Scanner;


public class Aurelio_DFA {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Input: ");
	        String input = sc.nextLine().trim();
	        sc.close();

	        int state = 0;

	        for (char c : input.toCharArray()) {
	            if (c != '0' && c != '1') {
	                System.out.println("Output: Rejected");
	                return;
	            }
	            if (state == 0) {
	                if (c == '0') state = 1;
	                else state = 0;
	            } else if (state == 1) {
	                if (c == '0') state = 1;
	                else state = 2;
	            } else if (state == 2) {
	                if (c == '0') state = 1;
	                else state = 0;
	            }
	        }

	        if (state == 2) System.out.println("Output: Accepted");
	        else System.out.println("Output: Rejected");
	    }
	}
