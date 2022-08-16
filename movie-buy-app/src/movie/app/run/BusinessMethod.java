package movie.app.run;

import movie.app.bean.Business;
import movie.app.bean.Movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BusinessMethod {
    public static Scanner SC=new Scanner(System.in);
    public static boolean PutMovile(Business business,Map<Business, List<Movie>> allMovies){
        System.out.println("请输入电影名称");
        String name=SC.nextLine();

        System.out.println("请输入主演");
        String actor=SC.nextLine();


        double time= 0;
        while (true) {
            try {
                System.out.println("请输入电影时长");
                time = SC.nextDouble();
                SC.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("请输入正确数值");
                SC.nextLine();
            }
        }

        double price= 0;
        while (true) {
            try {
                System.out.println("请输入票价");
                price = SC.nextDouble();
                SC.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("请输入正确数值");
                SC.nextLine();
            }
        }

        int number= 0;
        while (true) {
            try {
                System.out.println("请输入电影票数量");
                number = SC.nextInt();
                SC.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("请输入正确数值");
                SC.nextLine();
            }
        }

        Date date= null;
        while (true) {
            try {
                System.out.println("请输入放映时间 ：yyyy年HH月dd日 HH:mm");
                String starTime=SC.nextLine();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy年HH月dd日 HH:mm");
                date = sdf.parse(starTime);
                break;
            } catch (ParseException e) {
                System.out.println("请输入正确时间格式");
            }
        }
        allMovies.get(business).add(new Movie(name,actor,time,price,number,date));
        return true;
    }
}
