/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion.Personajes;

/**
 *
 * @author alfon
 */
public class Villano {

    private double vidaEnemigo; // Sólo Serán usadas por los enemigos en su constructor

    public Villano(double vidaEnemigo) {
        this.vidaEnemigo = vidaEnemigo;
    }

    public double getVidaEnemigo() {
        return vidaEnemigo;
    }

    public void setVidaEnemigo(double vidaEnemigo) {
        this.vidaEnemigo = vidaEnemigo;
    }

   

}
