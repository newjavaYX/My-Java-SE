package movie.app.run;

import movie.app.bean.Business;
import movie.app.bean.Customer;
import movie.app.bean.Movie;
import movie.app.bean.User;

import java.text.ParseException;
import java.util.*;

public class MovieSystem {

//    定义系统的数据存储容器
    public static final List<User> ALL_USERS = new ArrayList<>();

//    定义商家存储容器
    public static final Map<Business,List<Movie>> ALL_MOVIES = new HashMap<>();

    public static Scanner SYM_SC=new Scanner(System.in);

    static{
        Customer customer1=new Customer("s123456","张s","123456",'男',"18312569875",500);
        Customer customer2=new Customer("b123456","张b","123456",'男',"18418569426",500);

        Business business1=new Business("sj123456","出猪婆","123456",'女',"15379852389",20000,"岭光电影","福州街道幸福家园01号");
        List<Movie> business1Movie = new ArrayList<>();

        Business business2=new Business("js123456","零零七","123456",'男',"19349551334",20000,"岭光电影","福州街道幸福家园01号");
        List<Movie> business2Movie = new ArrayList<>();

        Collections.addAll(ALL_USERS,customer1,customer2,business1,business2);

        ALL_MOVIES.put(business1,business1Movie);
        ALL_MOVIES.put(business2,business2Movie);
    }

    public static void main(String[] args) {
        showMain();
        System.out.println("谢谢惠顾");
    }

    private static void showMain() {
        while (true) {
            System.out.println("=============电影院首页===========");
            System.out.println("1.登录");
            System.out.println("2.注册用户");
            System.out.println("3.注册商家");
            System.out.println("4.退出");
            System.out.println("请输入操作");
            String command = SYM_SC.nextLine();
            switch(command){
                case "1":
                    String login = login();
                    if (login==null){
                        System.out.println("用户名或密码错误");
                    }
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    return;
                default:
                    System.out.println("请输入正确操作");
            }
        }
    }

    private static String login() {
        System.out.println("请输入用户名");
        String logiName=SYM_SC.nextLine();
        System.out.println("请输入密码");
        String password = SYM_SC.nextLine();

        for (User user : ALL_USERS) {
            if (user.getLoginName().equals(logiName)){
                if (user.getPassWord().equals(password)){
                    if(user instanceof Business) {
                        UserBusinessMain(user);
                        return "ok";
                    }else{
                        UserCustomerMain(user);
                        return "ok";
                    }
                }
            }
        }
        return null;
    }

    private static void UserCustomerMain(User user) {
        while (true) {
        System.out.println("===============用户展示界面==============");
        System.out.println(user.getUserName()+(user.getSex()=='男'?"先生":"女士")+"你好");
        System.out.println("1.评分\n"+"2.购票\n"+"3.退票\n"+"4.展示所有电影\n"+"5.退出");

            String commer=SYM_SC.nextLine();
            switch(commer){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    showAllMovie();
                    break;
                case"5":
                    return;
                default:
                    System.out.println("请输入正确操作");
            }
        }
    }

    private static void UserBusinessMain(User user) {
        while (true) {
        System.out.println("===============商家展示界面==============");
        System.out.println(user.getUserName()+(user.getSex()=='男'?"先生":"女士"+"你好"));

            System.out.println("1.上架电影\n"+"2.下架电影\n"+"3.修改电影\n"+"4.展示你以上架的电影\n"+"5.退出");
            String commmer=SYM_SC.nextLine();
            switch (commmer){
                case"1":
                    BusinessMethod.PutMovile((Business) user,ALL_MOVIES);
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    showMovie((Business) user);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("请输入正确操作...");
            }
        }
    }

    private static void showMovie(Business business) {
        List<Movie> list=ALL_MOVIES.get(business);
        list.forEach(System.out::println);
    }
    private static void showAllMovie() {
        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business business : businesses) {
            System.out.println(ALL_MOVIES.get(business));
        }
    }
}
