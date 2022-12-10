import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		String num = sc.next();
		String[] numArr = num.split("");
		int result = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			result = result + Integer.parseInt(numArr[i]);
		}
		
		System.out.println(result);
		
	}

}
