package io.marklove.aop.demo.controller;

import io.marklove.aop.demo.LogExecutionTime;
import io.marklove.aop.demo.model.Employee;
import io.marklove.aop.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ngupq
 */
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/add/employee", method = RequestMethod.GET)
    public Employee addEmployee(@RequestParam("name") String name, @RequestParam("empId") String empId) {

        return employeeService.createEmployee(name, empId);

    }

    @RequestMapping(value = "/remove/employee", method = RequestMethod.GET)
    public String removeEmployee( @RequestParam("empId") String empId) {

        employeeService.deleteEmployee(empId);

        return "Employee removed";
    }

    @RequestMapping(value = "/calculate/time", method = RequestMethod.GET)
    @LogExecutionTime
    public void calculate() throws InterruptedException {
        System.out.println("calculate......");
        Thread.sleep(2000);
    }
}
