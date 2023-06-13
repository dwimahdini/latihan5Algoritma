package com.dwimahdini.program;
public class lL {

    public static void main(String[] args) {
        int[] value = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int sum = 0;

        for (int b = 0; b < value.length - 1; b++) {
            if (value[b] < value[b + 1]) {
                int selisih = value[b + 1] - value[b];
                System.out.println("Selisih: " + selisih);
                sum += selisih;
            }
        }
        System.out.println("Jumlah angka-angka selisih: " + sum);
    }
}
