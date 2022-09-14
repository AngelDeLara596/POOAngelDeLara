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
public class Monitor {
    private String marca;
   private int tamano;
   private double peso;

public Monitor(){};

public Monitor(int x){
    tamano=x;
}
public void setMonitor(int x){
    this.tamano=x;
}

public String getMonitor(){
    return this.marca;
} 
}
