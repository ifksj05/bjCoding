import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] result = new int[26];

		for (int i = 0; i < result.length; i++) {

			for (int j = 0; j < s.length(); j++) {
				if (i == s.charAt(j) - 97) {
					result[i] = j;
					break;
				} else {
					result[i] = -1;
				}

			}

		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}
}
