package byte_stram;

import java.io.*;

public class OutPutSteamDome02 {
   private static InputStream is=null;
   private static   OutputStream OS=null;
    public static void main(String[] args) {
        try {
            InputStream is=new FileInputStream("F:\\许巍MV\\【4K60FPS】许巍《那一年》Live 2015此时此刻演唱会\\【4K60FPS】许巍《那一年》Live 2015此时此刻演唱会_高清 1080P.mp4");

            OutputStream OS=new FileOutputStream("F:\\电影\\new许巍.mp4");

            byte[] buffer=new byte[1024];
            int len;
            while ((len= is.read(buffer))!=-1){
                OS.write(buffer,0,len);
            }
            System.out.println("拷贝完成");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if (OS!=null&&is!=null){
                OS.close();
                is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
