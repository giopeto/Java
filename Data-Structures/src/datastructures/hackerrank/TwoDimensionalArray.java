package datastructures.hackerrank;

public class TwoDimensionalArray {

    private int[][] numbers = {{1, 2, 1000}, {3, 4}, {5, 6}};

    public void printNumbers() {
        for (int[] inner : numbers) {
            System.out.println("****************");
            for (int number : inner) {
                System.out.println(number);
            }
        }
    }
}
