package proyectoprogramacion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Marcas {
    
    /* Explicación de código:
    Método "ordenar por valor":
    - Recibirá por parámetro el mapa original cargado desde el fichero "puntuaciones.txt"
    - Ordenará dicho mapa en base a valor. Si usásemo las líneas comentadas lo haría conforme a claves o conforme
    a valor en órden inverso.
    - Se crea la lista "lista" que almacena los elementos del mapa original (pasado por parámetro)
    - Se ordena la lista. En este caso por valor ascendente
    - Se crea un nuevo mapa (mapaOrdenado)
    - Se ejecuta un bucle que inicializa dicho mapa con los valores obtenidos desde la anterior lista
    - Se devuelve el mapa ordenado
    
    Método leer puntuaciones:
    El objetivo del método es convertir el contenido del mapa ordenado, generador por el método "ordenarPorValor",
    en un objeto de la clase String, el cual ya podrá ser imprimido en la caja de texto del marco Estadistica
    - Se crea un nuevo mapa "mapaSorted"
    - Se inicializa el mapa creado con el mapa generado por el método "ordenarPorValor". De esta manera ya tendremos un
    mapa ordenado con el que trabajar.
    - Mediante un objeto StringBuilder y un bucle convertimos el mapa "mapaSorted" en una cadena "cadenaOrdenado"
    - Devolvemos la cadena creada.
    */

    public static Map<String, Double> ordenarPorValor(Map<String, Double> mapa) {
        List<Map.Entry<String, Double>> lista = new ArrayList<>(mapa.entrySet());
        //lista.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        //lista.sort(Map.Entry.comparingByValue());
        lista.sort(Map.Entry.comparingByValue());
        Map<String, Double> mapaOrdenado = new LinkedHashMap<>();
        for (Map.Entry<String, Double> entry : lista) {
            mapaOrdenado.put(entry.getKey(), entry.getValue());
        }
        return mapaOrdenado;
    }
    
    public static String LeerPuntuacionesOrdenado() {
        Map<String, Double> mapaSorted = ordenarPorValor(Puntuaciones.getListaPuntuaciones());

        StringBuilder cadenaOrdenado = new StringBuilder();
        for (Map.Entry<String, Double> entry : mapaSorted.entrySet()) {
            cadenaOrdenado.append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue())
                    .append("\n");
        }

        return cadenaOrdenado.toString();
    }

}
