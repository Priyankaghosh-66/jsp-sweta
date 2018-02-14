/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import entity.Song;
import java.io.IOException;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;

/**
 *
 * @author Simon
 */
@WebServlet(name="Controller", urlPatterns={"/Controller"})
public class Controller extends HttpServlet {
    @PersistenceContext private EntityManager em;
    @Resource private UserTransaction utx;
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String operation = request.getParameter("operation");
        if (operation.equals("add")) {
            String artist = request.getParameter("artist");
            String song = request.getParameter("song");
            Song s = new Song();
            s.setArtist(artist);
            s.setSongTitle(song);
            try {
                utx.begin();
                em.persist(s);
                utx.commit();
            } catch (Exception ex) {
                this.getServletContext().log(ex.toString());
            }
        } // if operation was "list" just do the last part

        List <Song> results =
          (List <Song>)em.createQuery("select s from Song s").getResultList();
        request.setAttribute("songList", results);

        RequestDispatcher rd = request.getRequestDispatcher("ListSongs.jsp");
        rd.forward(request, response);

    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
