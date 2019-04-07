package programowanie1;

// 1. Napiszmy metodę, która wypisze co drugi element tablicy przekazanej jako parametr.

public class Zadanie1 {
    public static void main(String[] args)
    {

        int tablica[] = {0,1,2,3,4,5,6,7,8,9,11};
        coDrugi(tablica);
    }

    public static void coDrugi(int[] arr){
        for (int i = 0; i < arr.length; i += 2){
            System.out.println(arr[i]);
        }
    }


}
