import java.util.Locale;


public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World From Java");
		System.out.println();
		
		// How to declare int variable
		int age = 31;
		System.out.println(age);
		
		// How to declare double variable
		double salary = 7500.0;
		System.out.printf("%.2f%n", salary);
		System.out.printf("%.4f%n", salary);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", salary);
		
		// How to concatenate strings
		String name = "Alfredo";
		System.out.println("My salary is: " + salary);
		System.out.printf("My salary is: %.2f%n", salary);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", name, age, salary);
	}
}
