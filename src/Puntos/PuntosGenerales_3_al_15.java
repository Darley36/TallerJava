package Puntos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
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

    //punto5
    public void Numeros_pares_impares(){
        int x =1;
        String numP = "";
        String numI = "";
        System.out.println("Estos son los numeros impares: \n");
        while (x<=100){
            if(x % 2 != 0){
                numI = numI+" "+x;
            }else{
                numP = numP+" "+x;
            }
            x++;
        }
        System.out.println(numI);
        System.out.println("Estos son los numeros pares: \n");
        System.out.println(numP);
    }

    //Punto 6
    public void Numeros_pares_impares2(){
        String numP = "";
        String numI = "";
        System.out.println("Estos son los numeros impares: \n");
        for (int i = 1; i <= 100 ; i++) {
            if(i % 2 != 0){
                numI = numI+" "+i;
            }else{
                numP = numP+" "+i;
            }
        }
        System.out.println("Estos son los numeros impares: \n");
        System.out.println(numI);
        System.out.println("Estos son los numeros pares: \n");
        System.out.println(numP);
    }

    //punto7
    public void Pedir_Numero(){
        double num = 0;
        int x = 0;
        do{
            if (x == 1) System.out.println("El numero no puede ser menor a cero");
            x ++;
            num = values.metodoNumero(myObj);
        }while (num < 0);
        System.out.println("El numero ingresado fue: "+num);
    }

    //punto8
    public void Dia_semana(){
        String dia = values.metodoDia(myObj).toLowerCase(Locale.ROOT);
        switch (dia){
            case "lunes":
                System.out.println("Es un dia laboral");
                break;
            case "martes":
                System.out.println("Es un dia laboral");
                break;
            case "miercoles":
                System.out.println("Es un dia laboral");
                break;
            case "jueves":
                System.out.println("Es un dia laboral");
                break;
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
                System.out.println("No es un dia laboral");
                break;
            case "domingo":
                System.out.println("No es un dia laboral");
                break;
            default:
                System.out.println("No se ingreso un dia valido");
        }
    }

    //punto 9
    public void Reemplazar_caracter(){
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String newTexto = texto.replace("a","e");
        String frase = values.Frase(myObj);

        System.out.println(newTexto+". "+frase);
    }

    //punto 10
    public void Quitar_Espacios(){
        String frase = values.Frase(myObj);
        String newFrase = frase.replaceAll("\\s+","");
        System.out.println("Esta es su frase sin espacios \n \n");
        System.out.println(newFrase);
    }

    //punto11
    public void Longitud_Cadena(){
        String frase = values.Frase(myObj);
        long longitud = frase.chars().filter(ch -> ch != ' ').count();
        int [] vocales = values.ContarCaracter(frase.toLowerCase(Locale.ROOT));

        System.out.println("La longitud de la frse es: "+longitud+"\n");
        System.out.println("posee "+vocales[0]+" : letras a, "+vocales[1]+" : letras e, "+
                vocales[2]+" : letras i, "+vocales[3]+" : letras o, "+vocales[4]+" : letras u, ");

    }

    //punto12
    public void Diferenci_Caracteres(){
        String pal1 = values.Frase(myObj);
        String pal2 = values.Frase(myObj);
        if (pal1 == pal2){
            System.out.println("Estas palabras son iguales");
        }else{
            System.out.println("Estas palabras no son iguales");
        }

    }

    //punto13
    public void Obtener_Fecha(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("LA fecha seria: -> "+dtf.format(LocalDateTime.now()));
    }

    //punto14
    public void Saltar_Numeros(){
        double numero = values.metodoNumero(myObj);
        String cadena = "";
        do {
            if(numero < 999){
                break;
            }
            System.out.println("Numero incorrecto, debe ser menor a 999");
            numero = values.metodoNumero(myObj);
        }while (numero>=999);
        for (int i = (int) numero ; i<=1000; i+=2) {/*para que salgan los numeros en otra orden*/
            cadena = cadena+" "+i;
        }
        System.out.println("La cadena de numero que van de 2 en 2 hasta mil es : \n"+cadena);
    }

    //punto15
    public void Mostrar_Menu(){

        boolean entrar=true;
        do {
            values.Menu();
            System.out.println("Ingresar la opcion que desee");
                int opcion = (int) values.metodoNumero(myObj);
            if (opcion > 0 && opcion < 9) {
                // switch case
                switch (opcion){
                    //numero mayor estatico
                    case 1:
                        System.out.println("NUEVO ACTOR");
                        break;
                    case 2:
                        System.out.println("BUSCAR ACTOR");
                        break;
                    case 3:
                        System.out.println("ELIMINAR ACTOR");
                        break;
                    case 4:
                        System.out.println("MODIFICAR ACTOR");
                        break;
                    case 5:
                        System.out.println("VER TODOS LOS ACTORES");
                        break;
                    case 6:
                        System.out.println("VER PELICULAS DE LOS ACTORES");
                        break;
                    case 7:
                        System.out.println("VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                        break;
                    case 8:
                        entrar = false;
                        break;
                    default:
                        System.out.println("No se pudo ingresar");

                }
            }else{
                System.out.println("Opcion incorrecta");
            }
        } while (entrar);
    }

}
