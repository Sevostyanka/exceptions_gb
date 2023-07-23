import java.io.IOException;

/*Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа можно
было работать в блоке try-with-resources. Подумайте, что должно происходить при
закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class task3 {
    public static void main(String[] args) {

        counterNew counter = new counterNew();

        try {
            System.out.println("Метод открыт");
            counter.add();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        counter.closeCounter();
        try {
            System.out.println("Метод закрыт");
            counter.add();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
