package com.example.springopm2.relation;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long employeeId;
    private  String employeeName;
    private double monthlySalary;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;
}
