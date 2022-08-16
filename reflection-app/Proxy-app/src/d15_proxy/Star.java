package d15_proxy;

public class Star implements Skill {
    private String name;

    public Star(){

    }

    public Star(String name) {
        this.name = name;
    }
    @Override
    public void Sing() {
        System.out.println(name+"开始唱歌了");
    }

    @Override
    public void Dance() {
        System.out.println(name+"开始跳舞了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
