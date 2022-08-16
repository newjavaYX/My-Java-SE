package d15_proxy;

public class Test {
    public static void main(String[] args) {
        Star star = new Star("杨超越");
        Skill skill=StarAgentProxy.getSkill(star);
        skill.Sing();
        skill.Dance();
    }
}
