package Punto16;

import java.util.Random;

public class Persona {

    private String nombre = "";
    private int edad = 0;
    private char sexo = 'H';
    private double peso = 0;
    private double altura = 0;
    private String DNI;



    public Persona() {
        this.getDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.getDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.DNI = DNI;
        this.getDNI();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getDNI() {
        return DNI;
    }

    public int calcularIMC(){
        double result = Validar_Peso(this.peso,this.altura);
        if (result < 20){
            return -1;
        }else if(result >= 20 && result <= 25){
            return 0;
        }else if(result > 25){
            return 1;
        }
        return 0;
    }

    public double Validar_Peso(double peso,double altura){
        return peso/Math.pow(altura,2);
    }

    public boolean esMayorDeEdad(){
        return this.getEdad() >= 18;
    }

    public void comprobarSexo(char sexo){
        if(!VerificarSexo(sexo)) this.setSexo('H');
    }

    public boolean VerificarSexo(char sexo){
        return sexo == 'H' || sexo == 'M';
    }

    public String[] tostring(){
        String [] info = new String[6];
        info[0]=this.nombre;
        info[1]=this.edad+"";
        info[2]=this.sexo+"";
        info[3]=this.peso+"";
        info[4]=this.altura+"";
        info[5]=this.DNI;
        return info;
    }
    private void generaDNI(){
        int num = generar_numero();
        char letra = transformar_numero(num);
        this.DNI=(Integer.toString(num)+letra);
    }
    public int generar_numero(){
        String x = "";
        Random rm = new Random();
        for (int i = 1; i <=8; i++) {
            x = rm.nextInt(8)+1+"";
        }
        return Integer.parseInt(x);
    }
    public char transformar_numero(int num){
        String Caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = num % 23;
        char letra = Caracteres.charAt(modulo);
        return letra;
    }
}
