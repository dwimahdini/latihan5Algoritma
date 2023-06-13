package com.dwimahdini.program;
public class fF {

    public static void main(String[] args) {
        { 
        int[] value = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int a = 1; a < value.length - 1; a++) {
            if (value[a] % 2 != 0 && value[a - 1] % 2 == 0 && value[a + 1] % 2 == 0) {
                System.out.println(value[a]);
            }  
        }
        }
    }
}
