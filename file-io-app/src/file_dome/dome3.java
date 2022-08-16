package file_dome;

import java.io.File;

/**
 * File类的遍历功能：依照创建file时给定的路径
 * public String[ ] list();       放回当前目录下的所有以及文件的名称到String[ ] 数组
 * public File[ ] listFiles();   返回当前目录下所有文件的file对象数组
 */
public class dome3 {
    public static void main(String[] args) {

        File f=new File("F:\\Fileapp");
        String[] list = f.list();
        for (String s : list) {
            System.out.println(s);
        }
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
