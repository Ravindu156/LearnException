package lk.ac.vau.model;

import java.sql.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long EmpId;
    private String EmpName;
    private String Job;
    private double Salary;
    private Date DOB;

    @ManyToOne
    @JoinColumn(name="DEpId",nullable=false)
    private Department department;

    public Employee(){}

    public Employee(Long empId, String empName, String job, double salary, Date dOB, Department department) {
        EmpId = empId;
        EmpName = empName;
        Job = job;
        Salary = salary;
        DOB = dOB;
        this.department = department;
    }

    public Long getEmpId() {
        return EmpId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public String getJob() {
        return Job;
    }

    public double getSalary() {
        return Salary;
    }

    public Date getDOB() {
        return DOB;
    }

    public Department getDepartment() {
        return department;
    }

    public void setEmpId(Long empId) {
        EmpId = empId;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public void setJob(String job) {
        Job = job;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void setDOB(Date dOB) {
        DOB = dOB;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
