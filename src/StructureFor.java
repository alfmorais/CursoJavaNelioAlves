import java.util.Scanner;

public class StructureFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfLoop = sc.nextInt();
		double sumAllValues = 0;

		for (int index = 0; index < numberOfLoop; index++) {
			System.out.println("Valor de index = " + index);
			int value = sc.nextInt();
			sumAllValues += value;
		}

		System.out.println("Soma = " + sumAllValues);
		sc.close();
	}
}
