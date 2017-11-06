/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeDAO;

import Model.Employee;
import java.util.List;

/**
 *
 * @author KOL-FACULTY01
 */
public interface Employeedao {
    public void saveEmployee(Employee emp);
    public List<Employee> showAllEmp();
    public void updateEmployee(int id,String ename,String enumber);
    public void deleteEmployee(Employee emp);
    
}
