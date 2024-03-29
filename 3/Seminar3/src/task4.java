/*1. Создайте класс исключения, который будет выбрасываться при делении на 0.
Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */

//2. Создайте класс исключений, которое будет возникать при обращении к пустому
// элементу в массиве ссылочного типа.
// Исключение должно отображать понятное для пользователя сообщение об ошибке.

//3. Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
// Исключение должно отображать понятное для пользователя сообщение об ошибке.
public class task4 {
    public static void main(String[] args) {
        try {
            try {
                float s = 5 / 0;
            } catch (ArithmeticException e) {
                throw new NullException("Деление на 0", e);
            }
        } catch (NullException e) {
            System.out.println(e.getInfo());
        }
    }
}
