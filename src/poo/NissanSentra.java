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
public class NissanSentra {
    private String marca;
   private int tamano;
   private double peso;

   public NissanSentra(){};

public NissanSentra(int x){
    tamano=x;
};
public void setNissanSentra(int x){
    this.tamano=x;
}

public String getNissanSentra(){
    return this.marca;
} 
}
