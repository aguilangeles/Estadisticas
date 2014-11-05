/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

import models.TipodeControl;
import models.TrazaControl;
import estadisticas.Conexion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Filtro;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class GetListadeTrazas {

    List<Integer> idtrazaList = new ArrayList<>();

    
    private int aceptadas, rechazadas;
    List<TipodeControl> controles = new ArrayList<>();
     List<TrazaControl> traza = new ArrayList<>();

    public GetListadeTrazas(Filtro filtroFinal, int aceptadas, int rechazadas) {
        this.aceptadas = aceptadas;
        this.rechazadas = rechazadas;
        getTrazas(filtroFinal);
        getTipodeControlList();
    }

    /**
     * CREA UNA LISTA CON LAS TRAZAS INCLUIDAS EN LOS FILTROS APLICADOS
     */
    private List<TrazaControl> getTrazas(Filtro filtroFinal) {
        TrazaControl trazacontrol;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT id, "
                    + " cantidad_muestreada ,"
                    + " estadoLote "
                    + " FROM qualitys.traza "
                    + filtroFinal.toString()
                    + " and estadoLote is not null;";
//                        System.out.println(query);

            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {
                    int result = conexion.resulset.getInt(1);
                    int muestr = conexion.resulset.getInt(2);
                    int estado = conexion.resulset.getInt(3);
                    poblarListaIdtraza(result);
                    trazacontrol = new TrazaControl(result, muestr, estado);
                    traza.add(trazacontrol);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GetListadeTrazas.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.isConexionClose();
        }
        return traza;
    }
    /*INCLUYE LOS ID'S EN UN ARRAY => 'where idtraza IN (10, 11, 12, 13)' */

    private void poblarListaIdtraza(int id) {
        idtrazaList.add(id);
    }
    /*CONTABILIZA LA TODALIDAD DE ERRORES SURGIDOS POR EL ID DE TRAZA*/

    private List<TipodeControl> getTipodeControlList() {
        TipodeControl control;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT  "
                    + "tac.idcontrol "
                    + ", c.descripcion as 'nombre' "
                    + ", count(tac.idcontrol) as 'cantidad' "
                    + " FROM qualitys.traza_archivo_controles tac "
                    + " join controles c "
                    + " on tac.idcontrol= c.id "
                    + " where idtraza IN " + arraydeIdsTraza()
                    + " and tac.estado = 1 "
                    + " group by tac.idcontrol "
                    + "; ";
//            System.out.println(query);
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {
                    String nombre = conexion.resulset.getString(2);
                    int cantidad = conexion.resulset.getInt(3);
                    control = new TipodeControl(nombre, cantidad);
                    controles.add(control);

                }
            } catch (SQLException ex) {
                Logger.getLogger(GetListadeTrazas.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.isConexionClose();
        }
        return controles;
    }


    private String arraydeIdsTraza() {
        String numeros = idtrazaList.toString();
        String left = numeros.replace("[", "(");
        String right = left.replace("]", ")");
        return right;
    }

    public int getAceptadas() {
        return aceptadas;
    }

    public void setAceptadas(int aceptadas) {
        this.aceptadas = aceptadas;
    }

    public int getRechazadas() {
        return rechazadas;
    }

    public void setRechazadas(int rechazadas) {
        this.rechazadas = rechazadas;
    }

    public List<TrazaControl> getTraza() {
        return traza;
    }

    public void setTraza(List<TrazaControl> traza) {
        this.traza = traza;
    }
    public List<TipodeControl> getControles() {
        return controles;
    }

    
    
    

}
