/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspemroggramnlanjt;

/**
 *
 * @author HP
 */
public class J_SelisihGnpDgnGenapSaja {
    // filed
    private int i, selisih;
    private int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    
    // construktor

    public J_SelisihGnpDgnGenapSaja() {
        displayArray();
        prosesSearch();
    }
    
    // membuat method untuk mengecek array 
    private void displayArray() {
        System.out.println("CEK ARRAY : ");
        for(i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
    /**
     * membuat method untuk mencari selisih angka genap
     * dengan selisih nya yang genap juga
     * @param args 
     */
    public void prosesSearch() {
        System.out.println();
        System.out.println("SELISIH ANGKA GENAP DENGAN ANGKA SETELAHNYA YANG GENAP : ");
        for(i = 0; i < array.length-1; i++) {
            if(array[i] %2 == 0 && array[i+1] %2 == 0) {
                selisih = array[i] - array[i+1];
                System.out.println("Selisih dari " + array[i]
                        /**
                         * Menggunakan method math.abs 
                         * untuk menghilangkan tanda(-)
                         */
                        + " dengan "+ array[i+1] +" adalah : "+ Math.abs(selisih));
            }
        }
    }
    // membuat method main
    public static void main(String[] args) {
        new J_SelisihGnpDgnGenapSaja();
    }
}
