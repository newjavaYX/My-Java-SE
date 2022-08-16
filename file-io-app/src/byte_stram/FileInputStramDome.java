package byte_stram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//使用文件字节输入流读取一个字节
public class FileInputStramDome {
    public static void main(String[] args) throws IOException {
        File file=new File("../file-io-app/src/data.txt");
        System.out.println(file.length());
        FileInputStream fis=new FileInputStream("../file-io-app/src/data.txt");
        byte[] b=new byte[3];
        int len;
        while ((len=fis.read(b))!=-1) {
            System.out.print(new String(b,0,len));
        }
    }
}
