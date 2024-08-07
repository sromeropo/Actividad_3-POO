/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act3parte2;

public class TrianRectangulo {
    double b; // Base de un triángulo rectángulo
    double h; // Altura de un triángulo rectángulo

    TrianRectangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    double calcularArea() {
        return Math.round((b*h/2)*100.0)/100.0;
    }

    double calcularPerimetro() {
        return Math.round(((b+h+calcularHipotenusa())*100.0))/100.0;
    }

    double calcularHipotenusa() {
        return Math.pow(b*b+h*h, 0.5);
    }

    String determinarTipoTriangulo() {
        if ((b == h) && (b == calcularHipotenusa()) && (h == calcularHipotenusa())){
            return "Es un triangulo equilátero"; /* Todos sus lados son iguales */
        }
        else if ((b != h) && (b != calcularHipotenusa()) && (h != calcularHipotenusa())){
            return "Es un triangulo escaleno"; /* Todos suslados son diferentes */
        }
        else{
            return"Es un triangulo isosceles"; /* De otra manera, es isósceles */
        }    
    }
}
