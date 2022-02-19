package io.marklove.aop.demo.service;

import io.marklove.aop.demo.model.Employee;
import org.springframework.stereotype.Service;

/**
 * @author ngupq
 */
@Service
public class EmployeeService {

    public Employee createEmployee(String name, String empId) {

        Employee emp = new Employee();
        emp.setName(name);
        emp.setEmpId(empId);
        System.out.println("createEmployee.........");
        return emp;
    }

    public void deleteEmployee(String empId) {
        System.out.println("deleteEmployee.........");
    }
}
