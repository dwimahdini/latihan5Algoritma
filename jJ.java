package com.dwimahdini.program;
public class jJ {

    public static void main(String[] args) {
        int[] value = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int a = 0; a < value.length - 1; a++) {
            if (value[a] % 2 == 0 && value[a + 1] % 2 == 0) {
                int selisih = value[a] - value[a+1];
                System.out.println("Selisih angka genap antara " + value[a] + " dan " + value[a + 1] + " adalah " + selisih);
            }
        }
    }  
}
