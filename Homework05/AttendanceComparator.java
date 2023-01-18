package Homework05;

import java.util.Comparator;

public class AttendanceComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAttendanceByPercent() - o1.getAttendanceByPercent();
    }
}