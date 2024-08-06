/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopn23;

public class Ecuacion {
    
    double A,B,C;
    
    Ecuacion(double A, double B, double C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    String segundoOrden(){
        double x1, x2, deter;
        deter = Math.pow(B, 2)-(4*A*C);
        if(deter>0){
            x1 = (-B+Math.sqrt(deter))/(2*A);
            x2 = (-B-Math.sqrt(deter))/(2*A);
            return "Las soluciones son X1= "+(Math.round(x1 * 100.0) / 100.0)+" y X2= "+(Math.round(x2 * 100.0) / 100.0);
        } else {
            return "La ecuacion no tiene solucion";
        }
    }
        
}
