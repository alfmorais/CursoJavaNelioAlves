import java.util.Scanner;

public class ConditionalSentences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour;

		System.out.println("Quantas horas?");
		hour = sc.nextInt();

		if (hour >= 12 && hour < 18) {
			System.out.println("Boa tarde");
		} else if (hour >= 18) {
			System.out.println("Boa noite");
		} else {
			System.out.println("Bom dia");
		}
		
		sc.close();
	}
}
