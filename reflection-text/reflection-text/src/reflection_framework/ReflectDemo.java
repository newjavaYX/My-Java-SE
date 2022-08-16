package reflection_framework;

public class ReflectDemo {
    public static void main(String[] args) {
        Student student = new Student(1,"张三",20,'男',170.0);
        Teacher teacher = new Teacher("朱七七",32,5345.00);
        MyBatisUtil.save(student);
        MyBatisUtil.save(teacher);
    }
}
