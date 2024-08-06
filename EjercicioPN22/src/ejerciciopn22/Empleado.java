/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopn22;

public class Empleado {
    
    String nombre, apellido;
    double salarioHora, horasMes;
    
    Empleado(String nombre, String apellido, double salarioHora, double horasMes){
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioHora = salarioHora;
        this.horasMes = horasMes;
    }
    
    String salarioMensual(){
        double salarioMes = salarioHora*horasMes;
        if((salarioMes)>450000){
            return "Su salario mensual es de $"+salarioMes;
        }else{
            return "";
        }
    }
}
