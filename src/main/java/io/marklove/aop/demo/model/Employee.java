package io.marklove.aop.demo.model;

/**
 * @author ngupq
 */
public class Employee {
    private String empId;
    private String name;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
}