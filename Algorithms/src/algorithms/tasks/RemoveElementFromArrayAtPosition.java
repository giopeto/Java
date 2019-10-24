package algorithms.tasks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveElementFromArrayAtPosition {
    public static void main(String[] args) {
        int[] startArr = {1, 2, 3, 4, 5};
        int removePosition = 1;
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

}
