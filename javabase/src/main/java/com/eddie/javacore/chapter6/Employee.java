package com.eddie.javacore.chapter6;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-08-12 22:47:02
 * @version: V1.0
 **/
@Data
@AllArgsConstructor
public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public void raiseSalary(double byPercent) {
        double raise= salary*byPercent/100;
        salary += raise;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary,o.salary);
    }
}
