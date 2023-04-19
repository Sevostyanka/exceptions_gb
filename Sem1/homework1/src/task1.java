import java.util.Arrays;

public class task1 {

    static int[] metod(int[]arr1, int[]arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Ошибка. Разные длины массивов.");
        } else {
            int[] arr = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr[i] = arr1[i] / arr2[i];
            }
            return arr;
        }

    }
    public static void main(String[] args) {
        int [] arr1 = new int[] {1,3,4,5,6,9,9,44};
        int [] arr2 = new int[] {2,3,6,8,3,2};

        int[] myArr = metod(arr1, arr2);
        System.out.println((Arrays.toString(myArr)));

    }
}