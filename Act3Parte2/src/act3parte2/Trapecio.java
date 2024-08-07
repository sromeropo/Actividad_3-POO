/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act3parte2;

public class Trapecio {
    double w; // Base mayor del trapecio
    double u; // Base menor del trapecio
    double z; // Altura del trapecio

    Trapecio(double w, double u, double z) {
        this.w = w;
        this.u = u;
        this.z = z;
    }

    double calcularArea() {
        return Math.round(((w*u/2)+z)*100.0)/100.0;
    }

    double calcularPerimetro() {
        return Math.round((w+u+2*(Math.sqrt(Math.pow((w-u)/2,2)+Math.pow(z,2))))*100.0)/100.0;
    }
}
