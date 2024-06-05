package Vista;

import Controlador.Metodos;
import Modelo.Ruta;
import Modelo.Parada;

import java.io.*;
import java.util.Scanner;

public class BusesUTPL {

    public static void main(String[] args) {
        
        Metodos obj = new Metodos();
        Scanner entrada = new Scanner(System.in);
        int num;
        
        // Creación de paradas
        Parada p01 = new Parada("Argentina y Pio Jaramillo", "3,65519° 6,18611°");
        Parada p02 = new Parada("San Pedro", "4,986875° 5,464861°");
        Parada p03 = new Parada("Tebaida Baja", "6,89416° 2,64963°");
        Parada p04 = new Parada("Tebaida Alta", "3,694461° 2,164954°");
        Parada p05 = new Parada("Lauro Guerrero", "5,159233° 3,94961°");
        Parada p06 = new Parada("La Urna", "4,266791° 2,48646°");
        Parada p07 = new Parada("Hipervalle", "5,96616° 2,26762°");
        Parada p08 = new Parada("Calasanz", "3,15646° 3,488515°");
        Parada p09 = new Parada("Solca", "7,1546° 3,26796°");
        Parada p10 = new Parada("La Paz", "2,16463° 3,39456°");
        Parada p11 = new Parada("Las Pitas", "5,57155° 3,154616°");
        Parada p12 = new Parada("Terminal Terrestre", "4,159463° 3,23256°");
        Parada p13 = new Parada("Puerta de la Ciudad", "3,65519° 6,18611°");
        Parada p14 = new Parada("Simon Bolivar", "4,986875° 5,464861°");
        Parada p15 = new Parada("Jose A. Eguiguren", "6,89416° 2,64963°");
        Parada p16 = new Parada("Mercadillo", "3,694461° 2,164954°");
        Parada p17 = new Parada("Santiago de Las Montañas", "5,96616° 2,26762°");
        Parada p18 = new Parada("Emiliano Ortega", "3,15646° 3,488515°");
        Parada p19 = new Parada("Miguel Riofrio", "7,1546° 3,26796°");
        Parada p20 = new Parada("Estadio", "2,16463° 3,39456°");
        Parada p21 = new Parada("24 de Mayo", "5,57155° 3,154616°");
        Parada p22 = new Parada("Av. Cuxibamba", "3,65519° 6,18611°");
        Parada p23 = new Parada("Zona Militar", "4,986875° 5,464861°");
        Parada p24 = new Parada("Redondel El Bosque", "6,89416° 2,64963°");
        Parada p25 = new Parada("Clodoveo", "3,694461° 2,164954°");
        Parada p26 = new Parada("Predesur", "5,96616° 2,26762°");

        // Creación de arreglos de paradas para cada ruta
        Parada[] paradasRuta01 = {p01, p02, p03, p04, p05, p06};
        Parada[] paradasRuta02 = {p07, p08, p09, p10, p11, p12};
        Parada[] paradasRuta03 = {p13, p14, p15, p16, p05, p06};
        Parada[] paradasRuta04 = {p17, p18, p15, p19, p20, p21};
        Parada[] paradasRuta05 = {p22, p23, p12, p24, p25, p06};
        Parada[] paradasRuta06 = {p26, p07, p08, p12, p23, p06};

        // Creación de arreglo de horarios por parada
        String[] horario7am = {"07:10", "07:15", "07:20", "07:25", "07:30", "07:35", "07:40"};
        String[] horario1pm = {"13:10", "13:15", "13:20", "13:25", "13:30", "13:35", "13:40"};
        String[] horario7pm = {"19:10", "19:15", "19:20", "19:25", "19:30", "19:35", "19:40"};

        // Guardar paradas y horarios en archivos .dat
        obj.guardarParadas(paradasRuta01, "paradasRuta01.dat");
        obj.guardarParadas(paradasRuta02, "paradasRuta02.dat");
        obj.guardarParadas(paradasRuta03, "paradasRuta03.dat");
        obj.guardarParadas(paradasRuta04, "paradasRuta04.dat");
        obj.guardarParadas(paradasRuta05, "paradasRuta05.dat");
        obj.guardarParadas(paradasRuta06, "paradasRuta06.dat");

        obj.guardarHorarios(horario7am, "horario7am.dat");
        obj.guardarHorarios(horario1pm, "horario1pm.dat");
        obj.guardarHorarios(horario7pm, "horario7pm.dat");

        // Leer paradas y horarios desde archivos .dat
        Parada[] paradasRuta01FromFile = obj.leerParadas("paradasRuta01.dat");
        Parada[] paradasRuta02FromFile = obj.leerParadas("paradasRuta02.dat");
        Parada[] paradasRuta03FromFile = obj.leerParadas("paradasRuta03.dat");
        Parada[] paradasRuta04FromFile = obj.leerParadas("paradasRuta04.dat");
        Parada[] paradasRuta05FromFile = obj.leerParadas("paradasRuta05.dat");
        Parada[] paradasRuta06FromFile = obj.leerParadas("paradasRuta06.dat");

        String[] horario7amFromFile = obj.leerHorarios("horario7am.dat");
        String[] horario1pmFromFile = obj.leerHorarios("horario1pm.dat");
        String[] horario7pmFromFile = obj.leerHorarios("horario7pm.dat");

        // Creación de rutas
        Ruta r01 = new Ruta("LINEA 1 - Tebaida", paradasRuta01FromFile);
        Ruta r02 = new Ruta("LINEA 2 - Las Pitas", paradasRuta02FromFile);
        Ruta r03 = new Ruta("LINEA 3 - Puerta de la Ciudad", paradasRuta03FromFile);
        Ruta r04 = new Ruta("LINEA 4 - Estadio", paradasRuta04FromFile);
        Ruta r05 = new Ruta("LINEA 5 - Clodoveo", paradasRuta05FromFile);
        Ruta r06 = new Ruta("LINEA 6 - Zona Milizar", paradasRuta06FromFile);

        // Interfaz de usuario
        
        obj.imprimirMenuPrincipal();
        num = entrada.nextInt();
        switch (num) {
            case 1:
                obj.imprimirInformacionRutas();
                num = entrada.nextInt();
                switch (num) {
                    case 1:
                        obj.imprimirSeleccionarHorario(r01);
                        num = entrada.nextInt();
                        switch (num) {
                            case 1:
                                obj.imprimirParadas(r01, horario7amFromFile);
                                break;
                            case 2:
                                obj.imprimirParadas(r01, horario1pmFromFile);
                                break;
                            case 3:
                                obj.imprimirParadas(r01, horario7pmFromFile);
                                break;
                        }
                        break;
                    case 2:
                        obj.imprimirSeleccionarHorario(r02);
                        num = entrada.nextInt();
                        switch (num) {
                            case 1:
                                obj.imprimirParadas(r02, horario7amFromFile);
                                break;
                            case 2:
                                obj.imprimirParadas(r02, horario1pmFromFile);
                                break;
                            case 3:
                                obj.imprimirParadas(r02, horario7pmFromFile);
                                break;
                        }
                        break;
                    case 3:
                        obj.imprimirSeleccionarHorario(r03);
                        num = entrada.nextInt();
                        switch (num) {
                            case 1:
                                obj.imprimirParadas(r03, horario7amFromFile);
                                break;
                            case 2:
                                obj.imprimirParadas(r03, horario1pmFromFile);
                                break;
                            case 3:
                                obj.imprimirParadas(r03, horario7pmFromFile);
                                break;
                        }
                        break;
                    case 4:
                        obj.imprimirSeleccionarHorario(r04);
                        num = entrada.nextInt();
                        switch (num) {
                            case 1:
                                obj.imprimirParadas(r04, horario7amFromFile);
                                break;
                            case 2:
                                obj.imprimirParadas(r04, horario1pmFromFile);
                                break;
                            case 3:
                                obj.imprimirParadas(r04, horario7pmFromFile);
                                break;
                        }
                        break;
                    case 5:
                        obj.imprimirSeleccionarHorario(r05);
                        num = entrada.nextInt();
                        switch (num) {
                            case 1:
                                obj.imprimirParadas(r05, horario7amFromFile);
                                break;
                            case 2:
                                obj.imprimirParadas(r05, horario1pmFromFile);
                                break;
                            case 3:
                                obj.imprimirParadas(r05, horario7pmFromFile);
                                break;
                        }
                        break;
                    case 6:
                        obj.imprimirSeleccionarHorario(r06);
                        num = entrada.nextInt();
                        switch (num) {
                            case 1:
                                obj.imprimirParadas(r06, horario7amFromFile);
                                break;
                            case 2:
                                obj.imprimirParadas(r06, horario1pmFromFile);
                                break;
                            case 3:
                                obj.imprimirParadas(r06, horario7pmFromFile);
                                break;
                        }
                        break;
                }
                break;
            case 2:
                obj.imprimirRutaOptimizar();
                num = entrada.nextInt();
                switch (num) {
                    case 1:
                        obj.seleccionarParadaOptimizar(r01);
                        num = entrada.nextInt();
                        obj.optimizarParada(r01, num);
                        break;
                    case 2:
                        obj.seleccionarParadaOptimizar(r02);
                        num = entrada.nextInt();
                        obj.optimizarParada(r02, num);
                        break;
                    case 3:
                        obj.seleccionarParadaOptimizar(r03);
                        num = entrada.nextInt();
                        obj.optimizarParada(r03, num);
                        break;
                    case 4:
                        obj.seleccionarParadaOptimizar(r04);
                        num = entrada.nextInt();
                        obj.optimizarParada(r04, num);
                        break;
                    case 5:
                        obj.seleccionarParadaOptimizar(r05);
                        num = entrada.nextInt();
                        obj.optimizarParada(r05, num);
                        break;
                    case 6:
                        obj.seleccionarParadaOptimizar(r06);
                        num = entrada.nextInt();
                        obj.optimizarParada(r06, num);
                        break;
                }
                break;
        }
    }

}
