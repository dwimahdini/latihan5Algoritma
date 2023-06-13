package com.dwimahdini.program;
public class cC {

    public static void main(String[] args) {
        int[] value = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.println("Nilai Ganjil pada Array tersebut berupa = ");
        for (int nilai : value){
            if (nilai %2 != 0){
                System.out.println(nilai);
            }
        }
    }   
}
