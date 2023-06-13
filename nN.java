package com.dwimahdini.program;
public class nN {

    public static void main(String[] args) {
    int[] value = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

    System.out.println("Menampilkan jumlah angka-angka di dalam array dengan seluruh angka-angka sebelumnya");
    for (int indeks = 0; indeks < value.length - 1; indeks++) {
    int jumlah = (value[indeks+1] + value[indeks]);
            System.out.println(jumlah);
    }
    }  
}
