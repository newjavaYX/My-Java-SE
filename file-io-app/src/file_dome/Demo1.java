package file_dome;

import java.io.File;
import java.text.SimpleDateFormat;

public class Demo1 {
    public static void main(String[] args) {
//        常用的File创建对象方式
//        File f=new File("F:\\Fileapp\\File1.txt");
//        File f=new File("F:/Fileapp/File1.txt");
        //File.separator  去操作系统的分割符
//        File f=new File("F:"+File.separator+"Fileapp"+File.separator+"File1.txt");
////         获取文件大小
//        long size=f.length();
//        System.out.println(size);
////        获取文件的绝对路径
//        System.out.println(f.getAbsoluteFile());
////         获取文件名
//        System.out.println(f.getName());
////        获取文件最后修改时间
//        long time =f.lastModified();
//        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));
//
////       判断是否为文件还是文件夹
//        System.out.println(f.isFile());true
//        System.out.println(f.isDirectory());false
        //        2.相对路径
//        File file=new File("D:/IDEA/wordSapce/file-io-app/src/data.txt");
        File f=new File("src/data.txt");
//         获取文件大小
        long size=f.length();
        System.out.println(size);
//        获取文件的绝对路径
        System.out.println(f.getAbsoluteFile());
//         获取文件名
        System.out.println(f.getName());
//        获取文件最后修改时间
        long time =f.lastModified();
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));

//       判断是否为文件还是文件夹
        System.out.println(f.isFile());
        System.out.println(f.isDirectory()+"=====================\n");

        File file=new File("F:"+File.separator+"Fileapp");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isAbsolute());
    }
}
