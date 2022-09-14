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
public class Mouse {
    private String marca;
   private int tamano;
   private double peso;   
   
   public Mouse(){};

public Mouse(int x){
    tamano=x;
};
public void setMouse(int x){
    this.tamano=x;
}

public String getMouse(){
    return this.marca;
} 
}
