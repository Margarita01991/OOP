package Homework05;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<Student>();
        // #region
        List<Pair<LocalDate, Boolean>> pairs1 = new ArrayList<Pair<LocalDate, Boolean>>();
        
        pairs1.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 10), true));
        pairs1.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 11), true));
        pairs1.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 12), false));
        pairs1.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 13), true));
        pairs1.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 9), false));
        students.add(new Student("Александр", pairs1));

        List<Pair<LocalDate, Boolean>> pairs2 = new ArrayList<Pair<LocalDate, Boolean>>();
        pairs2.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 9), false));
        pairs2.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 10), false));
        pairs2.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 11), true));
        pairs2.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 12), false));
        pairs2.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 13), true));  
        students.add(new Student("Екатерина", pairs2));

        List<Pair<LocalDate, Boolean>> pairs3 = new ArrayList<Pair<LocalDate, Boolean>>();
        pairs3.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 9), false));
        pairs3.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 10), true));
        pairs3.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 11), false));
        pairs3.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 12), false));
        pairs3.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 13), false));
        students.add(new Student("Анна", pairs3));

        List<Pair<LocalDate, Boolean>> pairs4 = new ArrayList<Pair<LocalDate, Boolean>>();
        pairs4.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 9), true));
        pairs4.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 10), true));
        pairs4.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 11), true));
        pairs4.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 12), true));
        pairs4.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 13), true));
        students.add(new Student("Елизавета", pairs4));

        List<Pair<LocalDate, Boolean>> pairs5 = new ArrayList<Pair<LocalDate, Boolean>>();
        pairs5.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 9), false));
        pairs5.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 10), false));
        pairs5.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 11), false));
        pairs5.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 12), false));
        pairs5.add(new Pair<LocalDate, Boolean>(LocalDate.of(2023, 01, 13), false));
        students.add(new Student("Андрей", pairs5));

        AttendanceService service = new AttendanceService(students);

        AttendancePresenter presenter = new AttendancePresenter(service);
        presenter.run();
    }
}