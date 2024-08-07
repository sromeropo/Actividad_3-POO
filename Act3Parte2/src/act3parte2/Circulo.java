/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act3parte2;

public class Circulo {
    double r; // Radio del circulo
    Circulo(double r) {
        this.r = r;
    }
    double calcularArea() {
        return Math.round((Math.PI*Math.pow(r,2))*100.0)/100.0;
    }

    double calcularPerimetro() {
        return Math.round((2*Math.PI*r)*100.0)/100.0;
    }
}
