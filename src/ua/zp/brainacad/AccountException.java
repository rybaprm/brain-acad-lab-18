package ua.zp.brainacad;

public class AccountException extends RuntimeException {
    public AccountException() {
        super("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают.");
    }
}
