package proyectoprogramacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Acceso { // Clase para gestionar el acceso a la partida

    private static final String REGISTRO = "registro.txt";
    private static Map<String, String> listaUsuarios = new HashMap(); // Generamos un mapa para almacenar usuarios y sus contraseña
    private static String jugadorEnCurso = "";

    public static String getJugadorEnCurso() { // Marca el nombre del jugador que está jugando
        return jugadorEnCurso;
    }

    public static void setJugadorEnCurso(String jugadorEnCurso) {
        Acceso.jugadorEnCurso = jugadorEnCurso;
    }

    public static void cargarMap() { // Pasa el contenido del fichero hacia el Map
        try ( BufferedReader entrada = new BufferedReader(new FileReader(REGISTRO))) {
            String linea;
            while ((linea = entrada.readLine()) != null) {
                String[] arrayNuevoUsuario = linea.split(",");
                listaUsuarios.put(arrayNuevoUsuario[0], arrayNuevoUsuario[1]);
            }
            entrada.close();
        } catch (IOException e) {
            System.err.println("No se pudieron cargar en el mapa correctamente" + e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudieron cargar en el mapa correctamente");
        }
    }

    // El siguiente método no es utilizado. Se mantien como apoyo al desarrollo
    /*public static void muestraMapa() {
        for (Map.Entry<String, String> entry : listaUsuarios.entrySet()) {
            System.out.println(entry.getKey() +entry.getValue());
        }
    }*/
    public static void agregarUsuarioMap(String nick, String contrasenia) { // Carga un nuevo usuario en el Map
        if (listaUsuarios.containsKey(nick)) {
        } else {
            listaUsuarios.put(nick, contrasenia);
        }
    }

    public static void eliminarUsuario(String nick, String contrasenia) { // Elimina un usuario del Map
        listaUsuarios.remove(nick);
    }

    public static void guardarUsuarios() { // Guarda todos los usuarios del Map en el fichero
        try ( BufferedWriter entrada = new BufferedWriter(new FileWriter(REGISTRO))) {
            for (Map.Entry<String, String> entry : listaUsuarios.entrySet()) {
                entrada.write(entry.getKey() + "," + entry.getValue());
                entrada.newLine();
            }
            entrada.close();
        } catch (IOException e) {
            System.err.println("Error al guardar usuarios" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar usuarios");
        }
    }

    // Comprueba si el nick se corresponde con la contraseña
    public static boolean autentica(String nick, String contrasenia) { // Devuelve true si hay correspondencia
        return listaUsuarios.get(nick).equals(contrasenia);
    }

    // Comprueba si hay un nick repetido en el Map
    public static boolean compruebaNick(String nick) { // Devuelve true si hay repeticion de nicks
        return listaUsuarios.containsKey(nick);
    }

    // Comprueba si coinciden la contraseña ingresada y el repite contraseña
    public static boolean ambasContrasenias(String contrasenia1, String contrasenia2) {// Devuelve true si hay repeticion de contraseñas
        return contrasenia1.equals(contrasenia2);
    }

    // Correcto si cumple las condiciones de contraseña segura
    public static boolean contraseniaSegura(String contrasenia) {
        boolean correcta = true;
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < contrasenia.length(); i++) {
            char caracter = contrasenia.charAt(i);
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            }
        }

        if (contrasenia.length() < 8 || contrasenia.length() > 15 || mayusculas < 2 || minusculas < 2 || numeros < 1) {
            correcta = false;
        }
        return correcta;
    }
}
