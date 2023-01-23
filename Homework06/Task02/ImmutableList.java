package Homework06.Task02;

import java.util.LinkedList;

public class ImmutableList extends AbstractList<Integer> {

    public ImmutableList(LinkedList<Integer> colList) {
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

}