package proyectoprogramacion.Personajes;

import proyectoprogramacion.Enumerados.Tipo;

public class Orco extends Personaje {

    private boolean escudoMejorado = false; // Es la bandera que activará a "true" la bandera "mejorado".

    @Override
    public double getAtaqueHeroe() {
        return 50;
    }

    @Override
    public double getDefensaHeroe() {
        return 100;
    }

    @Override
    public double getSuerteHeroe() {
        return 0;
    }
    
    

}
