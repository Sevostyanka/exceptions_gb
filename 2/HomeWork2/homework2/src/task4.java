import java.util.Scanner;

public class task4 {
    //Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные.");
        String userText = sc.nextLine();

        sc.close();
        if (userText == "") {
            throw new Exception("Нельзя оставлять строку пустой!");
        } else {
            System.out.println("Вы ввели: " + userText);
        }
    }
}
