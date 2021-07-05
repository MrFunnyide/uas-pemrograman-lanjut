package uaspemroggramnlanjt;

public class C_MencriAngkGanjl {
    // field 
    private int i;
    private int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

    // create construktor
    public C_MencriAngkGanjl() {
        displayArray();
        srchOdd();
    }
    // membuat method untuk cek Array 
    private void displayArray() {
        System.out.println("CEK ARRAY : ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
    // buat method untuk mencari angka ganjil
    public void srchOdd() {
        System.out.println();
        System.out.println("ANGKA GANJIL YANG ADA : ");
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i] +" pada indeks ke " + i);
            }
        }
    }
    // cretae method main
    public static void main(String[] args) {
        new C_MencriAngkGanjl();
    }
}
