
public class FormatStringInJava {

	public static void main(String[] args) {
		String name = "Alfredo de Morais Neto";
		String lowerCaseName = name.toLowerCase();
		String upperCaseName = name.toUpperCase();
		String trimName = name.trim();
		String subStringName = name.substring(2);
		String subStringRangeName = name.substring(5, 14);
		String replaceName = name.replace(" ", "-");
		int index = name.indexOf("Mo");
		String[] vect = name.split(" ");
		String firstName = vect[0];
		String firstSecondName = vect[1];
		String lastName = vect[2];

		System.out.println(name + " -> " + lowerCaseName);
		System.out.println(name + " -> " + upperCaseName);
		System.out.println(name + " -> " + trimName);
		System.out.println(name + " -> " + subStringName);
		System.out.println(name + " -> " + subStringRangeName);
		System.out.println(name + " -> " + replaceName);
		System.out.println("Index: " + index);
		System.out.println(vect);
		System.out.println(firstName);
		System.out.println(firstSecondName);
		System.out.println(lastName);
	}

}
