/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act3parte2;

public class Rombo {
    double x; // Diagonal mayor del rombo
    double y; // Diagonal menor del rombo

    Rombo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double calcularArea() {
        return Math.round(((x*y/2)*100.0))/100.0;
    }

    double calcularPerimetro() {
        return Math.round(((4*(Math.pow((x*x)+(y*y),0.5)/2))*100.0))/100.0;
    }
}
