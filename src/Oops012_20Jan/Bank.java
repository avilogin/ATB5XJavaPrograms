package src.Oops012_20Jan;

public class Bank {
    private String currency;
    private Integer amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }


    //using the Custom Exception
    public Integer add(Bank banKName) throws CustomException {
        if (!(banKName.currency.equalsIgnoreCase("INR"))) {
            throw new CustomException("USD to INR not supported!");
        }
        Integer sum = this.amount + banKName.amount;
        return sum;
    }


}
