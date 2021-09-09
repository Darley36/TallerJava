package Principal;
import javax.swing.*;
import java.util.Scanner;

import Puntos.*;

public class main {

    public static int metodoDe1Numero(Scanner teclado){

        System.out.println("Por favor ingresa un numero");
        int numero = teclado.nextInt();
        return numero;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        PuntosGenerales_3_al_15 PG = new PuntosGenerales_3_al_15();

        boolean entrar=true;
        do {
            menu();
            int opcion = myObj.nextInt();
            if (opcion == 0) {
                entrar=false;
            }
            if (opcion > 0 && opcion < 12) {
                // switch case
                switch (opcion){
                    //numero mayor estatico
                    case 1:
                        MayorVariables MV = new MayorVariables();
                        MV.mayorUno();
                        break;
                    case 2:
                        MayorVariables M = new MayorVariables();
                        M.mayorDos();
                        break;
                    case 3:
                        PG.Area_circulo();
                        break;
                    case 4:
                        PG.Precio_IVA();
                        break;
                    case 5:
                        PG.Numeros_pares_impares();
                        break;
                    case 6:
                        PG.Numeros_pares_impares2();
                        break;
                    case 7:
                        PG.Pedir_Numero();
                        break;
                    case 8:
                        PG.Dia_semana();
                        break;
                    default:
                        System.out.println("No se pudo ingresar");
                }
            }else{
                System.out.println("Opcion incorrecta");
            }
        } while (entrar);
    }
    public static void menu() {
        System.out.println("**********TALLER SOFKA************");
        System.out.println("1 - NUMERO MAYOR ESTATICO \n2 - NUMERO MAYOR \n3 - AREA DE UN CIRCULO \n4 - PRECIO FINAL");
        System.out.println("5 - NUMERO PARES E IMPARES \n6 - NUMERO PARES E IMPARES(CICLO FOR)");
        System.out.println("7 - SOLICITAR NUMERO MAYOR A CERO \n8 - DIAS LABORALES");
        System.out.println("Por favor seleccione la opcion deseada");
        System.out.println("Para salir preciones el numero 0");
    }

}
