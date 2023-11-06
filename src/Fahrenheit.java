import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char response;

		do {
			System.out.print("Digite a temperatura em Celsius: ");

			double celsius = sc.nextDouble();
			double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n", fahrenheit);

			System.out.print("Deseja repetir (s/n)? ");
			response = sc.next().charAt(0);
		} while (response != 'n');

		sc.close();

	}

}
