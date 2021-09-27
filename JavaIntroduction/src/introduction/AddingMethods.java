package introduction;

public class AddingMethods {

	public static void main(String[] args) {
		getGrades("John", 90);
		getGrades("Tom", 50);
	}

	public static void getGrades(String studentName, int studentScore) {
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

		System.out.println("Grade of " + studentName + " is: " + grade);
	}

}
