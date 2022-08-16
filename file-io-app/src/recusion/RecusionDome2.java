package recusion;

import java.io.File;
import java.io.IOException;

public class RecusionDome2 {
    public static void main(String[] args) {
            searchFile(new File("F:/"),"类的封装.docx");
    }
    public static void searchFile(File file,String FileName)  {
            if(file.exists() && file.isDirectory()){
                File[] files = file.listFiles();
                if (files != null) {
                    for (File file1 : files) {
                        if (file1.isFile()) {
                            if (file1.getName().contains("类的封装")) {
                                System.out.println(file1.getAbsoluteFile());
                                Runtime runtime= Runtime.getRuntime();
                                try {
                                    runtime.exec(file1.getAbsolutePath());
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }else {
                            searchFile(file1,"类的封装.docx");
                        }
                    }
                }
            }
    }
}
