package Homework05;

import java.time.LocalDate;

public class Pair<U, V> {
    public final LocalDate date;
    public final Boolean attendance;

    public Pair(LocalDate date, Boolean attendance) {
        this.date = date;
        this.attendance = attendance;
    }
    @Override
    public String toString() {
        return "[" + date + ", " + attendance + "]";
    }
    public LocalDate getDate() {
        return date;
    }
    public Boolean getAttendance() {
        return attendance;
    }
}