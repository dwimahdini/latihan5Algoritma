package com.dwimahdini.program;
public class mM {

    public static void main(String[] args) {
    int[] value = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    int totalJumlah = 0;
        
    for (int a = 0; a < value.length - 1; a++) {
            int selisih;
            if (value[a] > value[a + 1]) {
                selisih = value[a] - value[a + 1];
            } else {
                selisih = value[a + 1] - value[a];
            }
            totalJumlah += selisih;
        }
    System.out.println("Jumlah angka-angka selisih yang ditampilkan yaitu: ");    
    System.out.println(totalJumlah);
    }   
}

