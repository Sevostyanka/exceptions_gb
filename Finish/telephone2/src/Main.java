import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//Оралова Екатерина Витальевна 09.09.1988 9818885607 ж
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в формате 'Фамилия Имя Отчество дата_рождения номер_телефона(без пробелов) пол (ж или м)':");
        String input = scanner.nextLine();

        String[] data = input.split(" ");
        if (data.length != 6) {
            System.out.println("Некорректное количество данных.");
            return;
        }

        String surname = data[0];
        String name = data[1];
        String patronymic = data[2];
        String birthDate = data[3];
        String phoneNumber = data[4];
        String gender = data[5];

        try {
            validateData(surname, name, patronymic, birthDate, phoneNumber, gender);
            saveUserData(surname, name, patronymic, birthDate, phoneNumber, gender);
            System.out.println("Данные успешно сохранены.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении данных.");
            e.printStackTrace();
        }
    }

    private static void validateData(String surname, String name, String patronymic,
                                     String birthDate, String phoneNumber, String gender) {
        if (!surname.matches("[a-zA-Zа-яА-ЯёЁ]+")) {
            throw new IllegalArgumentException("Некорректная фамилия.");
        }
        if (!name.matches("[a-zA-Zа-яА-ЯёЁ]+")) {
            throw new IllegalArgumentException("Некорректное имя.");
        }
        if (!patronymic.matches("[a-zA-Zа-яА-ЯёЁ]+")) {
            throw new IllegalArgumentException("Некорректное отчество.");
        }
        if (!birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new IllegalArgumentException("Некорректная дата рождения. Ожидается формат dd.mm.yyyy");
        }
        if (!phoneNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Некорректный номер телефона. Ожидается целое беззнаковое число.");
        }
        if (!gender.matches("[ЖжМм]")) {
            throw new IllegalArgumentException("Некорректный пол. Ожидается ж или м.");
        }
    }

    private static void saveUserData(String surname, String name, String patronymic,
                                     String birthDate, String phoneNumber, String gender) throws IOException {
        String fileName = surname + ".txt";
        FileWriter fileWriter = new FileWriter(fileName, true);
        fileWriter.write(surname + " " + name + " " + patronymic + " " + birthDate + " " + phoneNumber + " " + gender + "\n");
        fileWriter.close();
    }
}