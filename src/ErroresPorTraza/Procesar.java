/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

import defaultTableModels.TableModelErroresPorMil;
import defaultTableModels.TableModelTiposError;
import defaultTableModels.TableModelAceptadosRechazados;
import javax.swing.table.DefaultTableModel;
import models.Filtro;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class Procesar {

    private final Filtro filtro;
    private final int aceptadas, rechazadas;
    private GetListadeTrazas trazas = null;
    private final DefaultTableModel errorModel;
    private final DefaultTableModel cantidad;
    private final DefaultTableModel pormil;
    private int totaltrazas;
    private int suma;

    public Procesar(Filtro filtro, int aceptadas, int rechazadas) {
        this.filtro = filtro;
        this.aceptadas = aceptadas;
        this.rechazadas = rechazadas;
        this.trazas = new GetListadeTrazas(filtro, aceptadas, rechazadas);
        this.errorModel = new TableModelTiposError(trazas).getErrores();
        this.cantidad = new TableModelAceptadosRechazados(aceptadas, rechazadas).getAceptadoyRechazados();
        this.pormil = new TableModelErroresPorMil(trazas).getPormil();
        this.suma = aceptadas+rechazadas;
    }

    public DefaultTableModel getErrorModel() {
        return errorModel;
    }

    public DefaultTableModel getCantidad() {
        return cantidad;
    }

    public DefaultTableModel getPormil() {
        return pormil;
    }

    public String resultados() {
        String valor
                = "Tipo de Verificacion:" + filtro.getId()
                + "\nTotal Trazas:" + trazas.getTraza().size()
                + "\nTotal de Imágenes:" +trazas.getImagenes()
                + "\nTotal de Trazas Aceptadas:" +aceptadas
                + "\nTotal de Trazas Rechazadas:"+rechazadas
                + filtro.getLastfechas()
                + filtro.getNombreDocumento()
                + filtro.getLastusuario();

        return valor;
    }

    public int getSuma() {
        return suma;
    }

    public int getTotaltrazas() {
        return totaltrazas;
    }

    public void setTotaltrazas(int totaltrazas) {
        this.totaltrazas = totaltrazas;
    }
    

    
}
