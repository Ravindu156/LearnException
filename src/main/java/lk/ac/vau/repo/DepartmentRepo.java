package lk.ac.vau.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import lk.ac.vau.model.Department; 
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
    List<Department> findByDName(String dName);
    List<Department> findByLocation(String location);
}
