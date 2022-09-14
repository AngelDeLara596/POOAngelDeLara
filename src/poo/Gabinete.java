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
public class Gabinete {
   private String marca;
   private int tamano;
   private double peso;
   
public Gabinete(){};

public Gabinete(int x){
    tamano=x;
};

public void setGabinete(int x){
    this.tamano=x;
}

public String getGabinete(){
    return this.marca;
} 

}