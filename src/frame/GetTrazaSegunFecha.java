/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import estadisticas.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * cargará combos de selección con las fechas registradas en la database
 *
 * @author aguilangeles@gmail.com
 */
public class GetTrazaSegunFecha {

    private int idVerificacion;
    private String fecha_1;
    private String fecha_2;

    public GetTrazaSegunFecha(int idVerificacion, String fecha_1) {
        this.idVerificacion = idVerificacion;
        this.fecha_1 = fecha_1;
        getTrazasAccordADate(idVerificacion, fecha_1);
    }

    public GetTrazaSegunFecha(int idVerificacion, String fecha_1, String fecha_2) {
        this.idVerificacion = idVerificacion;
        this.fecha_1 = fecha_1;
        this.fecha_2 = fecha_2;
        getTrazasBetweenDates(idVerificacion, fecha_1, fecha_2);
    }

    private void getTrazasAccordADate(int idVerificacion, String fecha_1) {

        Conexion conexion = new Conexion();
        System.out.println("abrió conexion");
        if (conexion.isConexion()) {
            String query = " Select * FROM qualitys.traza "
                    + " where idVerificacion = " + idVerificacion
                    + " and fecha_control like '" + fecha_1 + "';";
            System.out.println(query);
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {
                    System.out.println(conexion.resulset.getInt(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(GetTrazaSegunFecha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        conexion.isConexionClose();
        System.out.println("cerró conexion");
    }

    private void getTrazasBetweenDates(int idVerificacion, String fecha_1, String fecha_2) {

        Conexion conexion = new Conexion();
        System.out.println("abrió conexion");
        if (conexion.isConexion()) {
            String query = "Select * FROM qualitys.traza"
                    + " where idVerificacion =" + idVerificacion
                    + " and fecha_control"
                    + " between '" + fecha_1 + "'"
                    + " and '" + fecha_2 + "';";
            System.out.println(query);
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {
                     System.out.println(conexion.resulset.getInt(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(GetTrazaSegunFecha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        conexion.isConexionClose();
        System.out.println("cerró conexion");
    }

}
