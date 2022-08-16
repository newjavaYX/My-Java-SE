package file_dome;

import java.io.File;
import java.io.IOException;

/**
 * 删除和创建文件夹：依照创建file时给定的路径
 * public boolean createNewFile()创建一个新的空的文件
 * public boolean mkdir()        只能创建一级文件夹，只能在已有的文件夹下创建一个空的文件夹
 * public boolean mkdirs()       可以创建多级文件夹，可以创建在已有文件夹中创建一个多层文件夹
 * public boolean delete()       删除由此抽象路径名表示的文件或空文件夹
 */
public class Dome2 {
    public static void main(String[] args) throws IOException {
        File f=new File("src/data2.txt");
//        f.createNewFile();
//        f.delete();
//        File file=new File("F:/LiefMap/appdome.txt");
//        file.mkdir();
//        file.delete();
//        File file1=new File("F:/LiefMap/appdome/aa/ss/dd");
//        file1.mkdirs();

    }
}
