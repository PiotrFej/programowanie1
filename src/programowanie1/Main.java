package programowanie1;

public class Main {

    int[] arr = new int[10];



    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] testArr = {1,2,3,4};
        MyArray ma = new MyArray();
        MyArray ma2 = new MyArray(testArr);
        ma.printArray();
        ma2.printArray();
        System.out.println(ma.pick(8));
        ma2.push(17);
        ma.printArray();
    }
}

