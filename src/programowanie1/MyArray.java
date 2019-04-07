package programowanie1;

public class MyArray {
    private int[] arr = new int[10];
    // metoda dostepna z zewnatrz drukujaca cala tablice
    // konstruktor przyjmujacy tablice
    // konstruktor domyslny - () -> niech wypelnia arr zerami [0]

    MyArray(){
        for (int elem: this.arr){
            elem = 0;
        }
    }
    MyArray(int [] inputArr){
        this.arr = new int[inputArr.length];
        int l = inputArr.length;
            for(int i = 0; i < l; i++){
                this.arr[i] = inputArr[i];
            }
        }


    public void printArray(){
        for(int elem : this.arr){
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public int find(int toFind){
        for (int i = 0; i < arr.length; i++){

        }
        return -1;
    }
}
