/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

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
public class GEtListOfTrazas {

    private List<TrazaControl> trazas;
    private int aceptadas, rechazadas;

    public GEtListOfTrazas(Filtro filtroFinal, int aceptadas, int rechazadas) {
        this.aceptadas = aceptadas;
        this.rechazadas = rechazadas;
        trazas = getTrazas(filtroFinal);

    }

    private List<TrazaControl> getTrazas(Filtro filtroFinal) {
        List<TrazaControl> traza = new ArrayList<>();
        TrazaControl trazacontrol = null;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT id, "
                    + "cantidad_muestreada "
                    + "FROM qualitys.traza "
                    + filtroFinal.toString()
                    + " and estadoLote is not null";
//            System.out.println("query:" + query);
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {

                    int result = conexion.resulset.getInt(1);
                    int muestr = conexion.resulset.getInt(2);
                    List<TipodeControl> control = getTiposdeControlPorTraza(result);
                    trazacontrol = new TrazaControl(result, muestr, control);
                    traza.add(trazacontrol);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GEtListOfTrazas.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.isConexionClose();
        }
        return traza;
    }

    private List<TipodeControl> getTiposdeControlPorTraza(int id) {
        TipodeControl control = null;
        List<TipodeControl> controles = new ArrayList();
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
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {

                    int idcontrol = conexion.resulset.getInt(1);
                    String nombre = conexion.resulset.getString(2);
                    int cantidad = conexion.resulset.getInt(3);
                    control = new TipodeControl(idcontrol, nombre, cantidad);
                    controles.add(control);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GEtListOfTrazas.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.isConexionClose();
        }
        return controles;
    }

    public List<TrazaControl> getListTrazas() {
        return trazas;
    }

    public List<TrazaControl> getTrazas() {
        return trazas;
    }

    public void setTrazas(List<TrazaControl> trazas) {
        this.trazas = trazas;
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

    @Override
    public String toString() {
        return "GEtListOfTrazas{" + "trazas=" + trazas + ", aceptadas=" + aceptadas + ", rechazadas=" + rechazadas + '}';
    }

}
