/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerpn18;

/**
 *
 * @author srome
 */
public class Empleado {
    int ID;
    double numHoras, valorHora, prctRet;
    String nombre, apellido;
    
    Empleado(int ID,String nombre, String apellido, double numHoras, double valorHora, double prctRet){
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numHoras = numHoras;
        this.valorHora = valorHora;
        this.prctRet = prctRet;
    }
    
    double salarioBruto(){
        return numHoras*valorHora;
    }
    
    double salarioNeto(){
        return salarioBruto()*((100-prctRet) / 100);
    }
}
