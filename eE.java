package com.dwimahdini.program;
public class eE {

    public static void main(String[] args) {
        int[] value = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Nilai-nilai yang mengandung angka 2 dalam array: ");
        for (int number : value) {
            if (containsDigit(number, 2)) {
                System.out.print(number + " ");
            }
        }
    }
    public static boolean containsDigit(int number, int digit) {
        while (number != 0) {
            int currentDigit = number % 10;
            if (currentDigit == digit) {
            return true;
            }
            number /= 10;
            }
            return false;
    }   
}
