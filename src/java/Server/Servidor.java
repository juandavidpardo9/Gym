/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Logica.TipoDeCliente;
import Logica.Delgadez;
import Logica.DelgadezMuySevera;
import Logica.DelgadezSevera;
import Logica.ObesidadModerada;
import Logica.ObesidadMuySevera;
import Logica.ObesidadSevera;
import Logica.PesoSaludable;
import Logica.Sobrepeso;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author david
 */
public class Servidor extends HttpServlet {
  

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *      */
  
    
     static public void liscov(TipoDeCliente a){
        
        
         acondicionamiento=a.calentar()+" "+a.estirar();
         brazos=a.rutinaBrazosHombros();
         pecho=a.rutinaPecho();
         piernas=a.rutinaPiernas();
         espalda=a.rutinaEspalda();
        
    }
     static String acondicionamiento="";
     static String brazos="";
     static String pecho="";
     static String piernas=""; 
     static String espalda=""; 
     static String condicion="";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        TipoDeCliente c = new TipoDeCliente();        
        c.setNombre(request.getParameter("Nombre"));
        c.setEdad(request.getParameter("Edad"));       
        Float a=Float.parseFloat(request.getParameter("Peso"));
        Float b=Float.parseFloat(request.getParameter("Altura"));
        Float  IMC=a/(b*b);
        DecimalFormat df=new DecimalFormat("#.0");
        
        
        if(IMC<15){
            DelgadezMuySevera d=new DelgadezMuySevera();
            liscov(d);
            condicion="(Delgadez Muy Severa)";
            
        }else if(IMC>=15 && IMC<=15.9){
            DelgadezSevera e=new DelgadezSevera();
            liscov(e);
            condicion="(Delgadez Severa)";
            
        }else if(IMC>=16 && IMC<=18.4){
            Delgadez e=new Delgadez();
            liscov(e);
            condicion="(Delgadez)";
            
        }else if(IMC>=18.5 && IMC<=24.9){
            PesoSaludable e=new PesoSaludable();
           liscov(e);
            condicion="(Peso Saludable)";
            
        }else if(IMC>=25 && IMC<=29.9){
            Sobrepeso e=new Sobrepeso();
            acondicionamiento+=" "+e.ejercicioCardio();
            liscov(e);
            condicion="(Sobrepeso)";
            
            
        }else if(IMC>=30 && IMC<=34.9){
            ObesidadModerada e=new ObesidadModerada();
            acondicionamiento+=" "+e.ejercicioCardio();
            liscov(e);
            condicion="(Obesidad Moderada)";
            
        }else if(IMC>=35 && IMC<=39.9){
            ObesidadSevera e=new ObesidadSevera();
            acondicionamiento+=" "+e.ejercicioCardio();
           liscov(e);
            condicion="(Obesidad Severa)";
            
            
        }else if(IMC>=40){
            ObesidadMuySevera e=new ObesidadMuySevera();
            acondicionamiento+=" "+e.ejercicioCardio();           
            condicion="(Obesidad Muy Severa)";
            
            
        }
       
            
            
        
        PrintWriter out = response.getWriter();
        try {
         
            /* TODO output your page here. You may use following sample code. */

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Gimnasio</title>");
            out.println("<link rel='stylesheet' type='text/css' "
                    + "href='./Estilos/style.css'>");
            out.println("</head>");            
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<div class='box'>");
            out.println("<div class='content'>");
            out.println("<h2>" + "" + "</h2>");
            out.println("<h3>" + "Cliente" +"</h3>");
            out.println("<p>" +"Nombre: "+ c.getNombre()+"</p> ");
            out.println("<p>" +"Edad: "+ c.getEdad()+"</p> ");
            out.println("<p>" +"Peso: "+a+"</p> ");
            out.println("<p>" +"Altura: "+b+"</p> ");
            out.println("<p>"+"Su indice de masa corporal es: "+df.format(IMC)+" "+condicion+"<br>"+ acondicionamiento+"</p>");
            out.println("<p><b>"+"Realice estos ejercicios por 4 días y el dia 5 es de descanso luego vuelva a comenzar el ciclo."+"</p></b>");
            out.println("<a href='#'>" + "Leer más" + "</a>");
            out.println("</div>");
            out.println("</div>");            
            out.println("<div class='box'>");
            out.println("<div class='content'>");
            out.println("<h2>" + "01" + "</h2>");
            out.println("<h3>" + "Rutina para Brazos y Hombros Día 1" +"</h3>");
            out.println("<p> "+brazos+"</p>");
            out.println("<a href='#'>" + "Leer más" + "</a>");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class='box'>");
            out.println("<div class='content'>");
            out.println("<h2>" + "02" +"</h2>");
            out.println("<h3>" + "Rutina para Espalda Día 2" +"</h3>");
            out.println("<p>" +espalda+"</p>");
            out.println("<a href='#'>" + "Leer más" + "</a>");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class='box'>");
            out.println("<div class='content'>");
            out.println("<h2>" + "03" + "</h2>");
            out.println("<h3>" + "Rutina para Pecho Día 3" +"</h3>");
            out.println("<p>"+pecho+"</p>");
            out.println("<a href=''>" + "Leer más" + "</a>");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class='box'>");
            out.println("<div class='content'>");
            out.println("<h2>" + "04" + "</h2>");
            out.println("<h3>" + "Rutina para Piernas Día 4" +"</h3>");
            out.println("<p>"+piernas+"</p>");
            out.println("<a href='#'>");
            out.println("Leer más");
            out.println("</a>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</body>");
           
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
