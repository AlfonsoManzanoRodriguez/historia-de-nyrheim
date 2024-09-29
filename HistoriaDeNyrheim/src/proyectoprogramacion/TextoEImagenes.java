package proyectoprogramacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import proyectoprogramacion.Enumerados.Tipo;
import proyectoprogramacion.Personajes.Personaje;
import proyectoprogramacion.Acciones;

public class TextoEImagenes {

    // Acciones acc = new Acciones();
    // Generación de textos desde fichero:
    public static String cargaTexto(int numTexto) { // Pasamos el numero de texto por parámetro 
        // y nos devuelve un String con el contenido del texto deseado

        String texto = "";
        String tituloTexto;

        // Seleccionamos el numero de texto. Estos son los textos almacenados en ficheros
        switch (numTexto) {
            case 1:
                tituloTexto = "Texto/1_historiaNyrheim1.txt";

                break;
            case 2:
                tituloTexto = "Texto/2_historiaNyrheim2.txt";
                break;
            case 3:
                tituloTexto = "Texto/3_historiaNyrheim3.txt";
                break;
            case 4:
                tituloTexto = "Texto/4_historiaNyrheim4.txt";
                break;
            case 5:
                tituloTexto = "Texto/5_licantropo.txt";
                break;
            case 6:
                tituloTexto = "Texto/6_leprechaun.txt";
                break;
            case 7:
                tituloTexto = "Texto/7_ninfa.txt";
                break;
            case 8:
                tituloTexto = "Texto/8_dragón.txt";
                break;
            case 9:
                tituloTexto = "Texto/9_namahage.txt";
                break;
            case 10:
                tituloTexto = "Texto/10_ogama.txt";
                break;
            case 11:
                tituloTexto = "Texto/11_kappa.txt";
                break;
            case 12:
                tituloTexto = "Texto/12_Onis.txt";
                break;
            case 13:
                tituloTexto = "Texto/13_barquero.txt";
                break;
            case 14:
                tituloTexto = "Texto/14_hipocampo.txt";
                break;
            case 15:
                tituloTexto = "Texto/15_megalodon.txt";
                break;
            case 16:
                tituloTexto = "Texto/16_sirena.txt";
                break;
            default:
                tituloTexto = "";
                break;
        }

        try {
            FileReader entrada = new FileReader(tituloTexto);
            while (entrada.ready()) {
                texto = texto + (char) entrada.read();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se ha podido abrir el fichero: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido abrir el fichero: ");
        } catch (IOException e) {
            System.out.println("Se ha producido un error en la lectura: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Se ha producido un error en la lectura: ");
        }

        return texto;
    }

    // Impresión de la caja de elección del personaje
    public String describeArma(Personaje p, Acciones ac) { // Ayuda a defnimir la caja de texto de la elección del personaje
        p = ac.defineHeroe(Personaje.getTipo());
        Personaje perOrco = ac.defineHeroe(Tipo.ORCO);
        Personaje perElfo = ac.defineHeroe(Tipo.ELFO);
        Personaje perEspectro = ac.defineHeroe(Tipo.ESPECTRO);
        String arma = null;
        if (p.equals(perOrco)) {
            arma = "Escudo forja élfica";
        } else if (p.equals(perElfo)) {
            arma = "Flechas envenenadas";
        } else if (p.equals(perEspectro)) {
            arma = "Amuleto encantado";
        }
        return arma;
    }

    public String describeHeroe(Personaje p, Acciones ac) { // Ayuda a defnimir la caja de texto de la elección del personaje
        p = ac.defineHeroe(Personaje.getTipo());
        Personaje perOrco = ac.defineHeroe(Tipo.ORCO);
        Personaje perElfo = ac.defineHeroe(Tipo.ELFO);
        Personaje perEspectro = ac.defineHeroe(Tipo.ESPECTRO);
        String heroe = null;
        if (p.equals(perOrco)) {
            heroe = "Escudo forja élfica";
        } else if (p.equals(perElfo)) {
            heroe = "Flechas envenenadas";
        } else if (p.equals(perEspectro)) {
            heroe = "Amuleto encantado";
        }
        return heroe;
    }

    // Impresión de propiedades en EligePersonaje: Este texto debe aparecer en la caja de textos del marco "eligePersonaje"
    public String caracteristicasHeroe(Personaje p, Acciones acc) {
        String caracteristicas = null;
        // Definimos arma especial
        String arma = describeArma(p, acc);

        // Definimos Descripción
        String descripcion = describeArma(p, acc);

        // Definimos dificultad
        int selDificultad = Personaje.getDificultad();
        String dificultad = "Dificultad media";

        switch (selDificultad) {
            case 1:
                dificultad = "Modo fácil";
                break;
            case 2:
                dificultad = "Dificultad media";
                break;
            case 3:
                dificultad = "Modo dificil";
                break;
            default:

        }
        //caracteristicas = "" + p.getAtaqueHeroe() + tip;
        caracteristicas = "Dificultad: " + dificultad + "\n"
                + "Personaje: " + Personaje.getTipo() + "\n"
                + "Vida: " + (int) Personaje.getVidaHeroe() + "\n"
                + "Dinero inicial: " + (int) Personaje.getDinero() + "\n"
                + "Ataque mínimo: " + 10 * ((int) p.getAtaqueHeroe() + (int) p.getSuerteHeroe()) + "\n"
                + "Defensa mínimo: " + 10 * ((int) p.getDefensaHeroe() + (int) p.getSuerteHeroe()) + "\n"
                + "Ataque máximo: " + 15 * ((int) p.getAtaqueHeroe() + (int) p.getSuerteHeroe()) + "\n"
                + "Defensa máximo: " + 15 * ((int) p.getDefensaHeroe() + (int) p.getSuerteHeroe()) + "\n"
                + "Suerte " + (int) p.getSuerteHeroe() + "\n"
                + "-------------------------- " + "\n"
                + "Vida dragón:" + (int) acc.getDragon().getVidaEnemigo() + "\n"
                + "Vida onis:" + (int) acc.getOnis().getVidaEnemigo() + "\n"
                + "Vida sirena:" + (int) acc.getSirena().getVidaEnemigo() + "\n";
        return caracteristicas;
    }

    // Impresión de propiedades en el trancurso de la partida: Este texto debe aparecer en la caja del marco "Aldea"
    public String caracteristicasAldea(Personaje p, Acciones acc) {
        String caracteristicas = null;

        // Definimos si conseguimos el amrma especial
        String escudo, flechas, amuleto; // Variables que determinan las armas consegidas

        if (Personaje.isMejoradoEscudo()) {
            escudo = "Adquirido escudo de forja élfica";
        } else {
            escudo = "Deberías comprar un escudo";
        }

        if (Personaje.isMejoradoFlechas()) {
            flechas = "Adquirido flechas envenenadas";
        } else {
            flechas = "Deberías comprar flechas envenenadas";
        }

        if (Personaje.isMejoradoAmuleto()) {
            amuleto = "Adquirido amuleto encantado";
        } else {
            amuleto = "Deberías comprar un un amuleto encantado";
        }

        caracteristicas = "Vida heroe: " + Personaje.getVidaHeroe() + "\n"
                + "Dinero actual: " + (int) Personaje.getDinero() + "\n"
                + "Escudo de forja élfica: " + escudo + "\n"
                + "Flechas envenenadas: " + flechas + "\n"
                + "Amuleto encantado: " + amuleto + "\n"
                + "Vida dragon:" + (int) acc.getDragon().getVidaEnemigo() + "\n"
                + "Vida onis:" + (int) acc.getOnis().getVidaEnemigo() + "\n"
                + "Vida sirena:" + (int) acc.getSirena().getVidaEnemigo() + "\n"
                + "----------------------------------" + "\n"
                + "Escoje la ruta deseada para enfrentar a tus enemigo o adquiere tu arma especial para tener mayores posibilidades" + "\n";
        return caracteristicas;
    }

    // Imprime la vida en la caja durante los desafíos
    public String caracteristicasVida() {
        String caracteristicas = null;
        caracteristicas = "Vida actual: " + (int) Personaje.getVidaHeroe() + "\n";
        return caracteristicas;
    }

    // Imprime la vida en la caja durante los desafíos
    public String caracteristicasDinero() {
        String caracteristicas = null;
        caracteristicas = "Dinero actual: " + (int) Personaje.getDinero() + "\n";
        return caracteristicas;
    }

    // Generación de imágenes:
    public static String cargaImagen(int numTexto) { // Pasamos el numero de una imagen por parámetro 
        // y nos devuelve un String con la ruta de la imagen deseada
        String rutaImagen = "";

        switch (numTexto) {
            case 6:
                rutaImagen = "/Imagenes/6_cuerpoOrco.png";
                break;
            case 8:
                rutaImagen = "/Imagenes/8_cuerpoElfo.png";
                break;
            case 9:
                rutaImagen = "/Imagenes/9_cara_espectro.png";
            case 10:
                rutaImagen = "/Imagenes/10_cuerpo_espectro.png";
                break;
            case 11:
                rutaImagen = "/Imagenes/11_mapa.png";
                break;
            case 12:
                rutaImagen = "/Imagenes/12_licantropo.png";
                break;
            case 13:
                rutaImagen = "/Imagenes/13_leprechaun.png";
                break;
            case 14:
                rutaImagen = "/Imagenes/14_ninfa.png";
                break;
            case 15:
                rutaImagen = "/Imagenes/15_dragon.png";
                break;
            case 16:
                rutaImagen = "/Imagenes/16_orcoHuyeDragon.png";
                break;
            case 17:
                rutaImagen = "/Imagenes/17_elfoHuyeDragon.png";
                break;
            case 18:
                rutaImagen = "/Imagenes/18_EspectroYuyeDragon.png";
                break;
            case 19:
                rutaImagen = "/Imagenes/19_namahage.png";
                break;
            case 20:
                rutaImagen = "/Imagenes/20_ogama.png";
                break;
            case 21:
                rutaImagen = "/Imagenes/21_kappa.png";
                break;
            case 22:
                rutaImagen = "/Imagenes/22_orcoHuyeOnis.png";
                break;
            case 23:
                rutaImagen = "/Imagenes/23_onis.png";
                break;
            case 24:
                rutaImagen = "/Imagenes/24_elfoHuyeOnis.png";
                break;
            case 25:
                rutaImagen = "/Imagenes/25_barquero.png";
                break;
            case 26:
                rutaImagen = "/Imagenes/26_espectroHuyeOnis.png";
                break;
            case 27:
                rutaImagen = "/Imagenes/27_hipocampo.png";
                break;
            case 28:
                rutaImagen = "/Imagenes/28_megalodon.png";
                break;
            case 29:
                rutaImagen = "/Imagenes/29_sirena.png";
                break;
            case 30:
                rutaImagen = "/Imagenes/30_elfoHuyeSirena.png";
                break;
            case 31:
                rutaImagen = "/Imagenes/31_orcoHuyeSirena.png";
                break;
            case 32:
                rutaImagen = "/Imagenes/32espectroHuyeSirena.png";
                break;
            case 33:
                rutaImagen = "/Imagenes/33_cabezaDragon.png";
                break;
            case 34:
                rutaImagen = "/Imagenes/34_cabezaOnis.png";
                break;
            case 35:
                rutaImagen = "/Imagenes/35_cabezaSirena.png";
                break;
            default:
                rutaImagen = "";
                break;
        }
        return rutaImagen;
    }
}
