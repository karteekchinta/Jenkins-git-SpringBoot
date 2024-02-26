package com.employeeDataexample.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public class EmployeeJPARepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Employee employee ) {
        entityManager.persist(employee);
    }

    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    public void deleteById(long id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);

}
}
