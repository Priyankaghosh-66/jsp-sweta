/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOImpl.Employeedaoimpl;
import EmployeeDAO.Employeedao;
import Model.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KOL-FACULTY01
 */
@WebServlet(name = "EmployeeController", urlPatterns = {"/EmployeeController"})
public class EmployeeController extends HttpServlet {

    Employee emp=new Employee();
    Employeedaoimpl empdaoimpl=new Employeedaoimpl();
    Employeedao empdao;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EmployeeController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EmployeeController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       if(request.getParameter("addEmployee")!=null)
       {
           String ename=request.getParameter("ename");
           String enumber=request.getParameter("enumber");
           emp.setEname(ename);
           emp.setEnumber(enumber);
           empdaoimpl.saveEmployee(emp);
           RequestDispatcher rd=request.getRequestDispatcher("EmployeeAdd.jsp");
           rd.forward(request, response);
           
       }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("showEmployee")!=null)
        {
            List<Employee> emlist=new ArrayList();
            emlist=empdaoimpl.showAllEmp();
            request.setAttribute("emlist", emlist);
            RequestDispatcher rd=request.getRequestDispatcher("ShowAll.jsp");
            rd.forward(request, response);
        }
        if(request.getParameter("updateEmployee")!=null)
        {
            int id1=Integer.parseInt(request.getParameter("id"));
            String enam=request.getParameter("ename");
            String enumberupdate=request.getParameter("enumberupdate");
            empdaoimpl.updateEmployee(id1, enam, enumberupdate);
            RequestDispatcher rd = request.getRequestDispatcher("EmployeeAdd.jsp");
             rd.forward(request, response);
             
         }
          
         if(request.getParameter("deleteEmployee")!=null){
             int id2 = Integer.parseInt(request.getParameter("id"));
             emp.setId(id2);
             empdaoimpl.deleteEmployee(emp);
              RequestDispatcher rd = request.getRequestDispatcher("EmployeeAdd.jsp");
            rd.forward(request, response);
         }

    
   

}
}
