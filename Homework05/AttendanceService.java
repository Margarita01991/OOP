package Homework05;

import java.util.ArrayList;
import java.util.List;

public class AttendanceService {
    private List<Student> students;
    public AttendanceService(List<Student> students) {
        this.students = students;
    }
    public List<Student> getBadStudents() {
        List<Student> result = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getAttendanceByPercent() < 25) {
                result.add(student);
            }
        }
        return result;
    }
    public List<Student> getStudents() {
        return students;
    }
}
