/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StuDao;

import Model.StudentDetails;
import java.util.List;

/**
 *
 * @author KOL-FACULTY01
 */
public interface StudentDao {
    
    public void saveStudent (StudentDetails sd);
    public List<StudentDetails> showAllStudents();
    public void updateStudent (int id, String ename, String enumber);
    public void deleteStudent (StudentDetails sd);
    
    
}
    
    
    

