/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p1.*;
import p2.TipoMatricula;
import java.util.ArrayList;
/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();

        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();

        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerTarifa();
        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerTarifa();
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerTarifa();
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerTarifa();

        ArrayList<Matricula> m = new ArrayList<>();
        m.add(mcamp);
        m.add(mcolegio);
        m.add(mescuela);
        m.add(mjardin);
        m.add(mmaternal);
        m.add(mmaternal2);
        
        TipoMatricula tipos = new TipoMatricula();
        tipos.establecerMatriculas(m);
        tipos.establecerPromedioTarifas();
        
        System.out.println(tipos);
    }
}
