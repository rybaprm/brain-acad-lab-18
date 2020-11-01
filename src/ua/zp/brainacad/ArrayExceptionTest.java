package ua.zp.brainacad;

public class ArrayExceptionTest {
    //1. Обработать непроверяемое исключение ArrayIndexOutOfBoundsException.
//• Создать класс ArrayExceptionTest
//• Создать main метод
//• Создать и проинициализировать произвольный массив из 5-6 элементов.
//• Создать статический метод printArray(array, start, end), который выводит на
//экран элементы массива от индекса start до индекса end.
//• Добавить обработку исключения ArrayIndexOutOfBoundsException, для
//операции получения элемента массива по индексу. При возникновении ошибки
//выводить на экран сообщение вид: «Ошибка. Попытка обращения к
//несуществующему индексу: текущий индекс = i; размер массива = s;»
//• Вызвать несколько раз (с разными значениями) метод printArray в методе main
//для созданного ранее массива.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        printArray(arr, 0, 5);
        printArray(arr, 1, 4);
        printArray(arr, 2, 3);
        printArray(arr, 0, 7);

    }

    public static void printArray(int[] array, int start, int end) {
        for (int i = start; i <= end; i++) {
            try {
                System.out.println(array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.printf("Ошибка. Попытка обращения к несуществующему индексу: текущий индекс = %s; " +
                        "размер массива = %s%n", i, array.length);
            }
        }
    }
}
