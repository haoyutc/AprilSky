package com.eddie.javacore.chapter6;

import java.util.Arrays;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-08-12 22:42:23
 * @version: V1.0
 **/
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0]=new Employee("Harry Hacker",3500);
        staff[1] = new                Employee("Carl Cracker", 4500);
        staff[2] = new Employee("Tony Tester", 5000);

        Arrays.sort(staff);

        staff[2].raiseSalary(20);
        for (Employee employee : staff) {
            System.out.println("name="+employee.getName()+",salary="+employee.getSalary());
        }

        if (staff[0] instanceof Comparable) {
            System.out.println(staff[0].compareTo(staff[1]));
        }
    }

}
