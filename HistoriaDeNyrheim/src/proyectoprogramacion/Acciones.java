package proyectoprogramacion;

import javax.swing.JOptionPane;
import proyectoprogramacion.Enumerados.Dificultad;
import proyectoprogramacion.Enumerados.Tipo;
import proyectoprogramacion.Marcos.MarcosDesafios.CuatroOpciones;
import proyectoprogramacion.Marcos.MarcosUbicación.GameOver;
import proyectoprogramacion.Marcos.MarcosUbicación.YouWin;
import proyectoprogramacion.Personajes.Elfo;
import proyectoprogramacion.Personajes.Espectro;
import proyectoprogramacion.Personajes.Orco;
import proyectoprogramacion.Personajes.Personaje;
import proyectoprogramacion.Personajes.Villano;

public class Acciones {

    // Creación y devolución de objetos des juego
    Villano dragon = new Villano(200);
    Villano onis = new Villano(200);
    Villano sirena = new Villano(300);

    public Personaje defineHeroe(Tipo tip) { // Ejemplo de polimorfimo. Crea un objeyo de "Personaje que utiliza las variantes de
        // métodos de la clase hija
        Personaje per = null;
        Tipo tipo = tip;
        switch (tipo) {
            case ORCO:
                per = new Orco();
                break;
            case ELFO:
                per = new Elfo();
                break;
            case ESPECTRO:
                per = new Espectro();
                break;
            default:
        }
        return per;
    }

    public Villano getDragon() {
        return dragon;
    }

    public Villano getOnis() {
        return onis;
    }

    public Villano getSirena() {
        return sirena;
    }

    /* Comprueba si la respuesta introducida es correcta. Esto ocurre si los valores pasados por parámetro coinciden. 
    En tal caso genera una acción sobre las propiedades. La opción "0" no realiza acción alguna*/
    public void compruebaAcierto(int opcion, int acierto, int destinoAcierto, int destinoFallo) {
        int destinoFinal;
        if (opcion == acierto) {
            destinoFinal = destinoAcierto;
        } else {
            destinoFinal = destinoFallo;
        }

        switch (destinoFinal) {
            // destinos de perdida de vida
            case 0:
                // No pasa nada
                break;
            case 1:
                // El héroe pierde 1500 de vida
                Personaje p = defineHeroe(Personaje.getTipo());
                pierdeVidaHeroe(1500, p);
                break;
            case 2:
                // Pierde vida dragon
                pierdeVidaVillano(dragon, defineHeroe(Personaje.getTipo()));
                break;
            case 3:
                // Pierde vida onis
                pierdeVidaVillano(onis, defineHeroe(Personaje.getTipo()));
                break;
            case 4:
                // Pierde vida sirena
                pierdeVidaVillano(sirena, defineHeroe(Personaje.getTipo()));
                break;
            case 5:
                // El héroe gana 1500 de vida
                ganaVidaHeroe(1500);
                break;
            case 6:
                // Gana 2000 monedas el héroe
                ganaDinero(2000);
                break;
            case 7:
                // pierde 1000 monedas el héroe
                if (Personaje.getDinero() < 1000) {
                    pierdeVidaHeroe(1500, defineHeroe(Personaje.getTipo()));
                } else {
                    pierdeDinero(1000);
                }
                break;
            case 8:
                // Juegas a piedra, papel, o tijeras con leprechaun
                juegoAzar(3, 2000, 1000);
                break;
            case 9:
                // luchas sumo contra kappa
                juegoAzar(2, 2000, 2000);
                break;
            default:
        }
    }

    public void ganaVidaHeroe(double vida) {
        double life = Personaje.getVidaHeroe() + vida;
        Personaje.setVidaHeroe(life);
    }

    public void pierdeVidaHeroe(double ataqueEnemigo, Personaje p) {
        double defense = defineHeroe(Personaje.getTipo()).getDefensaFinalHeroe();
        double life = Personaje.getVidaHeroe() - ataqueEnemigo + defense;
        Personaje.setVidaHeroe(life);
    }

    public void ganaDinero(double importe) {
        double dinero = Personaje.getDinero() + importe;
        Personaje.setDinero(dinero);
    }

    public void pierdeDinero(double importe) {
        double dinero = Personaje.getDinero() - importe;
        Personaje.setDinero(dinero);
    }

    public void pierdeVidaVillano(Villano vil, Personaje p) {
        vil.setVidaEnemigo(vil.getVidaEnemigo() - p.getAtaqueFinalHeroe());
    }

    public void juegoAzar(int probabilidad, double ganado, double perdido) { // Juego de apuesta de dinero
        int res = (int) (Math.random() * probabilidad) + 1;
        if (res == 1) {
            ganaDinero(ganado);
        } else {
            pierdeDinero(perdido);
        }
    }
}
