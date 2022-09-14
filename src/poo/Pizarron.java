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
public class Pizarron {
   private String marca;
   private int tamano;
   private double peso;   
   
   public Pizarron(){};

public Pizarron(int x){
    tamano=x;
};

public void setPizarron(int x){
    this.tamano=x;
}

public String getPizarron(){
    return this.marca;
} 
}
