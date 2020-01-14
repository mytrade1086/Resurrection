package practice.java;

public class FunctionsDemo {

	public static void main(String[] args) {

		FunctionsDemo ff = new FunctionsDemo();
		System.out.println(ff.ReturnCapital("japan"));
	}

	public String ReturnCapital(String CountryName) {

		if (CountryName.trim().equalsIgnoreCase("India")) {

			return "New Delhi";

		} else if (CountryName.trim().equalsIgnoreCase("Canada")) {

			return "Canada";

		}

		else if (CountryName.trim().equalsIgnoreCase("Japan")) {

			return "Tokyo";

		}

		else {

			return "Data Out of Database";
		}
	}

}
