package proyectoprogramacion.Personajes;

import proyectoprogramacion.Enumerados.Dificultad;
import proyectoprogramacion.Enumerados.Tipo;

public abstract class Personaje {

    // Propiedades:
    protected static double vidaHeroe = 5000;
    /* La vida será fijada en 1000 para todos los personajes.
    Es la propiedad más importante, ya que define si ganas el juego (acabas con la vida de los villanos) o lo pierdes (tu vida llega 0)*/

    // Exclusivos de héroes: No se definirán en el constructor
    protected static double dinero = 0; // El dinero sólo será usado por los héroes y será igual para los tres, inicialmente
    protected static boolean mejoradoEscudo = false;
    protected static boolean mejoradoFlechas = false;
    protected static boolean mejoradoAmuleto = false;

    protected static Tipo tipo = Tipo.ORCO; // "tipo" define el personaje elegido y se define como enumerado (Tipo).

    protected static int dificultad = 2; // Se define cuando configuras la partida y no se modifica durante toda la partida
    protected static int azar = (int) (Math.random() * 6) + 10; // Establece el factor azaroso del juego, de modo que hay partidas 
    // más dificiles que otras, en función de tu suerte

    protected static int objetoHeroe = 1;

    public Personaje() {
    }

    public int getObjetoHeroe() {
        return objetoHeroe;
    }

    public static double getVidaHeroe() {
        return vidaHeroe;
    }

    public static double getDinero() {
        return dinero;
    }

    public static boolean isMejoradoEscudo() {
        return mejoradoEscudo;
    }

    public static boolean isMejoradoFlechas() {
        return mejoradoFlechas;
    }

    public static boolean isMejoradoAmuleto() {
        return mejoradoAmuleto;
    }

    public static Tipo getTipo() {
        return tipo;
    }

    public static int getDificultad() {
        return dificultad;
    }

    public static void setVidaHeroe(double vidaHeroe) {
        Personaje.vidaHeroe = vidaHeroe;
    }

    public static void setDinero(double dinero) {
        Personaje.dinero = dinero;
    }

    public static void setTipo(Tipo tipo) {
        Personaje.tipo = tipo;
    }

    public static void setMejoradoEscudo(boolean mejoradoEscudo) {
        Personaje.mejoradoEscudo = mejoradoEscudo;
    }

    public static void setMejoradoFlechas(boolean mejoradoFlechas) {
        Personaje.mejoradoFlechas = mejoradoFlechas;
    }

    public static void setMejoradoAmuleto(boolean mejoradoAmuleto) {
        Personaje.mejoradoAmuleto = mejoradoAmuleto;
    }

    // Métodos abstractos:
    // Definen el poder atacante y defensivo de los héroes
    public abstract double getAtaqueHeroe();

    public abstract double getDefensaHeroe();

    public abstract double getSuerteHeroe();

    // Definición de la dificultad del juego:
    public static void setDificultad(Dificultad dif) {
        switch (dif) {
            case FACIL:
                dificultad = 1;
                break;
            case MEDIA:
                dificultad = 2;
                break;
            case DIFICIL:
                dificultad = 3;
                break;
            default:
        }
    }

    // Métodos elaborados:
    /* Los siguientes métodos se valen de los anteriores. Su objetivo es definir la potencia de ataque y defensa, lo cualrestará vida
    La partida finalizará:
    - Con tu victoria: Reduces a "0" la propiedad vida del objeto dragon, onis y sirena.
    - Con tu derrota: Reduces a "0" la propiedad vida del objeto Orco, elfo o espectro; es decir, tu personaje elegido.
     */
    public double getAtaqueFinalHeroe() {

        double incrementoEscudo = 1, incrementoFlechas = 1, incrementoAmuleto = 1;

        if (mejoradoEscudo) {
            incrementoEscudo = 1.33;
        }

        if (mejoradoFlechas) {
            incrementoFlechas = 1.33;
        }

        if (mejoradoAmuleto) {
            incrementoAmuleto = 1.33;
        }

        return (int) getDificultad() * incrementoEscudo * incrementoFlechas * incrementoAmuleto * (getAtaqueHeroe() + getSuerteHeroe());
    }

    public double getDefensaFinalHeroe() {

        double incrementoEscudo = 1, incrementoFlechas = 1, incrementoAmuleto = 1;

        if (mejoradoEscudo) {
            incrementoEscudo = 1.33;
        }

        if (mejoradoFlechas) {
            incrementoFlechas = 1.33;
        }

        if (mejoradoAmuleto) {
            incrementoAmuleto = 1.33;
        }

        return (int) getDificultad() * incrementoEscudo * incrementoFlechas * incrementoAmuleto * (getAtaqueHeroe() + getSuerteHeroe());
    }
}
