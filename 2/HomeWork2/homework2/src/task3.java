import java.io.FileNotFoundException;

public class task3 {
    // Если необходимо, исправьте данный код
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 0;
            System.out.println(a / b);

            printSum(23, 234);

            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println(ex + ": На ноль делить нельзя!");
        } catch (NullPointerException ex) {
            System.out.println(ex + ": Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex + ": Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println(ex + ": Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}

