package movie.app.bean;

public class Customer extends User{
    public Customer(String loginName, String userName, String passWord, char sex, String phone, double money) {
        super(loginName, userName, passWord, sex, phone, money);
    }

    public Customer() {
    }
}
