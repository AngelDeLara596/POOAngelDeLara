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
public class Pantalon {
   private String marca;
   private int tamano;
   private double peso;   
   
   public Pantalon(){};

public Pantalon(int x){
    tamano=x;
};
public void setPantalon(int x){
    this.tamano=x;
}

public String getPantalon(){
    return this.marca;
} 
}
