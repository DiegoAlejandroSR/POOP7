/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author Diego
 */
public class Ballena extends AnimalAcuatico{
    private int largo;

    public Ballena() {
    }

    public Ballena(int largo) {
        this.largo = largo;
    }
   
    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
   
    public void pelearConPinocho(){
        System.out.println("Peleando...");
    }

    /**
     * Metodo comer que se sobrescribio en ballena, esto porque las ballenas comen crill y este es un componente fundamental en su dieta.
     */
   
    @Override
    public void comer() {
        System.out.println("Comiendo Crill");
    }

    @Override
    public String toString() {
        return super.toString() + "Ballena{" + "largo=" + largo + '}';
    }
}
