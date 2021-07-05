package uaspemroggramnlanjt;

public class D_KelipatanTiga {
    // field 
    private int i;
    private int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    
    // construktor
    public D_KelipatanTiga() {
        displayArray();
        srchMult();
    }
    // method untuk ngecek array
    private void displayArray() {
        System.out.println("CEK ARRAY : ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
    }
    // method mencari kelipatan 3
    public void srchMult() {
        System.out.println();
        System.out.println("YANG TERMASUK KELIPATAN 3 ADALAH : ");
        for (i = 0; i < array.length; i++) {
            if (array[i] %3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
    // method main
    public static void main(String[] args) {
        new D_KelipatanTiga();
    }
}
