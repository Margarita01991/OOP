package Homework06.Task02;

import java.util.LinkedList;

public abstract class AbstractList<T> {

    public LinkedList<T> colList;

    public abstract void getSize();

    public abstract void get(int i);

    public void colList() {
    }
    public AbstractList(LinkedList<T> colList) {
        this.colList = colList;
    }
}
