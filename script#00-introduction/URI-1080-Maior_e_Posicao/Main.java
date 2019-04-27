// URL: https://www.urionlinejudge.com.br/judge/pt/problems/view/1080
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] array = new int[100];
		int highest_value, highest_value_position;

		for (int i = 0; i < array.length; i++)
			array[i] = keyboard.nextInt();

        // Atribuindo primeiro valor como o maior.
		highest_value_position = 1;
		highest_value = array[0];

		for (int i = 1; i < array.length; i++)
			if (array[i] > highest_value) {
				highest_value = array[i];
				highest_value_position = i + 1;
			}

		System.out.printf("%d\n%d\n", highest_value, highest_value_position);
	}
}
