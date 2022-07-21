/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

public class OperacionesTelevisor {

    private ArrayList<Televisor> televisores;
    private double totalPrecios;
    private double tvCaro = 0;
    private String listaMarcas;

    public void establecerTelevisores(ArrayList<Televisor> lista) {
        televisores = lista;
    }

    public ArrayList<Televisor> obtenerTelevisores() {
        return televisores;
    }

    public void establecerTotalPrecioTvs() {
        for (int i = 0; i < televisores.size(); i++) {
            totalPrecios += televisores.get(i).obtenerPrecio();
        }
    }

    public double obtenertotalPrecio() {
        return totalPrecios;
    }

    public void establecerTelevisorMasCaro() {
        for (int j = 0; j < televisores.size(); j++) {
            if (televisores.get(j).obtenerPrecio() > tvCaro) {
                tvCaro = televisores.get(j).obtenerPrecio();
            }
        }
    }

    public double obtenertelevisorCaro() {
        return tvCaro;
    }

    public void listaMarcasVendidas() {
        listaMarcas="";
        for (int i = 0; i < televisores.size(); i++) {
            listaMarcas = String.format("%s\n%s",
                    listaMarcas,
                    televisores.get(i).obtenerMarca());
        }
    }

    public String obtenerListaMarcas() {
        return listaMarcas;
    }

    @Override
    public String toString() {

        String cadena = String.format("Total precios televisores: %.2f\n"
                + "Televisor mas caro: %.2f\n"
                + "Lista de marcas: %s\n",
                totalPrecios,
                tvCaro,
                listaMarcas);

        return cadena;
    }
}
