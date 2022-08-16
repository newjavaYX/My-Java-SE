package d15_proxy_time_app;

public class Test {
    public static void main(String[] args) {
        LoginPublic LP= CalculationTime.Getproxy(new LoginClass());
        LP.login("login","123456");
        LP.Delete("123456");
    }
}
