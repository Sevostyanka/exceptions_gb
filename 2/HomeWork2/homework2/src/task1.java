import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class task1 {
    public static void main(String[] args) {
        floatNumber();
    }
    static void floatNumber () {
        Boolean flag = true;
        while (flag) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите дробное число: ");
                Float number = sc.nextFloat();
                System.out.println("Ваше число: " + number);
                if (number instanceof Float) flag = false;

            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не формат float. Попробуйте еще раз.");
            }
        }
        }
    }
