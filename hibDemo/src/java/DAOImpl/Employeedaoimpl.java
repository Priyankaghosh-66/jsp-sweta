/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import EmployeeDAO.Employeedao;
import Model.Employee;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author KOL-FACULTY01
 */
public class Employeedaoimpl implements Employeedao{

    @Override
    public void saveEmployee(Employee emp) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=session.beginTransaction();
        session.save(emp);
        tr.commit();
        session.close();
    }

    @Override
    public List<Employee> showAllEmp() {
        List<Employee> emplist=new ArrayList();
        Session session=HibernateUtil.getSessionFactory().openSession();
        Query query=session.createQuery("From Employee");
        emplist=query.list();
        return emplist;
    }

    @Override
    public void updateEmployee(int id, String ename, String enumber) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=session.beginTransaction();
        Employee emp=(Employee) session.load(Employee.class, id);
        emp.setEname(ename);
        emp.setEnumber(enumber);
        session.update(emp);
        tr.commit();
        session.close();
    }

    @Override
    public void deleteEmployee(Employee emp) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=session.beginTransaction();
        session.delete(emp);
        tr.commit();
        session.close();
        
    }
    
}
