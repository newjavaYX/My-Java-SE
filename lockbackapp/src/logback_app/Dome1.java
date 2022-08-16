package logback_app;
  import org.slf4j.*;
public class Dome1 {
    public static final Logger LOGGER = LoggerFactory.getLogger("Dome.class");
    public static void main(String[] args) {
            try {
                LOGGER.debug("main方法开始");
                LOGGER.info("除法开始了");
                int a=10;
                int b=0;
                LOGGER.trace("a="+a);
                LOGGER.trace("b="+b);
                System.out.println(a/b);
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("出错了"+e);
        }
    }
}
