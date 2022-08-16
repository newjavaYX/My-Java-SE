package reflection_framework;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MyBatisUtil {

    public static void save(Object obj){
        try (PrintStream out = new PrintStream(new FileOutputStream("reflection-text/src/data.txt",true))){
            Class c=obj.getClass();
            Field[] fields = c.getDeclaredFields();
            out.print(c.getName() +"{");
            out.flush();
            for (Field field : fields) {
            field.setAccessible(true);
                String name = field.getName();
                Object o = field.get(obj);
                System.out.println(field.getType()+" "+name+" = "+o);
                out.print(name+"="+o.toString()+"|");
                out.flush();
        }
            out.print("}\n");
        } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

