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
import models.TrazaporVerificacion;

/**
 *  TRAE LAS CANTIDADES DE TRAZAS, ACEPTADAS, RECHAZADAS Y NULAS SEGUN EL 
 *  ID VERIFICAION.
 * @author aguilangeles@gmail.com
 */
public class GetCantidadVerificacion {

    private final String condition;
    private final TrazaporVerificacion traza;

    public GetCantidadVerificacion(TrazaporVerificacion traza, String condition) {

        this.traza = traza;
        int id = traza.getIdVerificacion();
        this.condition = condition;
        //
        int total = getQuantityofTrazas(id, condition);
        int aceptadas = getQuantityof(id, "= '1'", condition);
        int rechazados = getQuantityof(id, "= '0'", condition);
        int nulas = getQuantityof(id, "IS NULL", condition);
        //        
        this.traza.setTrazas(total);
        this.traza.setAceptadas(aceptadas);
        this.traza.setRechazadas(rechazados);
        this.traza.setNulas(nulas);
    }

    private int getQuantityofTrazas(int id, String condition) {
        int result = 0;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT count(*) FROM qualitys.traza  where idVerificacion = " + id + condition;
            conexion.executeQuery(query);
            System.out.println(query);
            try {
                while (conexion.resulset.next()) {

                    result = conexion.resulset.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GetCantidadVerificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.isConexionClose();
        }
        return result;
    }

    
    private int getQuantityof(int idTraza, String value, String condition) {
        int result = 0;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT count(*) FROM qualitys.traza "
                    + " where idverificacion = " + idTraza
                    + " and estadoLote " + value + condition;
            conexion.executeQuery(query);
            System.out.println(query);
            try {
                while (conexion.resulset.next()) {

                    result = conexion.resulset.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GetCantidadVerificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.isConexionClose();
        }
        return result;
    }

    public TrazaporVerificacion getTraza() {
        return traza;
    }

}
