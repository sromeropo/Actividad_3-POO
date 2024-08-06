/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerrn10;


public class Estudiante {
    
    int NI, estrato;
    String nombres, apellidos;
    double patrimonio;
    
    Estudiante(int NI, String nombres, String apellidos, double patrimonio, int estrato){
        this.NI = NI;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }
    
    double pagoMatricula(){
        if((patrimonio > 2000000) && (estrato>3)){
            return 50000 + (0.003*patrimonio);
        } else{
            return 50000;
        }
    }
}
