package com.dwimahdini.program;
public class bB {

    public static void main(String[] args) {
    int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
       int angka = 48;
       boolean found = false;
       
       for (int nilai : array){
           if (nilai == angka){
               found = true;
               break;
           }
    }  
    if (found){
            System.out.println("" + angka + " dapat ditemukan dalam Array");
    } else {
            System.out.println("" + angka + " tidak dapat ditemkan dalam Array");
    }
  }   
}
