/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.Filtro;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class Procesor {

    private Filtro filtro;
    private int aceptadas, rechazadas;
    GEtListOfTrazas list = null;
    List<TipodeControl> ultimalist = new ArrayList<>();
    Map<Integer, TipodeControl> mapcontrol = new HashMap();

    public Procesor(Filtro filtro, int aceptadas, int rechazadas) {
        this.filtro = filtro;
        this.aceptadas = aceptadas;
        this.rechazadas = rechazadas;
        this.list = new GEtListOfTrazas(filtro, aceptadas, rechazadas);
        getErroresporTraza();
        iterar();
    }

    private void getErroresporTraza() {
        int valor = 0;

        for (TrazaControl ct : list.getListTrazas()) {
            if (!ct.getControles().isEmpty()) {
                List<TipodeControl> listcontrol = ct.getControles();
                for (TipodeControl listcontrol1 : listcontrol) {
                    valor++;
                    getlistafinal(valor, listcontrol1);

                }

            }

        }

    }

    private void getlistafinal(int valor, TipodeControl tipodeControl) {
        mapcontrol.put(valor, tipodeControl);
    }

    private void iterar() {
        

    }
}
