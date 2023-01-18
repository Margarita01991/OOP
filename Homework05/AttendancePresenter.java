package Homework05;

import java.io.IOException;
import java.util.Scanner;

public class AttendancePresenter {
    private AttendanceService model;

    public AttendancePresenter(AttendanceService model) {
        this.model = model;
    }
    public void run() throws IOException {
        boolean flag = true;
        while (flag) {
            System.out.println(
                    "  1 - Распечатать студентов и посещаемость в процентах\n" +
                    "  2 - Распечатать студентов по убыванию посещаемости\n" +
                    "  3 - Распечатать студентов с посещаемостью ниже 25%\n" +
                    "Выберите номер и нажмите Enter: ");
            Scanner in = new Scanner(System.in);
            while (in.hasNextLine()) {
                int n = in.nextInt();
                switch (n) {
                    case 1:
                        AttendanceView view1 = new AttendanceView(model.getStudents());
                        view1.showAllStudents();
                        break;
                    case 2:
                        AttendanceView view2 = new AttendanceView(model.getStudents());
                        view2.showByDescendingOrder();
                        break;
                    case 3:
                        AttendanceView view3 = new AttendanceView(model.getBadStudents());
                        view3.showBadStudents();
                        break;
                }
            }
            in.close();
        }
    }
}
