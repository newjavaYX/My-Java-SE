package force_app;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Arrays;

public class Dome {
    private static Robot robot;
    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    private static String FinalPassWord;
    private static int Red;
    private static int Green;
    private static int Blue;
    public static void main(String[] args) {
        robot.delay(3000);
        Color pixelColor = robot.getPixelColor(1760, 520);
        Red=pixelColor.getRed(); Green=pixelColor.getGreen(); Blue=pixelColor.getBlue();
        Dome dome=new Dome();
        System.out.println(dome.force());
    }
    public String force() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <=9 ; j++) {
                for (int k = 0; k <=9 ; k++) {
                    for (int l = 0; l <=9 ; l++) {
                        String word =i+","+j+","+k+","+l;
                        System.out.println(word);
                        String[] password=word.split(",");
                        output(password);
                        robot.mouseMove(1760,650);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robot.delay(200);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        robot.delay(500);
                        Color color1 = robot.getPixelColor(1760,520);
                        if (color1.getRed()!=Red && color1.getBlue()!=Blue && color1.getGreen() !=Green) {
                            return word;
                        }else if("9,9,9,9".equals(word)){
                            return "无密码";
                        }
                        robot.delay(300);
                        robot.keyPress(KeyEvent.VK_BACK_SPACE);
                        robot.delay(800);
                        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
                    }
                }
            }
        }
        return null;
    }
    public void output(String[] password){
        for (String s : password) {
            switch (s){
                case "0":
                    robot.keyPress(KeyEvent.VK_0);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_0);
                    break;
                case "1":
                    robot.keyPress(KeyEvent.VK_1);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_1);
                    break;
                case "2":
                    robot.keyPress(KeyEvent.VK_2);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_2);
                    break;
                case "3":
                    robot.keyPress(KeyEvent.VK_3);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_3);
                    break;
                case "4":
                    robot.keyPress(KeyEvent.VK_4);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_4);
                    break;
                case "5":
                    robot.keyPress(KeyEvent.VK_5);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_5);
                    break;
                case "6":
                    robot.keyPress(KeyEvent.VK_6);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_6);
                    break;
                case "7":
                    robot.keyPress(KeyEvent.VK_7);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_7);
                    break;
                case "8":
                    robot.keyPress(KeyEvent.VK_8);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_8);
                    break;
                case "9":
                    robot.keyPress(KeyEvent.VK_9);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_9);
                    break;
                default:
                    break;
            }
        }
    }
}
