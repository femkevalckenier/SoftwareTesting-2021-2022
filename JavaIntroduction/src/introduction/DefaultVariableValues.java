package introduction;

public class DefaultVariableValues {
	
	static int intVariable;
	static double doubleVariable;
	static boolean boolVariable;

	public static void main(String[] args) {
		System.out.println("Int value: " + intVariable);
		System.out.println("Double value: " + doubleVariable);
		System.out.println("Bool value: " + boolVariable);
	}
	
	public static void oneMoreMethod() {
		System.out.println("Int value: " + intVariable);
	}

}
