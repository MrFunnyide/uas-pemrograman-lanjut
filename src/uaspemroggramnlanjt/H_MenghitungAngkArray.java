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
public class H_MenghitungAngkArray {
    // field 
    private int i;
    String panjangArray;
    private int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    
    //construltor
    public H_MenghitungAngkArray() {
        displayArrayLength();
    }
    
    // create method untuk mengecek array 
    private void displayArrayLength() {
        System.out.println("CEK ARRAY : ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        System.out.println("JUMLAH ANGKA DI DALAM ARRAY ADALAH : " + array.length);
    }
    
    // create methdo main
    public static void main(String[] args) {
        new H_MenghitungAngkArray();
    }
}
