/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import documento.GetTypedocs;
import fecha.GetDates;
import javax.swing.JOptionPane;
import usuario.GetUsername;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class SeleccionChecks {

    private final int valor;
    private final String condicion;
    private final GetDates dates;
    private final GetTypedocs typedocs;
    private final GetUsername username;

    public SeleccionChecks(int valor, String condicion, GetDates dates, GetTypedocs typedocs, GetUsername username) {
        this.valor = valor;
        this.condicion = condicion;
        this.dates = dates;
        this.typedocs = typedocs;
        this.username = username;
        cases(valor);
    }

    private void cases(int valores) {
        switch (valores) {
            case 0:
                System.out.println("0 - sin seleccion");
                JOptionPane.showMessageDialog(null, "debe seleccionar un check");
                dates.desactivar();
                typedocs.desactivar();
                username.desactivar();
                break;
            case 1:
                //fecha, documento y usuario
                System.out.println("1 - fecha, documento y usuario");
                dates.activar(condicion);
                typedocs.activar(condicion);
                username.active(condicion);
                break;
            case 2:
                //fecha y documento
                System.out.println("2 - fecha y documento");
                dates.activar(condicion);
                typedocs.activar(condicion);
                username.desactivar();
                break;
            case 3:
                //fecha y usuario
                System.out.println("3 - fecha y usuario ");
                dates.activar(condicion);
                typedocs.desactivar();
                username.active(condicion);
                break;
            case 4:
                //documento y usuario
                System.out.println("4 - documento y usuario");
                dates.desactivar();
                typedocs.activar(condicion);
                username.active(condicion);
                break;
            case 5:
                // solo fecha
                System.out.println("5 - solo fecha");
                dates.activar(condicion);
                typedocs.desactivar();
                username.desactivar();

                break;
            case 6:
                //solo documento
                System.out.println("6 - solo documento");
                dates.desactivar();
                typedocs.activar(condicion);
                username.desactivar();
                break;
            case 7:
                //solo usuario
                System.out.println("7 - solo usuario");
                dates.desactivar();
                typedocs.desactivar();
                username.active(condicion);
                break;
        }
    }

}
