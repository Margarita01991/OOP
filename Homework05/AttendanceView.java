package Homework05;

import java.util.Comparator;
import java.util.List;

public class AttendanceView {
    private List<Student> students;

    public AttendanceView(List<Student> students) {
        this.students = students;
    }
    public void showBadStudents() {
        StringBuilder sb = new StringBuilder();
        sb.append("Распечатать студентов с посещаемостью ниже 25%:\n");
        for (Student student : students) {
            sb.append("  " + student + "\n");
        }
        System.out.println(sb);
    }
    public void showAllStudents() {
        StringBuilder sb = new StringBuilder();
        sb.append("Распечатать всех студентов и посещаемость каждого в процентах:\n");
        for (Student student : students) {
            sb.append("  [" + student.getName() + " " + student.getAttendanceByPercent() + "%]\n");
        }
        System.out.println(sb);

    }

    public void showByDescendingOrder() {
        Comparator comparator = new AttendanceComparator();
        students.sort(comparator);
        StringBuilder sb = new StringBuilder();
        sb.append("Распечатать студентов, отсортировав их по убыванию посещаемости:\n");
        for (Student student : students) {
            sb.append("  [" + student.getName() + " " + student.getAttendanceByPercent() + "%]\n");
        }
        System.out.println(sb);
    }
}
