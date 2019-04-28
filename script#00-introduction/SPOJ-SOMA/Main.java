// URL: https://br.spoj.com/problems/SOMA/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] array;
		int n_tests, sum = 0;

		n_tests = keyboard.nextInt();

		array = new int[n_tests];

		for (int i = 0; i < array.length; i++) {
			array[i] = keyboard.nextInt();
			sum += array[i];
		}

		System.out.printf("%d\n", sum);
	}
}