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
public class Gorra {  
   private String marca;
   private int tamano;
   private double peso;
   
public Gorra(){};

public Gorra(int x){
    tamano=x;
};

public void setGorra(int x){
    this.tamano=x;
}

public String getGorra(){
    return this.marca;
} 

}
