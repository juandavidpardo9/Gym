/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import datos.DBContactos;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
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
@WebServlet(name="CargarContacto", urlPatterns=("/CargarContacto"))

public class CargarContacto extends HttpServlet {

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
        DBContactos conDB = new DBContactos();
        try {
                int id = Integer.parseInt(request.getParameter("item"));
                 String opc = request.getParameter("op");
                out.write(opc);
                ResultSet res = conDB.getContactoById(id);
                 if(res.next()){
                    c.setId(res.getInt("id"));
                    c.setNombre(res.getString("Nombre"));
                    c.setEdad(res.getString("Edad"));
                    c.setPeso(res.getString("Peso"));
                    c.setAltura(res.getString("Altura"));
                
            }
            
            if(opc.equals("edit")){
                request.getSession().setAttribute("Datos", c);
                response.sendRedirect("editar_contacto.jsp");
            }
            if(opc.equals("delete")){
                conDB.borrarContacto(c);
                response.sendRedirect("Inicio");
            }
        }catch(Exception e){
            
        }finally {            
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
