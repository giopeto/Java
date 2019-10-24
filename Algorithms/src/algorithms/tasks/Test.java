package algorithms.tasks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {


    public static void main(String[] args) {

        //printXFibonachiNumbers(10);
        //insertElementInArray();
        //removeElementFromArrayAtPosition();
        //sortArray();
        //findNumberInSortedArray();
        rotateLeft(new int[]{1, 2, 3, 4, 5}, 2);
        rotateRight(new int[]{1, 2, 3, 4, 5}, 2);
    }

    private static void rotateLeft(int[] a, int d) {
        while(d-->0) {
            int firstElement = a[0];
            for(int i=0; i< a.length-1; i++) {
                a[i] = a[i+1];
            }
            a[a.length-1] = firstElement;

        }

        System.out.println(Arrays.toString(a));
    }

    private static void rotateRight(int[] a, int d) {

        while(d-- > 0) {
            int last = a[a.length-1];
            for(int i = a.length - 1; i > 0; i--) {
                a[i] = a[i-1];
            }
            a[0] = last;
        }

        System.out.println(Arrays.toString(a));
    }

    // binary search
    private static void findNumberInSortedArray() {

    }

    private static void sortArray() {
        int[] startArr = {6, 3, 1, 6, 4, 2};

        for(int i = 0; i < startArr.length; i++) {
            for(int j = i+1; j < startArr.length; j++) {
                if(startArr[i] > startArr[j]) {
                    int temp = startArr[i];
                    startArr[i] = startArr[j];
                    startArr[j] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(startArr));
    }

    private static void removeElementFromArrayAtPosition() {
        int[] startArr = {1, 2, 3, 4, 5};
        int removePosition = 3;
        removeElementFromArrayAtPositionStream(startArr, removePosition);
        removeElementFromArrayAtPositionLoop(startArr, removePosition);
        
    }

    private static void removeElementFromArrayAtPositionLoop(int[] startArr, int removePosition) {
        int[] endArr = new int[startArr.length-1];

        for(int i = 0, j = 0; i < startArr.length; i++) {
            if(i == removePosition) {
                continue;
            }
            endArr[j++] = startArr[i];
        }

        System.out.println(Arrays.toString(endArr));

    }

    private static void removeElementFromArrayAtPositionStream(int[] startArr, int removePosition) {
        int[] endArr = IntStream.range(0, startArr.length)
                .filter(i -> i != removePosition)
                .map(i -> startArr[i])
                .toArray();
        
        System.out.println(Arrays.toString(endArr));
    }

    private static void insertElementInArray() {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int newElement = 42;
        int insertPosition = 2;
        int[] newArr = Arrays.copyOf(arr, arr.length+1);

        int i = arr.length - 1;

        while(i < insertPosition) {
            newArr[i+1] = newArr[i];
            i--;
        }

        newArr[insertPosition+1] = newArr[insertPosition];
        newArr[insertPosition] = newElement;

        System.out.println(Arrays.toString(newArr));
    }

    private static void printXFibonachiNumbers(int n) {
        // print n fibonachi numbers
        int a = 0;
        int b = 1;
        n -= 2;
        int c;
        System.out.print(a + " " + b);

        while(n-- > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
        System.out.println("************");
    }




}
