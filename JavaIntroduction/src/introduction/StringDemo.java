package introduction;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = "Hello!";
		
		System.out.println(str1.charAt(2));
		System.out.println(str1.length());
		System.out.println(str1.startsWith("Hello"));
		System.out.println(str1.endsWith("Hello"));
		System.out.println(str1.indexOf("H"));
		System.out.println(str1.contains("Hello!"));
		System.out.println(str1.substring(1));
		System.out.println(str1.replace("e", "a"));
	}
}
