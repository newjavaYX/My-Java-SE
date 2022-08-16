package errorapp;

import javax.swing.text.AbstractDocument;
import java.util.Scanner;

public class error_app {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            try {
                int i = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("请输入正确数值");
                sc.nextLine();
            }
        }
    }
}
