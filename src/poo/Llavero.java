/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Alumno
 */
public class Llavero {
   private String marca;
   private int tamano;
   private double peso;
   
   public Llavero(){};

public Llavero(int x){
    tamano=x;
};

public void setLlavero(int x){
    this.tamano=x;
}

public String getLlavero(){
    return this.marca;
} 
}
