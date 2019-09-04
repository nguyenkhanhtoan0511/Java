package com.nokia.hibernate.dao.impl;

import com.nokia.hibernate.dao.EmployeeDAO;
import com.nokia.hibernate.entity.Employee;
import com.nokia.hibernate.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private SessionFactory sessionFactory;

    private Session currentSession;

    public EmployeeDAOImpl(){
    }

    public Session openCurrentSession(){
        currentSession = HibernateUtil.getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction(){
        currentSession = HibernateUtil.getSessionFactory().openSession();
        currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession(){
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction(){
        currentSession.getTransaction().commit();
        currentSession.close();
    }

    public void setCurrentSession(Session session){
        this.currentSession = session;
    }

    public Session getCurrentSession(){
        return currentSession;
    }

    @Override
    public List<Employee> findAll() {
        try {
            Query query = getCurrentSession().createQuery("from Employee");
            List<Employee> employees = query.list();
            return employees;
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public Employee getEmployee(String firstName, String lastName) {
        try {
            Query query = getCurrentSession().createQuery("from Employee where first_name = :firstName and last_name = :lastName");
            query.setParameter("firstName", firstName);
            query.setParameter("lastName", lastName);
            List<Employee> models = query.list();
            return (models != null && models.size() > 0 ) ? (Employee) models.get(0) : null;
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public void add(Employee employee) {
        try {
            getCurrentSession().save(employee);
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public void update(Employee employee) {
        try {
            getCurrentSession().update(employee);
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public Employee findById(int id){
        try {
            Employee employee = (Employee) getCurrentSession().get(Employee.class, id);
            return  employee;
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public void delete(Employee employee) {
        try {
            getCurrentSession().delete(employee);
        } catch (Throwable e) {
            throw e;
        }
    }

    public void deleteAll(){
        List<Employee> entityList = findAll();
        for (Employee entity : entityList) {
            delete(entity);
        }
    }

}
