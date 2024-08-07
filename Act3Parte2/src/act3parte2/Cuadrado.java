/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act3parte2;

public class Cuadrado {
    double l; // Lado del cuadrado

    Cuadrado(double l) {
        this.l = l;
    }

    double calcularArea() {
        return Math.round((l*l)*100.0)/100.0;
    }

    double calcularPerimetro() {
        return Math.round((4*l)*100.0)/100.0;
    }
}