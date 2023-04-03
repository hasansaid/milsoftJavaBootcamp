package com.example.springopm2.relation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private EmployeeRepository employeeRepository;
    private DepartmentRepository departmentRepository;
    EmployeeController(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository){
        this.employeeRepository=employeeRepository;
        this.departmentRepository=departmentRepository;
    }

    @GetMapping("/add/{id}")
    public String addEmployee(@PathVariable("id") long departmentId){

        Employee employee = new Employee();
        employee.setEmployeeName("Salih SERT");
        employee.setMonthlySalary(30000);

        Optional<Department> optional = departmentRepository.findById(departmentId);
        if(optional.isPresent()){
            Department department = optional.get();
            employee.setDepartment(department);
            employeeRepository.save(employee);
            return "Çalışan ismi : " + employee.getEmployeeName() + " Çalıştığı Departman : " + department.getDepartmentName();
        }

        return "Eklenemedi";
    }
}
