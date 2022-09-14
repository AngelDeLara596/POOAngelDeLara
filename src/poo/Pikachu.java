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
public class Pikachu {
   private String marca;
   private int tamano;
   private double peso;    
   
   public Pikachu(){};

public Pikachu(int x){
    tamano=x;
};

public void setPikachu(int x){
    this.tamano=x;
}

public String getPikachu(){
    return this.marca;
} 
}
