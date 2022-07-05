/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Futbolista;

/**
 *Crear una clase de nombre Futbolista en el que se declaren y protejan sus métodos y 
 *propiedades utilizando encapsulamiento, desde la clase que contiene el método principal,
 *establecer y obtener su edad, nombre y equipoActual (Métodos set y get).
 * @author Marlon Galo
 */
public final class Futbolista {
    
    //Propiedades de las variables miembro
    public int edad;
    public String name;
    private String equipo;
    
    //Constructor por defecto
    public Futbolista(){
        
    }
    
    //Constructor personalizado
    public Futbolista(String name, String equipo){
        this.setName(name);
        this.equipo= equipo;
    }
    
  
    //Metodos para establecer
    public void setedad(int _edad){
        this.edad = _edad;
    }
    public void setName(String _name){
        this.name = _name;
    }
    
    //Obtener la informacion del futbolista
    public int getedad(){
        return edad;
    }
    
    public String getName(){
        return name;
    }
    
    //Encapsulamiento para obtener la informacion del futbolista
    public void imprimirequipo() {
        System.out.println("Juega en la liga Nacional de Honduras, en el equipo: " +equipo);
        }
  
    }
