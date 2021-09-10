package Punto17;

public class Electrodomestico {
    private double precio_base;
    private String color;
    private char consumo_energetico;
    private double peso;

    private static final double precio_base_defecto = 100;
    private static final String color_defecto = "blanco";
    private static final char consumo_energetico_defecto = 'F';
    private static final double peso_defecto = 5;

    public Electrodomestico() {
        this.precio_base = precio_base_defecto;
        this.color = color_defecto;
        this.consumo_energetico = consumo_energetico_defecto;
        this.peso = peso_defecto;
    }

    public Electrodomestico(double precio_base, double peso) {
        this.precio_base = precio_base;
        this.peso = peso;
        this.color = color_defecto;
        this.consumo_energetico = consumo_energetico_defecto;
    }

    public Electrodomestico(double precio_base, String color, char consumo_energetico, double peso) {
        this.precio_base = precio_base;
        this.color = comprobarColor(color);
        this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
        this.peso = peso;

    }

    public double getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergetico(char letra){
        char[] ConEner = {'A','B','C','D','E','F'};
        int cont=0;
        for (int i = 0; i < ConEner.length; i++) {
            if (ConEner[i] == letra) cont++;
        }
        if (cont > 0){
            return letra;
        }else{
            return consumo_energetico_defecto;
        }
    }

    private String comprobarColor(String color){
        String[] Colores = {"blanco", "negro", "rojo", "azul", "gris"};
        int cont=0;
        for (int i = 0; i < Colores.length; i++) {
            if (Colores[i] == color) cont++;
        }
        if (cont > 0){
            return color;
        }else{
            return color_defecto;
        }
    }

    public double precioFinal(){
        double preciototal = this.precio_base;
        preciototal = preciototal+aumentoConsumo(this.consumo_energetico);
        preciototal = preciototal+aumentoTamaño(this.peso);
        return preciototal;
    }

    private double aumentoConsumo(char letra){
        double valor=0;
        switch (letra){
            case 'A':
                valor = 100;
                break;
            case 'B':
                valor =  80;
                break;
            case 'C':
                valor = 60;
                break;
            case 'D':
                valor =  50;
                break;
            case 'E':
                valor =  30;
                break;
            case 'F':
                valor =  10;
                break;
        }
        return valor;
    }

    private double aumentoTamaño(double peso){
        double valor = 0;
        if(peso >= 0 && peso <= 19)
            valor =  10;
        else if(peso >= 20 && peso <= 49)
            valor =  50;
        else if(peso >= 50 && peso <= 79)
            valor = 80;
        else if(peso >= 80)
            valor = 100;
        return  valor;
    }
}
