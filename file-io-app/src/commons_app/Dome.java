package commons_app;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dome {
    public static void main(String[] args) throws IOException {
        IOUtils.copy(new FileInputStream("F:\\Fileapp\\祝佳辉.jpg"), new FileOutputStream("F:\\Fileapp\\祝佳辉01.jpg"));
    }
}
