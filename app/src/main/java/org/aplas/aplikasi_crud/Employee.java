package org.aplas.aplikasi_crud;

public class Employee {
    int Id;
    String name, dept, joiningDate;
    double salary;

    public Employee(int id, String name, String dept, String joiningDate, double salary) {
        Id = id;
        this.name = name;
        this.dept = dept;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public double getSalary() {
        return salary;
    }
}
