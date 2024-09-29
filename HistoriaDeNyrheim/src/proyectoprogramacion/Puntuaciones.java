package proyectoprogramacion;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JOptionPane;
import proyectoprogramacion.Marcos.MarcosAcceso.Estadisticas;

public class Puntuaciones { // Esta clase se enfoca en la creación de un registro de puntuaciones

    private static final String SCORES = "puntuaciones.txt"; // Fichero de almacenamiento de puntuaciones

    public static Map<String, Double> getListaPuntuaciones() {
        return listaPuntuaciones;
    }

    
    // Creamos mapa que almacena el fichero de puntucionoes
    private static Map<String, Double> listaPuntuaciones = new HashMap<>(); // Generamos un mapa para almacenar puntuaciones y usuarios de partidas ganadas
    Estadisticas est = new Estadisticas();

    // Cargamos los datos del fichero en el mapa creado anteriormente
    public static void cargarMap() { // Pasa el contenido del fichero hacia el Map
        try ( BufferedReader entrada = new BufferedReader(new FileReader(SCORES))) {
            String linea;
            while ((linea = entrada.readLine()) != null) {
                String[] arrayNuevoUsuario = linea.split(",");
                if (arrayNuevoUsuario.length == 2) {
                    String nick = arrayNuevoUsuario[0];
                    double puntuacion = Double.parseDouble(arrayNuevoUsuario[1]);
                    listaPuntuaciones.put(nick, puntuacion);
                }
            }
        } catch (IOException e) {
            System.err.println("No se pudieron cargar en el mapa correctamente: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudieron cargar en el mapa correctamente: ");
        }
    }

    // Se crea una lista con las claves del mapa, la cual utilizaremos para su posterior ordenamiento
    public static ArrayList<String> ordenarMarcas(Map<String, Double> listaMarcas) {
        ArrayList<String> marcas = new ArrayList<>();
        Iterator<Map.Entry<String, Double>> it = listaMarcas.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Double> entrada = it.next();
            marcas.add(entrada.getKey());
        }

        Collections.sort(marcas);

        return marcas;
    }

    // Generamos un nuevo mapa ordenado por claves conforme ayudandonos del método "ordenarMarcas()"
    public static Map<String, Double> generarMapaOrdenado(Map<String, Double> mapa, ArrayList<String> marcasOrdenadas) {
        Map<String, Double> listadoOrdenado = new LinkedHashMap<>();

        for (String clave : marcasOrdenadas) {
            listadoOrdenado.put(clave, mapa.get(clave));
        }

        return listadoOrdenado;
    }

    // Cargamos el contenido del mapa original (listaPuntuaciones) en un String
    public static String leerPuntuaciones() { // Guarda en un String el contenido del fichero
        StringBuilder contenido = new StringBuilder();
        try ( BufferedReader entrada = new BufferedReader(new FileReader(SCORES))) {
            String linea;
            while ((linea = entrada.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error al leer puntuaciones" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al leer puntuaciones");
        }
        return contenido.toString();
    }

    // Cargamos el contenido del ordenado (listaPuntuaciones) en un String
    public static String leerPuntuacionesOrdenadasNombre() {
        ArrayList<String> marcasFinales = ordenarMarcas(listaPuntuaciones);
        StringBuilder resultado = new StringBuilder();
        for (String clave : marcasFinales) {
            
            resultado.append(clave).append(" : ").append(listaPuntuaciones.get(clave)).append("\n");
        }
        return resultado.toString();
    }

    // Cargamos el valor más alto del mapa original (listaPuntuaciones) en un entero
    public static int puntuacionMasAlta() {

        double maxValor = Double.MIN_VALUE;

        for (Double valor : listaPuntuaciones.values()) {
            if (valor > maxValor) {
                maxValor = valor;
            }
        }

        return (int) maxValor;
    }

    /* Añadimos muevos elementos al mapa original, cargado desde el fichero. Como nick pasaremos la 
    propiedad "jugadorEnCurso" (Acceso) y como puntuación pasamos la propiedad "vidaHeroe (Personaje) */
    public static void agregarElemento(String nick, double puntuacion) { // Añade una nueva puntuación al registro
        listaPuntuaciones.put(nick, puntuacion);
    }

    // Una vez agregado el nuevo elemento procedemos a guardar el mapa modificado de nuevo en el fichero
    public static void guardarPuntuaciones() { // Guarda todos los usuarios del Map en el fichero
        try ( BufferedWriter entrada = new BufferedWriter(new FileWriter(SCORES))) {
            for (Map.Entry<String, Double> entry : listaPuntuaciones.entrySet()) {
                entrada.write(entry.getKey() + "," + entry.getValue());
                entrada.newLine();
            }
            entrada.close();
        } catch (IOException e) {
            System.err.println("Error al guardar usuarios " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar usuarios ");
        }
    }

}
