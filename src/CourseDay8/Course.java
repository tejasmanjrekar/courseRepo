package CourseDay8;

import java.io.Serializable;
import java.util.Scanner;
public class Course implements Serializable {
    private int cId = 1001;

    private String title;
    private int duration;
    private String provider;
    private double cost;

    public Course() {
        this.cId++;
    }
    public Course(String title, int duration, String provider, double cost) {
        super();
        this.cId++;
        this.title = title;
        this.duration = duration;
        this.provider = provider;
        this.cost = cost;
    }
    public int getcId() {
        return cId;
    }
    public void setcId(int cId) {
        this.cId = cId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "CourseDay8.Course [cId=" + cId + ", title=" + title + ", duration=" + duration + ", provider=" + provider
                + ", cost=" + cost + "]";
    }


}
