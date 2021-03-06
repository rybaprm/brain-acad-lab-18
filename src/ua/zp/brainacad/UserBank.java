package ua.zp.brainacad;

import static ua.zp.brainacad.MoneyTransactionUtil.sendTo;

public class UserBank {
    //2. Использование throw
//• Создать класс MoneyTransactionUtil
//• Создать приватный конструктор.
//• Создать статический метод для отправки денег с одного счета на другой:
//    sendTo(номерКарты, номерКарты, сумма).
//• В методе следует обработать несколько возможных исключительных ситуаций:
//• Если номер карты отправителя и карты получателя совпадают, нужно
//    выбросить RuntimeException. (throw new RuntimeException())
//• Если сумма является нулевой, отрицательной или больше 100_000,
//    нужно выбросить RuntimeException. (throw new RuntimeException())
//• Добавить ключевое слово throws и RuntimeException к объявлению метода.
//• Если исключительных ситуаций нет, вывести на экран: «Сумма s, со счета n
//    успешно переведена на счет m»
//• Создать класс UserBank методом main.
//• В методе main вызвать метод sendTo.
//• Обернуть вызов метода блоком try…catch
//• В блоке catch для RuntimeException вывести сообщение: «При обработке
//    транзакции банка произошла ошибка

//    3. Создание собственных исключений
//• Создать класс AccountException
//• Отнаследовать класс AccountException от RuntimeException
//• Создать класс MoneyValueExeption
//• Отнаследовать класс MoneyValueExeption от RuntimeException
//• В методе MoneyTransactionUtil.sendTo(…) сделать правки:
//            • Если номер карты отправителя и карты получателя совпадают, нужно
//    выбросить AccountException. (throw new AccountException ())
//            • Если сумма является нулевой, отрицательной или больше 100_000,
//    нужно выбросить MoneyValueExeption.
//• Заменить для throws класс RuntimeException на новые исключения
//• Проверить отсутствие ошибки в классе UserBank. Т к оба исключения имеют
//    общего предка RuntimeException, они будут обрабатываться без ошибок.
//• Заменить один catch блок с RuntimeException на два: AccountException и
//    MoneyValueExeption соответственно.
//            • При AccountException вывести на экран текст: «Ошибка с реквизитами банка.
//    Возможно, номер карты отправителя и получателя совпадают.»
//            • При MoneyValueExeption вывести на экран текст: «Ошибка с суммой отправки.
//    Сумма должна быть больше 0. Сумма не должна превышать лимит в 100 000».

    public static void main(String[] args) {
//        try {
//            sendTo(1234567890123456L, 234567890123456L, 100);
//            //sendTo(1234567890123456L, 1234567890123456L, 100);
//            //sendTo(1234567890123456L, 2234567890123456L, -100);
//            sendTo(1234567890123456L, 3234567890123456L, 100000.01);
//
//
//        } catch (RuntimeException e) {
//            System.err.println("При обработке транзакции банка произошла ошибка");
//        }
        try {
            sendTo(1234567890123456L, 234567890123456L, 100);
            //sendTo(1234567890123456L, 1234567890123456L, 100);
            //sendTo(1234567890123456L, 2234567890123456L, -100);
            sendTo(1234567890123456L, 3234567890123456L, 100000.01);


        } catch (AccountException e) {
            //System.err.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают.");
            System.err.println(e.getMessage());
        } catch (MoneyValueException e) {
            //System.err.println("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать " +
            //        "лимит в 100 000");
            System.err.println(e.getMessage());
        }
    }
}
