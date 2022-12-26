package Homework03;

/*Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора. (Это повторяет 1-ю задачу из классной работы). 
Остальные задачи надстраиваются поверх неё.

Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях. Он реализует интерфейс ListIterator<Student>.
Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.

Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
• Он отслеживает текущую позицию в переборе
• Он изначально выставлен на конечную позицию
• Он движется справа налево
Проверьте, как он работает. */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("Ivan Ivanov", 4.9, LocalDate.of(2005,9,1)));
        listStudent.add(new Student("Maria Kuznecova", 4.3, LocalDate.of(2006,1,17)));
        listStudent.add(new Student("Stepan Kuzmin", 4.3, LocalDate.of(2005,10,12)));
        listStudent.add(new Student("Svetlana Andreeva", 4.4, LocalDate.of(2005,11,16)));
        listStudent.add(new Student("Elena Shevchenko", 4.7, LocalDate.of(2006,3,30)));
        listStudent.add(new Student("Sergey Semenov", 4.2, LocalDate.of(2005,10,4)));
        StudentGroup listGroup = new StudentGroup(listStudent);
        for (Student student: listGroup) {
            System.out.println(student);
        }
        System.out.println();
        Iterator<Student> it = listGroup.descending();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}