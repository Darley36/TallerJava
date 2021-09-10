package Punto17;

public class Lavadora extends Electrodomestico{
    private double carga;
    private static final double carga_defecto = 5;

    public Lavadora() {
        super();
        this.carga = carga_defecto;
    }

    public Lavadora(double precio_base, double peso) {
        super(precio_base, peso);
        this.carga = carga_defecto;
    }

    public Lavadora(double precio_base, String color, char consumo_energetico, double peso, double carga) {
        super(precio_base, color, consumo_energetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal(){
        double precioTotal = super.precioFinal();
        if(this.carga > 30) precioTotal = precioTotal+50;
        return precioTotal;
    }
}
