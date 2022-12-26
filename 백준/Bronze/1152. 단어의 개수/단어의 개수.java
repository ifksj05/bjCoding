import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] splitArr = str.split(" ");
		int result = 0;

		for (int i = 0; i < splitArr.length; i++) {
			if ((splitArr[i].isBlank())) {
				result -= 1;
			}
			result += 1;
		}

		System.out.println(result);
	}
}