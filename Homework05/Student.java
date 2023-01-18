package Homework05;

import java.time.LocalDate;
import java.util.List;

public class Student {
    private String name;
    private List<Pair<LocalDate, Boolean>> attendance;

    public Student(String name, List<Pair<LocalDate, Boolean>> attendance) {
        this.name = name;
        this.attendance = attendance;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name + "\n");
        for (Pair<LocalDate, Boolean> pair : attendance) {
            sb.append("  " + pair + "\n");
        }
        return sb.toString();
    }
    // получаем процент посещения студента
    public int getAttendanceByPercent() {
        int count = 0;
        for (Pair<LocalDate, Boolean> pair : attendance) {
            if (pair.getAttendance().equals(true))
                count++;
        }
        return (int) (100 / attendance.size() * count);
    }
    public String getName() {
        return name;
    } 
}
