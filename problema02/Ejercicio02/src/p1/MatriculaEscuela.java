/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author reroes
 */
public class MatriculaEscuela extends Matricula{
     @Override
    public void establecerTarifa(){
        tarifa = 50.2 + 40.2 + 140.2 + 200.4;
    }
    @Override
    public String toString() {
        String cadena = String.format("Matricula Escuela - %.2f\n", tarifa);
        return cadena;
    }
}
