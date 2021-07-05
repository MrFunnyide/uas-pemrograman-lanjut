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
public class I_SelisihAngkDgnAngkStlhny {
    // field
    private int i, selisih;
    private int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    
    // construktor
    public I_SelisihAngkDgnAngkStlhny() {
        displayArray();
        cariSelisihAngka();
    }
    
    // create method cek Array 
    private void displayArray() {
        System.out.println("CEK ARRAY : ");
        for(i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
    
    /**
     * membuat method untuk mencari 
     * selisih angka dengan angka 
     * setelahnya.
     * @param args 
     */
    public void cariSelisihAngka() {
        System.out.println();
        System.out.println("SELISIH ANGKA DENGAN ANGKA SELANJUTNYA ADALAH : ");
        for (i = 0; i < array.length-1; i++) {
                selisih = array[i] - array[i+1];
                System.out.println("Selisih dari " + array[i] + " dengan "
                        /**
                         * Menggunakan method Math.abs
                         * untuk menghilangkan tanda (-) 
                         * yang ada .
                         */
                        + array[i+1] + " : " + Math.abs(selisih));
        }
    }
    // create method main
    public static void main(String[] args) {
        new I_SelisihAngkDgnAngkStlhny();
    }
}
