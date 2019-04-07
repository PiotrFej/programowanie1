package programowanie1;

public class MyArray {
    private int size = 10;
    private int[] arr = new int[this.size];
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

    public int length(){
        return this.arr.length;
    }

    public int find(int toFind){
        for (int i = 0; i < this.length(); i++){
            if (toFind == arr[i]){
                    return i;
            }

        }
        return -1;
    }

    public int pick (int i){
        if (i < 0 || i > this.length()) {
            throw new ArrayIndexOutOfBoundsException(
                    "Nieprawidołowy indeks ( >0, <" + this.length()
            );
        }
        else {
            return this.arr[i];
        }
    }

    // public void push(int toPush)
    public void push(int toPush){
        if (this.length() == this.size ){
            int[] newArr = new int[2 * this.length()];
            for(int i = 0; i < newArr.length; i++){
                if(i < this.length()) newArr[i] = this.arr[i];
        }
            newArr[this.size] = toPush;
            this.arr = newArr;
            this.size++;
            
        }
        else {

            
        }

    }
}
