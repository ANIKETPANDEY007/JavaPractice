package Sorting;

public class MoveZeroes {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 0, 2,-40,100,0,5 };
        print(arr);
        int n = arr.length;

        for (int x = 0; x < n - 1; x++) {
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] == 0) {
                    int temp = 0;
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        print(arr) ;
    }
}