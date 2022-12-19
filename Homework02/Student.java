package Homework02;

public class Student {
    private String name;
    private float avgMark;

    public Student(String name, String surname, float avgMark) {
        this.name = name;
        this.avgMark = avgMark;
    }
    public String getName() {
        return name;
    }
    public float getAvgMark() {
        return avgMark;
    }
}
