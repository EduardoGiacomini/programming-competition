// URL: https://br.spoj.com/problems/FATORIA2/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int value;
        long factorial = 1;

        value = keyboard.nextInt();

        if (value > 1) {
        	while (value > 1) {
        		factorial *= value;
        		value -= 1;
        	}
        }

        System.out.printf("%d\n", factorial);
    }
}