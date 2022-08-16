package reflection_list_app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class Dome {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        System.out.println(list.getClass());
        System.out.println(list2.getClass());
        System.out.println(list.getClass()==list2.getClass());

        list.add("foo");
        list.add("bar");
        list2.add(1);
        list2.add(2);
        System.out.println("================================================");
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(1);
        list3.add(2);
        Class c=list3.getClass();
        Method method=c.getDeclaredMethod("add",Object.class);
        method.invoke(list3,"foo");
        System.out.println(list3);
    }
}
