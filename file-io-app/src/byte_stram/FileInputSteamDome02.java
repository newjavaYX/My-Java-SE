package byte_stram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputSteamDome02 {
    public static void main(String[] args) throws IOException {
        File f=new File("src/data.txt");
        System.out.println(f.length());
        InputStream is=new FileInputStream("src/data.txt");
//
//        byte[] b=new byte[(int) f.length()];
//        int read = is.read(b);
//        System.out.println(read);
//        System.out.println(new String(b));
        System.out.println(is.read());
    }
}
