package ua.zp.brainacad;

public class MoneyValueException extends RuntimeException {
    public MoneyValueException() {
        super("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать лимит в 100 000");
    }
}
