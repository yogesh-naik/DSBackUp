
public class TwoDprints {
/* All patterns  given on this link 
	https://www.phptpoint.com/print-star-pattern-in-java/
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// *
		// **
		// ***
		// ****
		// *****

		// for (int i = 1; i <= 5; i++) {
		// for (int j = 1; j <= i; j++) {
		// System.out.print("*");
		// }
		// System.out.println("");
		// }

		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println("");
			for (int j = 5 - i; j >= 0; j--) {
				System.out.print(" ");
			}

		}
		System.out.println();
		System.out.println("////////////////////////////////////////////////////");
		for (int i = 0; i <= 5; i++) {
			for (int k = 5; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			//
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("////////////////////////////////////////////////////");
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (int i = 4; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	System.out.println("////////////////////////////////////////////////////");
	}
}
