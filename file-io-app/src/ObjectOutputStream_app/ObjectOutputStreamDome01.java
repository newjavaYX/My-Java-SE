package ObjectOutputStream_app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDome01 {
    public static void main(String[] args) throws IOException {
//对象序列化：使用对象字节输出流将对象输出到文件中去
        Student student01=new Student("城乡","s123456","123456");

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/OoutS.txt"));

        oos.writeObject(student01);

        oos.close();
    }
}
