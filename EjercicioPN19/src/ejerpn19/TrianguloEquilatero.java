/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerpn19;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TrianguloEquilatero {
    double l;

    TrianguloEquilatero(double l) {
        this.l = l;
    }

    double Perimetro() {
        return round(l * 3, 2);
    }

    double Area() {
        return round((Math.sqrt(3) / 4) * Math.pow(l, 2), 2);
    }

    double Altura() {
        return round(Math.sqrt(Area() * Math.sqrt(3)), 2);
    }

    double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
