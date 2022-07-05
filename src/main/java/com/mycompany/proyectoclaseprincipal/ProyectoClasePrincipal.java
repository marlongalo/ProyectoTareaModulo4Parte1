/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectoclaseprincipal;

import Futbolista.Futbolista;

/**
 *Crear una clase de nombre Futbolista en el que se declaren y protejan sus métodos y 
 *propiedades utilizando encapsulamiento, desde la clase que contiene el método principal,
 *establecer y obtener su edad, nombre y equipoActual (Métodos set y get).
 * @author Marlon Galo
 */
public class ProyectoClasePrincipal {

    public static void main(String[] args) {
                
        //Instanciar la clase Futbolista
        Futbolista futbolista = new Futbolista("Diego Fusser","Olimpia");
        futbolista.setedad(21);
        
        
       //Obtener la informacion
       System.out.println("La edad del futbolista es: "+ futbolista.getedad());
       System.out.println("El nombre del futbolista es: " + futbolista.getName());
       futbolista.imprimirequipo();
    }
}
