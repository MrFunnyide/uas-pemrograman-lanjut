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
public class AlgoBubbleSort_6 {
    // filed
    private int i, j, temp;
    private int[] array = {30, 54, 65, 29, 25, 9, 60, 9, 44, 24, 16, 64};
    
    // construktor

    public AlgoBubbleSort_6() {
        displayArray();
        sortingArrayBubbleSort();
    }
    
    // membuat method untuk menampilkan array sebelum di sorting
    private void displayArray() {
        System.out.println("CEK ARRAY : ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println();
    }
    
    // membuat method untuk mengurutkan array mengggunakan bubble sort
    public void sortingArrayBubbleSort() {
        System.out.println("MENGURUTKAN MENGGUNAKAN BUUBLE SORT : ");
        for(i = 0; i < array.length-1; i++) {
            for(j = 0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    // jika kondisi benar lakukan swap
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        // lakukan perulangan untuk menampilkan array yang terlah di urutkan 
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println();
    }
    
    // membuat methdo main untuk run
    public static void main(String[] args) {
        new AlgoBubbleSort_6();
    }
}
