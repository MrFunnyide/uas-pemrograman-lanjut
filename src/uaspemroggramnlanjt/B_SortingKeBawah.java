package uaspemroggramnlanjt;

public class B_SortingKeBawah {
    // field
    private int i, j, min, temp;
    private int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    
    // construktor
    public B_SortingKeBawah() {
        // panggil method yang ingin di jalankan
        displayArray();
        descdingSort();
        callSort();
    }
    
    // cereate method untuk cek array
    private void displayArray() {
        System.out.println("CEK ARRAY : ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
        
    // create method for sorting
    public void descdingSort() {
        System.out.println();
        System.out.println("DIURUTKAN MENURUN MENJADI : ");
        for (i = 0; i < array.length; i++) {
            min = i;
            
            for(j = i; j < array.length; j++) {
                if(array[j] > array[min]) {
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
    public int callSort(){
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        return i;
    }
    // method main
    public static void main(String[] args) {
        // panggil construktor
        new B_SortingKeBawah();
    }
}
