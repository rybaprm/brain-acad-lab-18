package ua.zp.brainacad;

public class StackOverFlowTest {
//    4. Проверить работу Java Error.
//            • Создать класс StackOverFlowTest
//• Создать статическое поле int count
//• Создать статический метод test(), в котором инкрементируется число count,
//    выводится его значение на экран и снова вызывается test(). (Рекурсия)
//            • Убедится в наличии ошибки при запуске программы.
//• Попробовать обернуть содержимое метода в блок try…catch.
    public static int COUNT;

    public static void test() {
        System.out.println(++COUNT);
        test();
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (StackOverflowError e) {
            System.err.println("Рекурсия вызвала переполнение стека вызовов.");
        }
    }
}
