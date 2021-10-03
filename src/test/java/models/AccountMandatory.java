package models;

//todo следует отдельным классом создавать модель для проверки заполнения только обязательного поля или других комбинаций,
// например в моем случае есть кейс, при отметке чекбокса часть полей заполняется
public class AccountMandatory {

    String accountName;

    public AccountMandatory(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
