import java.util.Scanner;

public class StrucutureDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int values = sc.nextInt();
		int stopInteration = 0;

		do {
			System.out.println("Valor = " + stopInteration);
			stopInteration++;
		} while (stopInteration != values);

		sc.close();

	}

}
