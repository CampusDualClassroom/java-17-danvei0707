package com.campusdual.classroom;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise17 {
	public static int[] createEmptyIntArray(int positions) {
        return new int[positions];
	}

	public static String[] createInitializedStringArray() {
        return new String[]{"1","2","3"};
	}

	public static void populateArray(int[] array, int index, int value) {
		System.out.println(Arrays.toString(array));
		array[index] = value;
		System.out.println("After changes: " + Arrays.toString(array));
	}

	public static int arrayLength(int[] array) {
		return array.length;
	}

	public static void showValue(int[] array, int index) {
		System.out.println(array[index]);
	}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
		populateArray(intArray, 0, 3);
		populateArray(intArray, 1, 5);
		populateArray(intArray, 2, 7);
		showValue(intArray, 0);
		System.out.println(arrayLength(intArray));
	}
}
