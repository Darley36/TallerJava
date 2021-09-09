package Puntos;

import java.util.Scanner;

public class PuntosGenerales_3_al_15 {
    Valores values = new Valores();
    Scanner myObj = new Scanner(System.in);

    //punto 3
    public void Area_circulo(){
        System.out.println("Debes ingresar el radio del circulo");
        double num = values.metodoNumero(myObj);
        System.out.println("El area del cirsulo es: "+ Math.PI*Math.pow(num,2));
    }

    //punto 4
    public void Precio_IVA(){
        double iva = 0.21;
        System.out.println("Debes ingresar el precio del articulo");
        double num = values.metodoNumero(myObj);
        System.out.println("El precio del articulo es: "+num+"\n"+
                " tiene un iva de: " + iva + "\n" + " El precio final corresponde a: "+(num+num*iva));
    }




}
