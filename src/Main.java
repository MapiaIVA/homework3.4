import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день вашего рождения: ");
        int day = scanner.nextInt();
        System.out.print("Введите номер месяца вашего рождения: ");
        int month = scanner.nextInt();
        System.out.print("Введите год вашего рождения: ");
        int year = scanner.nextInt();

// Знак зодиака
        String[] zodiacSigns = {"Козерог", "Водолей", "Рыбы", "Овен", "Телец", "Близнецы", "Рак", "Лев", "Дева", "Весы", "Скорпион", "Стрелец"};
        int[] zodiacEndDates = {20, 19, 20, 20, 21, 21, 22, 23, 23, 23, 22, 21};
        int zodiacIndex = month - 1;
        if (day > zodiacEndDates[zodiacIndex]) {
            zodiacIndex = (zodiacIndex + 1) % 12;
        }
        String zodiac = zodiacSigns[zodiacIndex];

// Название года по китайскому календарю
        String[] chineseYears = {"Крысы", "Быка", "Тигра", "Кролика", "Дракона", "Змеи", "Лошади", "Овцы", "Обезьяны", "Петуха", "Собаки", "Свиньи"};
        int chineseYear = (year - 4) % 12;
        if (chineseYear < 0) {
            chineseYear += 12;
        }
        String chineseYearName = chineseYears[chineseYear];

// Вывод результатов
        System.out.println("Знак: " + zodiac);
        System.out.println("Год: " + chineseYearName);
    }
}