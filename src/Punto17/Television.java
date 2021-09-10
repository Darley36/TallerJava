package Punto17;

public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;

    private static final int resolucion_defecto = 20;
    private static final boolean sintonizadorTDT_defecto = false;

    public Television() {
        super();
        this.resolucion = resolucion_defecto;
        this.sintonizadorTDT = sintonizadorTDT_defecto;
    }

    public Television(double precio_base, double peso) {
        super(precio_base, peso);
        this.resolucion = resolucion_defecto;
        this.sintonizadorTDT = sintonizadorTDT_defecto;
    }

    public Television(double precio_base, String color, char consumo_energetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precio_base, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioTotal = super.precioFinal();
        if(this.resolucion > 40) precioTotal = precioTotal + (precioTotal*0.30);
        if(this.sintonizadorTDT) precioTotal = precioTotal+50;
        return precioTotal;
    }
}
