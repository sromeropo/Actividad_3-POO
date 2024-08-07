/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act3parte2;

public class Rectangulo {
    double b; // Base de un rectángulo
    double h; // Altura de un rectángulo

    Rectangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    double calcularArea() {
        return Math.round((b*h)*100.0)/100.0;
    }

    double calcularPerimetro() {
        return Math.round(((2*b) + (2*h))*100.0)/100.0;
    }
}
