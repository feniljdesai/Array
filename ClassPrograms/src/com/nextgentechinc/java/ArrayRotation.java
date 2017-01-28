package com.nextgentechinc.java;

public class ArrayRotation {

	public int[] rotateArray(int array[], int k) {

		int newArray[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {

			newArray[(i + k) % array.length] = array[i];
		}

		System.arraycopy(newArray, 0, array, 0, array.length);
		return newArray;

	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7 };
		ArrayRotation rotate = new ArrayRotation();

		rotate.display(rotate.rotateArray(array, 3));

	}

	public void display(int array[]) {
		for (int i : array) {
			System.out.print(i + ",");

		}
	}
}
