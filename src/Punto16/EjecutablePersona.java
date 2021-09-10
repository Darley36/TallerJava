package Punto16;
import java.util.Scanner;

public class EjecutablePersona {
    Scanner myObj = new Scanner(System.in);
    ValidacionesPersona VP = new ValidacionesPersona();
    private String name;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public void Pedir_datos(){
        this.name = VP.nombre(myObj);
        this.edad = VP.Edad(myObj);
        this.sexo = VP.Sexo(myObj);
        this.peso = VP.Atributos(myObj,0);
        this.altura = VP.Atributos(myObj,1);

        Crear_Objetos_Persona();
    }

    public void Crear_Objetos_Persona(){
        Persona persona1 = new Persona(this.name,this.edad,this.sexo,this.peso,this.altura,"");
        Persona persona2 = new Persona(this.name,this.edad,this.sexo);
        Persona persona3 = new Persona();
        persona3.setNombre(this.name);
        persona3.setEdad(this.edad);
        persona3.setSexo(this.sexo);
        persona3.setPeso(this.peso);
        persona3.setAltura(this.altura);

        VP.Indicacion_peso(persona1.calcularIMC());
        VP.Indicacion_edad(persona1.esMayorDeEdad());
        String vec[] = persona1.tostring();
        System.out.println("Esta es la informacion de la persona");
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }

        VP.Indicacion_peso(persona2.calcularIMC());
        VP.Indicacion_edad(persona2.esMayorDeEdad());
        String vec2[] = persona2.tostring();
        System.out.println("Esta es la informacion de la persona");
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }

        VP.Indicacion_peso(persona3.calcularIMC());
        VP.Indicacion_edad(persona3.esMayorDeEdad());
        String vec3[] = persona3.tostring();
        System.out.println("Esta es la informacion de la persona");
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }

    }

}
