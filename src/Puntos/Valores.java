package Puntos;

import java.util.Scanner;

public class Valores {
    Scanner myObj = new Scanner(System.in);
    public double metodoNumero(Scanner teclado){
        double numero=0;
        try {
            System.out.println("Por favor ingresa un numero");
            numero = Double.parseDouble(teclado.nextLine());
            return numero;
        }catch (Exception e){
            System.out.println("Solo se aceptan numeros, vuelva a ingresar por favor!");
            numero=metodoNumero(myObj);
        }
        return numero;
    }
}
