package byte_stram;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutPutSteamDome01 {
    public static void main(String[] args) throws IOException {
        OutputStream os=new FileOutputStream("src/out01.txt");
        os.write('n');
        os.write(98);
        byte[] b={98,'c',99};
        os.write(b);
        os.close();
    }
}
