package com.dwimahdini.program;
public class iI {

    public static void main(String[] args) {
        int[] value = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int a = 0; a < value.length - 1; a++) {
            int selisih = value[a] - value[a + 1];
            System.out.println("Selisih antara " + value[a] + " dan " + value[a + 1] + " adalah " + selisih);
        }
    }  
}
