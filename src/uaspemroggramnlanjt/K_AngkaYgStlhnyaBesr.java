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
public class K_AngkaYgStlhnyaBesr {
    // field
    private int i;
    private int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    
    // create construktor

    public K_AngkaYgStlhnyaBesr() {
        displayArray();
        searchBigest();
    }
    
    // membuat method untuk cek array
    private void displayArray() {
        System.out.println("CEK ARRAY : ");
        for(i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
    /**
     * Membuat sebuah method 
     * yang digunakan untuk mencari 
     * angka yang setelahnya bernilai lebih besar
     */
    public void searchBigest() {
        System.out.println();
        System.out.println("ANGKA YANG SETELAHNYA BERNILAI LEBIH BESAR : ");
        for (i = 0; i < array.length-1; i++) {
            if (array[i] < array[i+1]) {
                System.out.println(array[i] + " kecil dari " + array[i+1]);
            }
        }
    }
    // create method main
    public static void main(String[] args) {
        new K_AngkaYgStlhnyaBesr();
    }
}
