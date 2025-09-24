package Users;

public class User {

    private final int account_number;
    private String name;
    private double money;

    public User(int account_number, String name) {
        this.account_number = account_number;
        this.name = name;
    }

    public User(int account_number, String name, double money) {
        this.account_number = account_number;
        this.name = name;
        add_money(money);
    }

    public int getAccount_number() {
        return account_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "account_number=" + account_number +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public void add_money(double add){
        money += add;
    }

    public void debit_money(double debit){
        money -= (debit + 5.0);
    }
}
