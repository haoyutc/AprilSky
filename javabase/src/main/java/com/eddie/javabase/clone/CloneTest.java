package com.eddie.javabase.clone;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address();
        address.setAddr("杭州市");
        Student stu1 = new Student();
        stu1.setNumber(12345);
        stu1.setAddress(address);

        Student stu2 = (Student) stu1.clone();

        System.out.println("学生1：" + stu1.getNumber() + "--地址：" + stu1.getAddress());
        System.out.println("学生2：" + stu2.getNumber() + "--地址：" + stu2.getAddress());
        address.setAddr("西湖区");
        /*stu2.setNumber(54321);*/
        System.out.println("学生1：" + stu1.getNumber() + "--地址：" + stu1.getAddress());
        System.out.println("学生2：" + stu2.getNumber() + "--地址：" + stu2.getAddress());
        System.out.println(stu1 == stu2);
    }
}
