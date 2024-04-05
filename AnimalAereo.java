/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author Diego
 */
public class AnimalAereo extends Animal{
    private int numeroAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
   
    public void volar(){
        System.out.println("Estoy volando");
    }
   
    @Override
    public void comer(){
        System.out.println("Comiendo bien");
    }

    @Override
    public String toString() {
        return super.toString() + "AnimalAereo{" + "numeroAlas=" + numeroAlas + '}';
    }
   
}
