package introduction;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int[] myIntArray1;
		myIntArray1 = new int[10];
		
		myIntArray1[0] = 1;
		myIntArray1[1] = 2;
		myIntArray1[2] = 3;
		myIntArray1[3] = 4;
		
		System.out.println("0 index of array myIntArray: " + myIntArray1[0]);
		System.out.println("1st index of array myIntArray: " + myIntArray1[1]);
		
		String[] myStringArray1 = {"BMW", "Audi", "Peugeot", "Citroën"};
		for (String car : myStringArray1) {
			System.out.println(car);
		}
		
		Arrays.sort(myIntArray1);
	}

}
