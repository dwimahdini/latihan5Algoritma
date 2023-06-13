package com.dwimahdini.program;
public class dD {

    public static void main(String[] args) {
        int[] value = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Angka-angka kelipatan 3 di dalam array = ");
        for (int number : value) {
            if (number % 3 == 0) {
                System.out.print(number + "");
        }
        }  
    }   
}
