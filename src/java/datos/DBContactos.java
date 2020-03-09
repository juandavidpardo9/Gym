/*
 * DBContactos.java
 * 
 * Created on 7/04/2008, 10:26:02 PM
 */
package datos;


import java.sql.*;
import Logica.TipoDeCliente;

public class DBContactos {

    DBConexion cn;
    
    public DBContactos() {
        cn = new DBConexion();
    }

    public ResultSet getContactoById(int id) throws SQLException {
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT id, "
                + " Nombre, "           
                + " Edad, "
                + " Peso,"
                + " Altura "                           
                + " FROM Datos "
                + " WHERE id = ? ");
        pstm.setInt(1, id);

        ResultSet res = pstm.executeQuery();
        /*
         res.close();	
         */

        return res;
    }

    /**
     * trae todos los registros de la tabla contactos
     */
    public ResultSet getContactos() throws SQLException {
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT id, "
                + " Nombre, "             
                + " Edad, "
                + " Peso,"
                + " Altura "             
                + " FROM Datos "
                + " ORDER BY Nombre,Edad");


        ResultSet res = pstm.executeQuery();
        return res;
    }

    public void insertarContacto(TipoDeCliente c) {
        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("insert into Datos (Nombre, "
                   
                    + " Edad,"
                    + " Peso,"
                    + " Altura)"                   
                    + " values(?,?,?,?)");
            pstm.setString(1, c.getNombre());           
            pstm.setString(2, c.getEdad());
            pstm.setString(3, c.getPeso());
            pstm.setString(4, c.getAltura());
           
            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void actualizarContacto(TipoDeCliente c) {

        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("update Datos set Nombre = ?, "                   
                    + " Edad = ?,"
                    + " Peso = ?,"
                    + " Altura = ?"                  
                    + " where id = ?");
            pstm.setString(1, c.getNombre());           
            pstm.setString(2, c.getEdad());
            pstm.setString(3, c.getPeso());
            pstm.setString(4, c.getAltura());           
            pstm.setInt(5, c.getId());

            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void borrarContacto(TipoDeCliente c) {

        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("delete from Datos "
                    + " where id = ?");

            pstm.setInt(1, c.getId());

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }


    }

    public String getMensaje() {
        return cn.getMensaje();
    }
}
