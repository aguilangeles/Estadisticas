/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

import estadisticas.Conexion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
    private Set<String> nombres = new HashSet<>();
    List<Integer> ides = new ArrayList<>();
    private List<TipodeControl> controles = new ArrayList();

    public GEtListOfTrazas(Filtro filtroFinal, int aceptadas, int rechazadas) {
        this.aceptadas = aceptadas;
        this.rechazadas = rechazadas;
        trazas = getTrazas(filtroFinal);
        getTiposdeControlPorTraza();
    }

    private List<TrazaControl> getTrazas(Filtro filtroFinal) {
        int position = 0;
        List<TrazaControl> traza = new ArrayList<>();
        TrazaControl trazacontrol = null;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT id, "
                    + " cantidad_muestreada ,"
                    + " estadoLote "
                    + " FROM qualitys.traza "
                    + filtroFinal.toString()
                    + " and estadoLote is not null";
//            System.out.println("query: " + query);
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {
                    position++;
                    int result = conexion.resulset.getInt(1);
                    int muestr = conexion.resulset.getInt(2);
                    int est = conexion.resulset.getInt(3);
                    agregararray(result);
                    trazacontrol = new TrazaControl(result, muestr, est, null);
                    traza.add(trazacontrol);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GEtListOfTrazas.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.isConexionClose();
        }
        return traza;
    }

    private void agregararray(int id) {
        ides.add(id);

    }

    private List<TipodeControl> getTiposdeControlPorTraza() {
        String right = prepareInclude();

        TipodeControl control = null;
//        List<TipodeControl> controles = new ArrayList();
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT  "
                    + "tac.idcontrol "
                    + ", c.descripcion as 'nombre' "
                    + ", count(tac.idcontrol) as 'cantidad' "
                    + " FROM qualitys.traza_archivo_controles tac "
                    + " join controles c "
                    + " on tac.idcontrol= c.id "
                    + " where idtraza IN " + right
                    + " and tac.estado = 1 "
                    + " group by tac.idcontrol "
                    + "; ";
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {
                    String nombre = conexion.resulset.getString(2);
                    int cantidad = conexion.resulset.getInt(3);
                    control = new TipodeControl(nombre, cantidad);
                    controles.add(control);

                }
            } catch (SQLException ex) {
                Logger.getLogger(GEtListOfTrazas.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.isConexionClose();
        }
        return controles;
    }

    public List<TipodeControl> getControles() {
        return controles;
    }

    private String prepareInclude() {
        String numeros = ides.toString();
        String left = numeros.replace("[", "(");
        String right = left.replace("]", ")");
        return right;
    }

    public Set<String> getNombres() {
        return nombres;
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
