import java.util.Scanner;

public class BitWiseBitToBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mask = 0b00100000;
		int number = sc.nextInt();

		if ((number & mask) != 0) {
			System.out.println("6th bit is true");
		} else {
			System.out.println("6th bit is false");
		}
		sc.close();
	}

}
