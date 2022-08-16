package d15_proxy_time_app;

public class LoginClass implements LoginPublic{
    @Override
    public void login(String username, String password) {
        try {
            Thread.sleep(1300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(username.equals("login")&&password.equals("123456")){
            System.out.println("登入成功");
        }else{
            System.out.println("登入失败");
        }
    }

    @Override
    public void Delete(String username) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(username.equals("123456")){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }
}
