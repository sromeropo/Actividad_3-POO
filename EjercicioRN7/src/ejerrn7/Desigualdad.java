/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerrn7;

/**
 *
 * @author srome
 */
public class Desigualdad {
    double a,b;
    
    Desigualdad(double a, double b){
        this.a =a;
        this.b=b;
    }
    
    String comparar(){
        if(a>b){
            return a+" Es mayor que "+b;
        } else if(a<b) {
            return a+" Es menor que "+b;
        } else {
            return a+" Es igual a "+b;
        }
    }
}
