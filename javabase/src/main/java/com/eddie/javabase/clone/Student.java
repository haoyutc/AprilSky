package com.eddie.javabase.clone;

public class Student implements Cloneable {
    private int number;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = null;
        try {
            //浅拷贝
            student = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //深拷贝
        student.address = (Address) address.clone();
        return student;
    }
}
