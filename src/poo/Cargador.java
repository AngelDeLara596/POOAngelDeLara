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
public class Cargador {
   private String textura;
   private int tamano;
   private double peso;

public Cargador(){};

public Cargador(int x){
    tamano=x;
};

public void setCargador(int x){
    this.tamano=x;
}

public String getCargador(){
    return this.textura;
} 

}