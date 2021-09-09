package Puntos;
import java.util.Scanner;


public class MayorVariables {
    Scanner myObj = new Scanner(System.in);

       public void mayorUno(){
           double num1 = -8;
           double num2 = -3;
           proceso(num1,num2);
       }
       public void mayorDos(){
           Valores v = new Valores();
           double num1 = v.metodoNumero(myObj);
           double num2 = v.metodoNumero(myObj);
           proceso(num1,num2);
       }

       public void proceso(double num1, double num2){
           if(num1 == num2){
               System.out.println("Los numeros son iguales");
           }else{
               System.out.println("El numero mayor es: "+ Math.max(num1,num2));
           }
       }
}
