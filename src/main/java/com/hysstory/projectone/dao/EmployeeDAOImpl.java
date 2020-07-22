/*
package com.hysstory.projectone.dao;

import com.hysstory.projectone.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    // Define field for entityManager
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        // Create Query Execute Query and get result
        Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);

        return theQuery.getResultList();
    }

    @Override
    public Employee findById(int id) {
        return entityManager.unwrap(Session.class).get(Employee.class, id);
    }

    @Override
    public void save(Employee employee) {
        entityManager.unwrap(Session.class).saveOrUpdate(employee);
    }

    @Override
    public void deleteById(int id) {
        entityManager.unwrap(Session.class).createQuery("delete from Employee where id=:id")
                .setParameter("id", id).executeUpdate();
    }
}
*/
