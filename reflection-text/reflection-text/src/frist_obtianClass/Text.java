package frist_obtianClass;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Text {
    @Test
    public void ObtianClassTest() throws NoSuchMethodException {
        Class student = Student.class;
        Constructor constructor[] =student.getConstructors();
        for(Constructor c:constructor){
            System.out.println(c.toString());
        }
    }

    @Test
    public void ObtianClassTest2() throws NoSuchMethodException {
        Class student = Student.class;
        Constructor constructor[] =student.getDeclaredConstructors();
        for(Constructor c:constructor){
            System.out.println(c.toString());
        }
    }

    @Test
    public void ObtianClassTest3() throws NoSuchMethodException {
        Class student = Student.class;
        Constructor constructor =student.getDeclaredConstructor();
        System.out.println(constructor.getName() + "==>" + constructor.getParameterCount());
    }

    @Test
    public void ObtianClassTest4() throws NoSuchMethodException {
        Class student = Student.class;
        Constructor constructor =student.getDeclaredConstructor(int.class);
        System.out.println(constructor.getName() + "==>" + constructor.getParameterCount());
    }
    @Test
    public void ObtianClassTest5() throws NoSuchMethodException {
        Class student = Student.class;
        Constructor constructor =student.getDeclaredConstructor(int.class,String.class);
        System.out.println(constructor.getName() + "==>" + constructor.getParameterCount());
    }

    @Test
    public void ObtianClassTest6() throws NoSuchMethodException {
        Class student = Student.class;
        Constructor constructor =student.getConstructor(int.class,String.class);
        System.out.println(constructor.getName() + "==>" + constructor.getParameterCount());
    }
    @Test
    public void ObtianClassTest7() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class student = Student.class;
        Constructor constructor =student.getDeclaredConstructor(int.class,String.class);
        System.out.println(constructor.getName() + "==>" + constructor.getParameterCount());
        constructor.setAccessible(true);
        Student o = (Student)constructor.newInstance(15, "张道陵");
        System.out.println(o);
    }
    @Test
    public void ObtianClassFieldsTest8() throws NoSuchMethodException {
        Class student = Student.class;
        Field fields[] = student.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "==>" + field.getType());
        }   
    }

    @Test
    public void ObtianClassFieldTest9() throws Exception {
        Class student = Student.class;
        Field field= student.getDeclaredField("ID");
        System.out.println(field.getName() + "==>" + field.getType());

    }
    @Test
    public void ObtianClassFieldTest10() throws Exception {
        Class student = Student.class;
        Field field= student.getDeclaredField("ID");
        System.out.println(field.getName() + "==>" + field.getType());
        Student o = (Student)student.getDeclaredConstructor(int.class).newInstance(20);
        field.setAccessible(true);
        field.set(o,5);
        System.out.println(field.get(o));
    }

    @Test
    public void ObtianClassFieldTest11() throws Exception {
        Method[] methods =Student.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "==>" + method.getReturnType()+"==>"+method.getParameterCount());
        }
    }
    @Test
    public void ObtianClassFieldTest12() throws Exception {
        Method method =Student.class.getDeclaredMethod("setAge", int.class);
        System.out.println(method.getName() + "==>" + method.getReturnType()+"==>"+method.getParameterCount());
        method.setAccessible(true);
        Student student = Student.class.getDeclaredConstructor(int.class,String.class,int.class).newInstance(1,"朱明",20);
        method.invoke(student,18);
        Method method1 =Student.class.getDeclaredMethod("toString");
        Object invoke = method1.invoke(student);
        System.out.println(invoke);
    }
    @Test
    public void ObtianClassFieldTest13() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
//        list.add("1");
    }
}
