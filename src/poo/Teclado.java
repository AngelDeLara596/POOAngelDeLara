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
public class Teclado {
   private String marca;
   private int tamano;
   private double peso;
   
   public Teclado(){};

public Teclado(int x){
    tamano=x;
};
public void setTeclado(int x){
    this.tamano=x;
}

public String getTeclado(){
    return this.marca;
} 
}
