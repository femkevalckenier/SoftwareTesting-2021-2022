package introduction;

public class AddingMethods {

	public static void main(String[] args) {
		String grade;

		grade = getGrades(70);
		displayGrades("John", grade);

		grade = getGrades(50);
		displayGrades("Tom", grade);


	}

	public static String getGrades(int studentScore) {
		String grade;
		if (studentScore >= 90 && studentScore < 100) {
			grade = "A";
		}
		else if (studentScore >= 80 && studentScore < 90) {
			grade = "B";
		}
		else if (studentScore >=70 && studentScore < 80) {
			grade = "C";
		}
		else {
			grade = "D";
		}

		return grade;
	}

	public static void displayGrades(String studentName, String grade) {
		System.out.println("Grade of " + studentName + " is: " + grade);
	}

}
