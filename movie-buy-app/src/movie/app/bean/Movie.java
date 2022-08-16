package movie.app.bean;

import java.util.Date;

public class Movie {
    private String name;
    private String actor;
    private double score;
    private double time;
    private double price;
    private int number;
    private Date startTime;

    public Movie(String name, String actor,double time, double price, int number,Date date) {
        this.name = name;
        this.actor = actor;
        this.time = time;
        this.price = price;
        this.number = number;
        this.startTime=date;
    }
    public Movie(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "电影{" +
                "名称='" + name + '\'' +
                ", 主演='" + actor + '\'' +
                ", 评分=" + score +
                ", 时长=" + time +
                ", 票价=" + price +
                ", 剩余票数=" + number +
                ", 放映时间=" + startTime.toString() +
                '}';
    }
}
