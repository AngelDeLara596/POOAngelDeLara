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
public class Llave {
       private String marca;
   private int tamano;
   private double peso;
   
   public Llave(){};

public Llave(int x){
    tamano=x;
};

public void setLlave(int x){
    this.tamano=x;
}

public String getLlave(){
    return this.marca;
} 

}
