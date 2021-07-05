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
public class F_AngkaGnjilAntraGnp {
    // field 
    private int i;
    private int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    
    // construktor
    public F_AngkaGnjilAntraGnp() {
        displayArray();
        searchProses();
    }
    
    
    // create method untuk mngecek array
    private void displayArray() {
        System.out.println("CEK ARRAY : ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
    
    // create method untuk mencari nilai ganjil yang berada antara nilai genap
    public void searchProses() {
        System.out.println();
        System.out.println("ANGKA GANJIL YANG DI APIT OLEH ANGKA GENAP ADALAH : ");
        for(i = 0; i < array.length-2; i++) {
            if (array[i] %2 == 0 && array[i+2]%2 == 0) {
                System.out.println(array[i+1]);
            }
        }
    }
    // create main
    public static void main(String[] args) {
        new F_AngkaGnjilAntraGnp();
    }
}
