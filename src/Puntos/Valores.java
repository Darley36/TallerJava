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

    public String metodoDia(Scanner teclado){
        String dia="";
        try {
            System.out.println("Por favor ingresa un dia sea : LUNES-MARTES-MIERCOLES-JUEVES-VIERNES-SABADO-DOMINGO");
            dia = (teclado.nextLine());
            return dia;
        }catch (Exception e){
            System.out.println("Solo se aceptan caracteres (letras)!");
            dia=metodoDia(myObj);
        }
        return dia;
    }

    public String Frase(Scanner teclado){
        String frases="";
        try {
            System.out.println("Por favor ingresa alguna frase");
            frases = (teclado.nextLine());
            return frases;
        }catch (Exception e){
            System.out.println("Hubo un error");
            frases=Frase(myObj);
        }
        return frases;
    }
}
