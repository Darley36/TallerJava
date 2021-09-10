package Punto16;

import java.util.Scanner;

public class ValidacionesPersona {
    Scanner myObj = new Scanner(System.in);
    //validar el ingreso del nombre
    public String nombre(Scanner teclado){
        String name="";
        try {
            System.out.println("Por favor ingresa un nombre");
            name = teclado.nextLine();
            if (name != ""){
                return name;
            }
            System.out.println("No se acepta el campo vacio");
            name=nombre(myObj);
        }catch (Exception e){
            System.out.println("Solo se aceptan caracteres!");
            name=nombre(myObj);
        }
        return name;
    }
    //validar el ingreso de la edad
    public int Edad(Scanner teclado){
        int edad = 0;
        try {
            System.out.println("Por favor ingresa la edad");
            edad = Integer.parseInt(teclado.nextLine());
            if (edad >= 1){
                return edad;
            }
            System.out.println("no se aceptan valores negativos, ni valor cero");
            edad=Edad(myObj);
        }catch (Exception e){
            System.out.println("Solo se aceptan numeros enteros!");
            edad=Edad(myObj);
        }
        return edad;
    }

    //validar el ingreso del sexo
    public char Sexo(Scanner teclado){
        char sexo = 'H';
        try {
            System.out.println("Por favor ingrese el sexo --> M : Mujer    H o vacio : Hombre");
            sexo = (teclado.nextLine()).charAt(0);
            if (sexo == 'H' || sexo == 'M'){
                return sexo;
            }else  if (sexo == 0){
                sexo = 'H';
                return sexo;
            }
            System.out.println("No se acept'o el dato ingresado");
            sexo=Sexo(myObj);
        }catch (Exception e){
            System.out.println("no se aceptan numeros!");
            sexo=Sexo(myObj);
        }
        return sexo;
    }

    //validar el ingreso de los datos peso y altura
    public double Atributos(Scanner teclado,int n){
        double dato = 0;
        try {
            Peso_altura(n);
            dato = Double.parseDouble(teclado.nextLine());
            if (dato >= 1){
                return dato;
            }
            System.out.println("no se aceptan valores negativos, ni valor cero");
            dato=Edad(myObj);
        }catch (Exception e){
            System.out.println("Solo se aceptan numeros!");
            dato=Edad(myObj);
        }
        return dato;
    }

    public void Peso_altura(int n){
        if(n==0){
            System.out.println("Por favor ingrese su peso en kilogramos");
        }else if(n == 1){
            System.out.println("Por favor ingrese su altura en metros");
        }
    }

    public void Indicacion_peso(int n){
        if (n == -1){
            System.out.println("Lastimosamente tiene desnutricion");
        }else if(n == 0){
            System.out.println("Se encuentra en su peso ideal");
        }else if(n == 1){
            System.out.println("Lastimosamente tiene sobrepeso");
        }
    }

    public void Indicacion_edad(boolean n){
        if(n==true){
            System.out.println("La persona es mayor de edad");
        }else if(n == false){
            System.out.println("la persona es menor de edad");
        }
    }

}
