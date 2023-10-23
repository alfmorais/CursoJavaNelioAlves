import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);

		
		int age;
		age = sc.nextInt();
		System.out.println("Sua idade: " + age);
		
		double salary;
		salary = sc.nextDouble();
		System.out.println("Seu salário: " + salary);
		
		char firstLetter;
		firstLetter = sc.next().charAt(0);
		System.out.println(firstLetter);
		*/
		String name;
		int valueY;
		double valueZ;
		
		name = sc.next();
		valueY = sc.nextInt();
		valueZ = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(name);
		System.out.println(valueY);
		System.out.println(valueZ);

		sc.close();
	}

}
