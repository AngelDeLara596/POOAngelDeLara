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
public class TarjetaDeVideo {
    private String marca;
   private int tamano;
   private double peso;

public TarjetaDeVideo(){};

public TarjetaDeVideo(int x){
    tamano=x;
};   
public void setTarjetaDeVideo(int x){
    this.tamano=x;
}

public String getTarjetaDeVideo(){
    return this.marca;
} 
}
