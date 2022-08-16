import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fafa {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        System.out.println(list.indexOf("3"));
    }
}
