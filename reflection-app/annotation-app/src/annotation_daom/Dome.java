package annotation_daom;
@MyTest(name = "test",age =1)
public class Dome {
    @Test2
    private String name;
    @MyTest(name = "test",age =1)
    private static final int ID = 1;
    @Test2
    private static String Illustrate;
    @Test2
    public static void main(String[] args) {

    }
    @MyTest(name = "test",age =1)
    public String getName() {
        return name;
    }
    @Test2
    public void setName(String name) {
        this.name = name;
    }

    public static String getIllustrate() {
        return Illustrate;
    }

    public static void setIllustrate(String illustrate) {
        Illustrate = illustrate;
    }

}
