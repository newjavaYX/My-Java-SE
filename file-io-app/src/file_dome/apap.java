package file_dome;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class apap {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sd.format(new Date(10)));
        System.out.println(date);
    }

}
