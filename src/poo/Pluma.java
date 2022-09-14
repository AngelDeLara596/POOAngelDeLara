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
public class Pluma {
   private String marca;
   private int tamano;
   private double peso;
   
   public Pluma(){};

public Pluma(int x){
    tamano=x;
};
public void setPluma(int x){
    this.tamano=x;
}

public String getPluma(){
    return this.marca;
} 
}
