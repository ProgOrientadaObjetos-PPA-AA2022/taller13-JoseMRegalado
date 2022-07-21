/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.*;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> matriculas;

    public void establecerMatriculas(ArrayList<Matricula> m) {
        matriculas = m;
    }

    public ArrayList<Matricula> obtenerMatricula() {
        return matriculas;
    }

    public void establecerPromedioTarifas() {
        double suma = 0;
        for (int i = 0; i < obtenerMatricula().size(); i++) {
            suma = suma + obtenerMatricula().get(i).obtenerTarifa();
        }
        promedioMatriculas = suma / obtenerMatricula().size();
    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String cadena = String.format("Lista de Matriculas\n");
        for (int i = 0; i < obtenerMatricula().size(); i++) {
            cadena = String.format("%s%s",
                    cadena,
                    matriculas.get(i));
        }
        cadena = String.format("%s-------------------------------"
                + "\nPromedio Matriculas: %.2f",
                cadena,
                promedioMatriculas);
        return cadena;

    }
}
