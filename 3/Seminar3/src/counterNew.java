import java.io.IOException;

/*Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа можно
было работать в блоке try-with-resources. Подумайте, что должно происходить при
закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class counterNew {
    private Integer i;
    public counterNew() {
        this.i = 0;
    }
    public void add() throws IOException {
        if (i!=null) {
            this.i++;
        } else {
            throw new IOException("Наша ошибка.");
        }
    }
    public void closeCounter() {
        this.i = null;
    }

}
