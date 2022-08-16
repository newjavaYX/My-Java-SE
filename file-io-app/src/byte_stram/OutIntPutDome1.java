package byte_stram;

import java.io.*;

public class OutIntPutDome1 {
    public static void main(String[] args) {
        try (
                InputStream is=new FileInputStream("F:\\许巍MV\\【4K60FPS】许巍《那一年》Live 2015此时此刻演唱会\\【4K60FPS】许巍《那一年》Live 2015此时此刻演唱会_高清 1080P.mp4");

                OutputStream OS=new FileOutputStream("F:\\电影\\new许巍.mp4");

                MysqlMode m=new MysqlMode()
                ){

        }catch (Exception e){
                e.printStackTrace();
        }finally {
            System.out.println("===========finallu===========");
        }
    }
}
class MysqlMode implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("资源释放了");
    }
}