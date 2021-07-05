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
public class G_KelipatnLimaSetlhKelptnLima {
    // field 
    private int i;
    private int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    
    // construktor 
    public G_KelipatnLimaSetlhKelptnLima() {
        displayArray();
        searchMultiple5();
    }
    
    // method untuk cek array 
    private void displayArray() {
        System.out.println("CEK ARRAY : ");
        for(i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
    // method searchMultiple5
    public void searchMultiple5() {
        System.out.println();
        System.out.println("KELIPATAN 5 SETELAH KELIPATAN 5 : ");
        for(i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i-1] % 5 == 0) {
                System.out.println(array[i]);
            }
        }
    }
    // method main
    public static void main(String[] args) {
        new G_KelipatnLimaSetlhKelptnLima();
    }
}
