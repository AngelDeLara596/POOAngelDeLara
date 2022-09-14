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
public class SucioDan {
   private String marca;
   private int tamano;
   private double peso;
   
   public SucioDan(){};

public SucioDan(int x){
    tamano=x;
};
public void setSucioDan(int x){
    this.tamano=x;
}

public String getSucioDan(){
    return this.marca;
} 
}
