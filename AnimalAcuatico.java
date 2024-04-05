/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author Diego
 */
public class AnimalAcuatico extends Animal{
    private int numeroAletas;

    public AnimalAcuatico() {
    }

    public AnimalAcuatico(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
   
    public AnimalAcuatico (int numeroAletas, String nombre, String lugarOrigen, String color){
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }

    public int getNumeroAletas() {
        return numeroAletas;
    }

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
   
    public void nadar(){
        System.out.println("Nadaremos nadaremos en el mar");
    }
   
    /**
     * Sobreescritura del metodo comer
     */
    @Override
    public void comer(){
        System.out.println("Comiendo");
    }

    @Override
    public String toString() {
        return super.toString() + "AnimalAcuatico{" + "numeroAletas=" + numeroAletas + '}';
    }
}
