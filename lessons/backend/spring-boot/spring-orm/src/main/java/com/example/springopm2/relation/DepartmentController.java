package com.example.springopm2.relation;

import com.example.springopm2.Supplier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    private DepartmentRepository departmentRepository;

    DepartmentController(DepartmentRepository departmentRepository){
        this.departmentRepository=departmentRepository;
    }
    @GetMapping("/add")
    public String  addDepartment() {
       Department department = new Department();
       department.setDepartmentName("İnsan Kaynakları");
       departmentRepository.save(department);
       return "Departman ismi: "+ department.getDepartmentName();
    }
}
