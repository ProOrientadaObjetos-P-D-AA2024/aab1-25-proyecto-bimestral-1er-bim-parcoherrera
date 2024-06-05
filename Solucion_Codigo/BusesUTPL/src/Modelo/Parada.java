package Modelo;

import java.io.Serializable;

public class Parada implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String coordenadas;

    public Parada(String nombre, String coordenadas) {
        this.nombre = nombre;
        this.coordenadas = coordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    @Override
    public String toString() {
        return "Parada{" + "nombre=" + nombre + ", coordenadas=" + coordenadas + '}';
    }
}
