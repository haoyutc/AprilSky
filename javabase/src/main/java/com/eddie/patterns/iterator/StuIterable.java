package com.example.demo.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StuIterable implements Iterable<Student> {
    private final List<Student> students = new ArrayList<>();

    public StuIterable() {
        students.add(new Student("zhangsan", 120));
        students.add(new Student("liziqi", 24));
        students.add(new Student("liergou", 32));
    }

    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public boolean removeStudent(Student student) {
        return students.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new Iter();
    }

    private class Iter implements Iterator<Student> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < students.size();
        }

        @Override
        public Student next() {
            Student student = students.get(index);
            index++;
            return student;
        }
    }
}
