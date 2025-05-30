package lk.ac.vau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.model.Department;
import lk.ac.vau.repo.DepartmentRepo;
import lk.ac.vau.service.DepartmentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    @Autowired
    private DepartmentRepo departmentRepo;


    //Get all departments
    @GetMapping()
    public ResponseEntity<List<Department>> getAllDepartments(){
        return new ResponseEntity<List<Department>>
        (service.getAllDepartments(),HttpStatus.OK);
    }

    //Get department by ID
    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long depId){
        return new ResponseEntity<Department>(service.getDepartmentById(depId),HttpStatus.OK);
    }

    //Delete a department
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable Long id){
        if (departmentRepo.existsById(id)){
            departmentRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }





    


    



    
}
