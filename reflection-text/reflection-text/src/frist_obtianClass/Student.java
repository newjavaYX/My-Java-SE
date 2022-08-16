package frist_obtianClass;

public class Student {
    private static int ID;
    private int id;
    private String name;
    private int age;

    public static void main(String[] args) {
        System.out.println("11111");
        Student student = new Student();
//        String argss[] = new String[8];
//        student.main(argss);

    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(){

    }
    public Student(int id) {
        this.id = id;
    }
    private Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
