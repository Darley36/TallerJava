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

    public int[] ContarCaracter(String frase){
        int [] vocales = new int[5];
        char temp;
        for (int i = 0; i < frase.length(); i++) {

            temp = frase.charAt(i);
            if (temp == 'a') {
                vocales[0]++;
            }
            if (temp == 'e') {
                vocales[1]++;
            }
            if (temp == 'i') {
                vocales[2]++;
            }
            if (temp == 'o') {
                vocales[3]++;
            }
            if (temp == 'u') {
                vocales[4]++;
            }
        }
        return  vocales;
    }

    public void Menu(){
        System.out.println("**********GESTION CINEMATOGRAFICA************");
        System.out.println("1 - NUEVO ACTOR \n2 - BUSCAR ACTOR \n3 - ELIMINAR ACTOR \n4 - MODIFICAR ACTOR");
        System.out.println("5 - VER TODOS LOS ACTORES \n6 - VER PELICULAS DE LOS ACTORES");
        System.out.println("7 - VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n8 - SALIR ");
    }
}
