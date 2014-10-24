/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

import estadisticas.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Filtro;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class GEtListOfTrazas {

    private Filtro filtroFinal;
    private int id;

    public GEtListOfTrazas(Filtro filtroFinal, int id) {
        this.filtroFinal = filtroFinal;
        this.id = id;
        getidTrazas();
    }

    private int getidTrazas() {
        int result = 0;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT id FROM qualitys.traza " + filtroFinal.toString();
//            System.out.println(query);
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {

                    result = conexion.resulset.getInt(1);
//                    System.out.println("===================");
                    getTiposControl(result);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GEtListOfTrazas.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.isConexionClose();
        }
        return result;
    }

    private int getTiposControl(int id) {
        int result = 0;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT  "
                    + "tac.idcontrol "
                    + ", c.descripcion as 'nombre' "
                    + ", count(tac.idcontrol) as 'cantidad' "
                    + " FROM qualitys.traza_archivo_controles tac "
                    + " join controles c "
                    + " on tac.idcontrol= c.id "
                    + " where idtraza = " + id
                    + " and tac.estado = 1 "
                    + " group by tac.idcontrol "
                    + "; ";
           System.out.println(query);
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {

                    int idcontrol = conexion.resulset.getInt(1);
                    String nombre = conexion.resulset.getString(2);
                    int cantidad = conexion.resulset.getInt(3);
                    System.out.println(idcontrol+"\t"+nombre+"\t"+cantidad);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GEtListOfTrazas.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.isConexionClose();
        }
        return result;
    }

}
