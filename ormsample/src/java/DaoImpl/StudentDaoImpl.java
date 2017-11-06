/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import Model.StudentDetails;
import StuDao.StudentDao;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author KOL-FACULTY01
 */
public class StudentDaoImpl implements StudentDao{
    
   @Override
   public void saveStudent (StudentDetails sd)
    {
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction trans=session.getTransaction();
        session.save(sd);
        trans.commit();
        session.close();
        
    }
   @Override
    public List<StudentDetails> showAllStudents()
    {
       List<StudentDetails>stlist=new ArrayList();
       Session session=HibernateUtil.getSessionFactory().openSession();
       Query query=session.createQuery("From Student");
       stlist=query.list();
       return stlist;
       
    }
   @Override
    public void updateStudent(int id, String sname, String snumber) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        StudentDetails empdetails = (StudentDetails)session.load(StudentDetails.class, id);
        empdetails.setSname(sname);
        empdetails.setSnumber(snumber);
        session.update(empdetails);
        transaction.commit();
        session.close();  
    }
 
   @Override
    public void deleteStudent(StudentDetails employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(employee);
        transaction.commit();
        session.close();
    }
    
}
