package ObjectOutputStream_app;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDome02 {
    //使用对象字节输入流回复对象
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/OoutS.txt"));
        Student o = (Student) ois.readObject();
        System.out.println(o);
    }
}
