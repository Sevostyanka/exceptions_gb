import java.io.*;
import java.util.Arrays;
public class task2 {
    static void metod(int[]arr1, int[]arr2) {
        try {
            int[]arr = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr[i] = arr1[i] - arr2[i];
            }
            System.out.println(Arrays.toString(arr));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка!");;
        }
    }



//        if (arr1.length != arr2.length) {
//            System.out.println("Ошибка. Разные длины массивов.");
//            return
//        } else {
//
//            for (int i = 0; i < arr1.length; i++) {
//                arr[i] = arr1[i] - arr2[i];
//            }
//            return arr;
//        }
//
//    }

    public static void main(String[] args) {

        int [] arr1 = new int[] {1,3,4,5,6,9,10,88};
        int [] arr2 = new int[] {2,3,6,8,3,2};

        metod(arr1, arr2);

    }
}

