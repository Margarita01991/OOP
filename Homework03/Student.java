package Homework03;

import java.time.LocalDate;

public class Student {
    private String name;
    private double averageMark;
    private LocalDate birth;
    
    public Student(String name, double averageMark, LocalDate birth) {
        this.name = name;
        this.averageMark = averageMark;
        this.birth = birth;
    }
    @Override
    public String toString() {
        return  "name: " + name + 
                ", averageMark " + averageMark +
                ", date of birth " + birth;
                }
}