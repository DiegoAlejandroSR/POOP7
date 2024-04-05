/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author Diego
 */
public class Animal {
      private String nombre, lugarOrigen, color;

    public Animal() {
    }
   
    /**
     * @param nombre, atributo para nombrar a un animal
     * @param lugarOrigen, atributo para asignar el lugar de procedencia
     * @param color, atributo para asignar color del animal
     */
   
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void sonido(String sonido){
        System.out.println(sonido);
    }
   
    public void comer(){
        System.out.println("Estoy comiendo");
    }
   
    @Override
    public String toString() {
        return super.toString() + "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
}
    
