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
public class L_MnjumlhAngkaDgnAngkStlhnya {
    // field
    private int i, jumlah;
    private int [] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    
    // made contruktor 
    public L_MnjumlhAngkaDgnAngkStlhnya() {
        displayArray();
        addArray();
    }
    
    // made method untuk mengecek isi array 
    private void displayArray() {
        System.out.println("CEK ARRAY : ");
        for(i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
    /**
     * Membuat method yang menampilkan
     * jumlah array dengan array selanjutnya
     * yang nilainya genap
     */
    public void addArray() {
        System.out.println();
        System.out.println("ARRAY YANG SUDAH DI TAMBAHKAN "
                + "DENGAN ARRAY SELANJUTNYA, YANG NILAINYA GENAP");
        for(i = 0; i < array.length-1; i++) {
            jumlah = array[i] + array[i+1];
            if (jumlah %2 == 0) {
                System.out.println(array[i]+" di tambah dengan " 
                        + array[i+1] + " adalah : " +jumlah);
            }
        }
    }
    // membuat method main
    public static void main(String[] args) {
        new L_MnjumlhAngkaDgnAngkStlhnya();
    }
}
