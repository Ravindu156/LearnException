package lk.ac.vau.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;

import jakarta.persistence.EntityNotFoundException;
import lk.ac.vau.model.Department;
import lk.ac.vau.repo.DepartmentRepo;

public class DepartmentService {

    private final DepartmentRepo departmentRepo;

    @Autowired
    public DepartmentService(DepartmentRepo departmentRepo){
        this.departmentRepo=departmentRepo;

    }


    //Get All departments
    public List<Department> getAllDepartments(){
        return departmentRepo.findAll();
    }


    //Get department by ID
    public Department getDepartmentById(Long depId){
        if(departmentRepo.findById(depId).isEmpty()){
            throw new EntityNotFoundException("Department Not Found");
            
        }
        return departmentRepo.findById(depId).get();
    }



    public String addDepartment(Department department){
        if(departmentRepo.findById(department.getDepId()).isPresent()){
            throw new DuplicateKeyException("The Department is already available");
        }
        departmentRepo.save(department);
        return "New Department added";
    }




    





}
