package ObjectOutputStream_app;

import java.io.Serializable;

public class Student implements Serializable {
    //一旦这个变量发生改变，就必须重新序列化对象才能进行反序列化。
    private static final long seriaVersionUID=3;
    private String Name;
    private String liog;
    //使用transient修饰的变量不会再进行序列化
    private transient String password;


    public Student(String name, String liog, String password) {
        Name = name;
        this.liog = liog;
        this.password = password;
    }

    public Student(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLiog() {
        return liog;
    }

    public void setLiog(String liog) {
        this.liog = liog;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", liog='" + liog + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
