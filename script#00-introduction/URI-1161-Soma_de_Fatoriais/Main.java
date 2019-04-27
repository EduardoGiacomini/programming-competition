// URL: https://www.urionlinejudge.com.br/judge/pt/problems/view/1161
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		int value_a, value_b;
		long factorial_a, factorial_b;

		while (keyboard.hasNext()) {
			value_a = keyboard.nextInt();
			value_b = keyboard.nextInt();
			factorial_a = 1;
			factorial_b = 1;

			if (value_a > 1) {
				while(value_a > 1) {
					factorial_a *= value_a;
					value_a--;
				}
			}

			if (value_b > 1) {
				while(value_b > 1) {
					factorial_b *= value_b;
					value_b--;
				}
			}

			System.out.printf("%d\n", (factorial_a + factorial_b));
		}
	}
}