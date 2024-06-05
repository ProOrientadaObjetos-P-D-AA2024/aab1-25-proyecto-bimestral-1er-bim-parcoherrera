package Modelo;

import Modelo.Parada;

public class Ruta {

    public String nombre;
    public Parada[] paradas;

    public Ruta(String nombre, Parada[] paradas) {
        this.nombre = nombre;
        this.paradas = paradas;
    }

    public String getNombre() {
        return nombre;
    }

    public Parada[] getParadas() {
        return paradas;
    }

}
