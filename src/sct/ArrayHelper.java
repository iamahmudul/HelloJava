package sct;

import java.util.Arrays;

public class ArrayHelper {
	public static void main(String[] args) {
		float resultArr[] = {69.4f,75.3f,43.22f,55.21f,35.87f,87.02f};
		System.out.println("Before sorting: "+Arrays.toString(resultArr));
		Arrays.sort(resultArr);
		System.out.println("After sorting: "+Arrays.toString(resultArr));
	}
}
