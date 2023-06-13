package com.dwimahdini.program;
public class gG {

    public static void main(String[] args) {
        int[] value = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("kelipatan 5 yang sebelumnya juga angka kelipatan 5 dalam array = ");
        for (int i = 1; i < value.length; i++) {
            if (value[i] % 5 == 0 && value[i-1] % 5 == 0) {
                System.out.print(value[i] + "");
            }
        }
    }   
}
