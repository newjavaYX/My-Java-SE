package ReaderFile;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDome01 {
    public static void main(String[] args) throws IOException {
        Reader rd=new FileReader("src/Readers01.txt");
//        int a;
//        while ((a=rd.read())!=-1){
//            System.out.print((char)a);
//        }
        char[] arr=new char[3];
        int leb;
        while ((leb=rd.read(arr))!=-1){
            System.out.print(new String(arr,0,leb));
        }
    }
}
