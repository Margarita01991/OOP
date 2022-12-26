package Homework03;

import java.util.Iterator;

public class StudentGroupListIterator implements Iterator<Student> {
    private  int index = 0;
    private StudentGroup groupList;
    public StudentGroupListIterator(StudentGroup groupList) {
        this.groupList = groupList;
    }
    @Override
    public boolean hasNext() {
        return index < groupList.getSize();
    }
    @Override
    public Student next() {
        System.out.println("Позиция " + (index+1));
        return groupList.get(index++);
    }
}