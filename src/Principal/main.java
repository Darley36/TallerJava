package Principal;
import javax.swing.*;
import java.util.Scanner;

import Punto16.EjecutablePersona;
import Punto17.EjecutableElectrodomestico;
import Punto18.EjecutableSerieVideojuego;
import Puntos.*;

public class main {

    public static int metodoDe1Numero(Scanner teclado){

        System.out.println("Por favor ingresa un numero");
        int numero = teclado.nextInt();
        return numero;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Valores v = new Valores();
        PuntosGenerales_3_al_15 PG = new PuntosGenerales_3_al_15();

        boolean entrar=true;
        do {
            menu();
            int opcion = (int) v.metodoNumero(myObj);
            if (opcion == 0) {
                entrar=false;
                break;
            }
            if (opcion > 0 && opcion < 19) {
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
                    case 9:
                        PG.Reemplazar_caracter();
                        break;
                    case 10:
                        PG.Quitar_Espacios();
                        break;
                    case 11:
                        PG.Longitud_Cadena();
                        break;
                    //Me falta el punto 12
                    case 12:
                        PG.Diferenci_Caracteres();
                        break;
                    case 13:
                        PG.Obtener_Fecha();
                        break;
                    case 14:
                        PG.Saltar_Numeros();
                        break;
                    case 15:
                        PG.Mostrar_Menu();
                        break;
                    case 16:
                        EjecutablePersona EP = new EjecutablePersona();
                        EP.Pedir_datos();
                        break;
                    case 17:
                        EjecutableElectrodomestico EE = new EjecutableElectrodomestico();
                        EE.main();
                        break;
                    case 18:
                        EjecutableSerieVideojuego ESV = new EjecutableSerieVideojuego();
                        ESV.main();
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
        System.out.println("7 - SOLICITAR NUMERO MAYOR A CERO \n8 - DIAS LABORALES \n8 - REEMPLAZAR CARACTER (A)");
        System.out.println("10 - QUITAR ESPACIOS EN BLANCO \n11 - CONTAR LONGITUD \n12 - DIFERENCIAR PALABRAS)");
        System.out.println("13 - ONTENER FECHA \n14 - SLATOS DE 2 EN 2 \n15 - MENU");
        System.out.println("16 - IMC \n17 - ELECTRODOMESTICOS \n18 - SERIES VIDEOJUEGOS");
        System.out.println("Por favor seleccione la opcion deseada!!");
        System.out.println("Para salir preciones el numero 0");
    }

}
