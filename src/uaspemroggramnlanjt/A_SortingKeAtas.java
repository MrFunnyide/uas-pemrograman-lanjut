package uaspemroggramnlanjt;

public class A_SortingKeAtas {
    // field
    private int i, j, min, temp;
    private int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
 
    // construktor
    public A_SortingKeAtas() {
        // panggil method yang ingin di jalankan
        cekArray();
        asscedingSort();
        callArraySort();
    }
    // create method masukkan array
    private void cekArray() {
        System.out.println("CEK ARRAY : ");
        for(i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
    // create method for sorting
    public void asscedingSort() {
        System.out.println();
        System.out.println("DI URUTKAN KEATAS MENJADI : ");
        for (i = 0; i < array.length; i++) {
            min = i;
            
            for(j = i; j < array.length; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            // lakukan pertukaran nilai 
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
    // create method untuk memnaggil array 
    public int callArraySort(){
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        return i;
    }
    // method main
    public static void main(String[] args) {
        // panggil construktor
        new A_SortingKeAtas();
    }
}
