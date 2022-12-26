package Homework03;

import java.util.Iterator;

public class ReverseIterator implements Iterator<Student> {
    private int index;
    private StudentGroup group;

    public ReverseIterator(StudentGroup group) {
        this.group = group;
        index = group.getSize()-1;
    }
    @Override
    public boolean hasNext() {
        return index >= 0;
    }
    @Override
    public Student next() {
        System.out.println("Позиция " + (index+1));
        return group.get(index--);
    }
}