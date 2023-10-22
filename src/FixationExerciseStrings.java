import java.util.Locale;

public class FixationExerciseStrings {
	public static void main(String[] args) {
		String productOne = "Computer";
		String productTwo = "Office Desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double priceOne = 2100.0;
		double priceTwo = 650.50;
		double measure = 52.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", productOne, priceOne);
		System.out.printf("%s, which price is $ %.2f%n", productTwo, priceTwo);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}
}
