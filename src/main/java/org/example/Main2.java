package org.example;

import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		int k = 1;
		int day = 6;

		System.out.println(Arrays.toString(apartmentManagement(day, k)));
	}

	private static int[] apartmentManagement(int day, int k) {
        int[] result = new int[12];
        int currentDay = day;
        for (int i = 0; i < 12; i++) {
            if (currentDay == 5 || currentDay == 6) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
            currentDay = (currentDay + k) % 7;
        }
        return result;
    }
}
