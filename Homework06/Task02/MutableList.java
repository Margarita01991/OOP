package Homework06.Task02;

import java.util.LinkedList;

// Методы:
// getSize ()
// get (int i)
// set (int i, T newValue)
// add (T newValue)
// remove (T value)

public class MutableList extends AbstractList<Integer> {

    public MutableList(LinkedList<Integer> colList) {
        super(colList);
    }

    @Override
    public void colList() {
        System.out.println(colList);
    }

    @Override
    public void get(int i) {
        System.out.println(colList.get(i));
    }

    @Override
    public void getSize() {
        System.out.println(colList.size());
    }

    public void add(int i) {
        colList.add(i);
    };

    public void remove(int i) {
        colList.remove(i);
    };

    public void set(int i, int j) {
        colList.set(i, j);
    };

}
