/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import datos.DBContactos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Logica.TipoDeCliente;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Alejo
 */
@WebServlet(name="ActualizarContacto", urlPatterns=("/ActualizarContacto"))
public class ActualizarContacto extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        TipoDeCliente c = new TipoDeCliente();
        DBContactos conDb = new DBContactos();
        try {
            c.setId(Integer.valueOf(request.getParameter("id")));
            c.setNombre(request.getParameter("Nombre"));           
            c.setEdad(request.getParameter("Edad"));
            c.setPeso(request.getParameter("Peso"));
            c.setAltura(request.getParameter("Altura"));
           
            
            conDb.actualizarContacto(c);
            
            response.sendRedirect("Inicio");
            
        } finally {            
            out.close();
        }
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
