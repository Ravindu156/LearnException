package lk.ac.vau.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long depId;
    private String DName;


    @OneToMany(mappedBy="department",cascade=CascadeType.ALL)
    private List<Employee> employees;

    private String location;

    public Department(){}

    public Department(Long depId,String DNam,String location){
      this.depId = depId;
    	this.DName = DName;
    	this.location = location;
    }

    public Department(Long depId,String DName,List<Employee> employees, String location){
        super();
		this.depId = depId;
		this.DName = DName;
		this.employees = employees;
		this.location = location;

    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public String getDName() {
        return DName;
    }

    public void setDName(String dName) {
        DName = dName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    



    }




