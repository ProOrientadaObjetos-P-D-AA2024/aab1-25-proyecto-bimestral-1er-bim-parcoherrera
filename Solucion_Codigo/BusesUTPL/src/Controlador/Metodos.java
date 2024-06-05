package Controlador;

import Modelo.Parada;
import Modelo.Ruta;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Metodos {

    public void imprimirMenuPrincipal() {
        System.out.println("========================================");
        System.out.println("||  SISTEMA DE GESTIÓN DE BUSES UTPL  ||");
        System.out.println("========================================");
        System.out.println("");
        System.out.println("Seleccione una opción:");
        System.out.println("");
        System.out.println("[1] Ver información de rutas");
        System.out.println("[2] Optimizar rutas");
        System.out.println("");
    }

    public void imprimirInformacionRutas() {
        System.out.println("----------------------------------------");
        System.out.println("Informacion de rutas");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Seleccione la ruta:");
        System.out.println("");
        System.out.println("[1] LINEA 1 - Tebaida");
        System.out.println("[2] LINEA 2 - Las Pitas");
        System.out.println("[3] LINEA 3 - Puerta de la Ciudad");
        System.out.println("[4] LINEA 4 - Estadio");
        System.out.println("[5] LINEA 5 - Clodoveo");
        System.out.println("[6] LINEA 6 - Zona Milizar");
        System.out.println("");
    }

    public void imprimirSeleccionarHorario(Ruta ruta) {
        System.out.println("----------------------------------------");
        System.out.println(ruta.getNombre());
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Seleccione un horario disponible");
        System.out.println("");
        System.out.println("[1] 7am");//+r01.horario1.getNombre());//se puede eliminar los atributos horario de las rutas 
        System.out.println("[2] 1pm");//+r01.horario2.getNombre());
        System.out.println("[3] 7pm");//+r01.horario3.getNombre());
        System.out.println("");
    }

    public void imprimirParadas(Ruta ruta, String[] horario) {
        System.out.println("----------------------------------------");
        System.out.println("SALIDA: Campus UTPL");
        System.out.println("Hora de salida: " + horario[0]);
        for (int i = 0; i < 6; i++) {
            System.out.println("----------------------------------------");
            System.out.print("PARADA " + (i + 1) + ": ");
            System.out.println(ruta.paradas[i].getNombre());
            System.out.print("Ubicacion: ");
            System.out.println(ruta.paradas[i].getCoordenadas());
            System.out.println("Hora de llegada: " + horario[i + 1]);
        }
    }

    public int numAleatorio() {
        int num;
        num = (int) (Math.random() * 40 + 1);
        return num;
    }

    public void imprimirRutaOptimizar() {
        System.out.println("----------------------------------------");
        System.out.println("Optimizacion de rutas");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Seleccione la ruta a optimizar:");
        System.out.println("");
        System.out.println("[1] LINEA 1 - Tebaida");
        System.out.println("[2] LINEA 2 - Las Pitas");
        System.out.println("[3] LINEA 3 - Puerta de la Ciudad");
        System.out.println("[4] LINEA 4 - Estadio");
        System.out.println("[5] LINEA 5 - Clodoveo");
        System.out.println("[6] LINEA 6 - Zona Milizar");
        System.out.println("");
    }

    public void seleccionarParadaOptimizar(Ruta ruta) {
        System.out.println("----------------------------------------");
        System.out.println("Optimizar " + ruta.getNombre());
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Seleccione la parada a optimizar:");
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            System.out.print("[" + (i + 1) + "] ");
            System.out.println(ruta.paradas[i].getNombre());
        }
    }

    public void optimizarParada(Ruta ruta, int n) {
        int num = numAleatorio();
        System.out.println("----------------------------------------");
        System.out.println("Optimizar Parada " + ruta.paradas[n - 1].getNombre());
        System.out.println("----------------------------------------");
        System.out.println("Subieron al bus " + num + " personas en esta parada.");
        if (num < 10) {
            System.out.println("Debido a la poca afluencia de estudiantes, los buses demoran menos tiempo en esta parada.");
            System.out.println("Se recomienda eliminar esta parada por no tener suficientes pasajeros.");
        } else if (num >= 10 && num <= 30) {
            System.out.println("Nada que optimizar.");
            System.out.println("La línea abastece con éxito la parada.");
        } else if (num > 30) {
            System.out.println("Debido a la gran afluencia de estudiantes, los buses demoran más tiempo en esta parada.");
            System.out.println("Se recomienda enviar otra línea de bus para la comodidad de los pasajeros.");
        }
    }
    
    
    public void guardarParadas(Parada[] paradas, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(paradas);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public Parada[] leerParadas(String fileName) {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (Parada[]) in.readObject();
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
            return null;
        }
    }

    public void guardarHorarios(String[] horarios, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(horarios);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public String[] leerHorarios(String fileName) {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (String[]) in.readObject();
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
            return null;
        }
    }
    

}
