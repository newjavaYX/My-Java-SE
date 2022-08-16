package ReaderFile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 */
public class FileWriteDome01 {
    public static void main(String[] args) throws IOException {
        //加true为追加数据
        Writer wt=new FileWriter("src/writer01.txt",true);
        wt.write(98);
        wt.write("\r\n");
        wt.write("你好中国");
        wt.write("\r\n");
        wt.append('奥');
        wt.write("\r\n");
        char[] car={'c','你','好','吗','b'};
        wt.write(car);
        wt.write("\r\n");
        String ac="我爱你亲爱的姑娘";

        wt.write(ac,0,4);
        wt.write("\r\n");
        char[] car1={'c','你','好','吗','b'};
        wt.write(car1,1,3);
        wt.flush();
        wt.close();
    }


}
