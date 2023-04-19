import java.util.Arrays;

public class task3 {

    static void metod1(int a, int b) {
        System.out.println(a/b);
    }

    static int[] metod2(String b) {
        int [] arr = new int[] {Integer.parseInt(b)};
        return arr;
    }

    static void metod3(int[] e) {
        int size = 20;
        int[] lol = new int [size];
        for (int i = 0; i < size; i++) {
            lol[i] = e[i]*10;
        }
        System.out.println(Arrays.toString(lol));
    }
    public static void main(String[] args) {
        int a = 4;
        String b = "Love";
        double c = 5.5;
        int d = 0;
        int [] e = new int[] {1,2,3,4,5,6,7};



//      1) в методе получится, что делится на 0 (ArithmeticException: / by zero)
//        metod1(a, d);
//      2) Нельзя перевести буквы в числа (NumberFormatException: For input string: "Love")
//        System.out.println(Arrays.toString(metod2(b)));
//      3) В массиве не хватает индексов (ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7)
        metod3(e);
    }
}
