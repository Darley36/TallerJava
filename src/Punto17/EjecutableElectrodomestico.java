package Punto17;
import java.util.ArrayList;

public class EjecutableElectrodomestico {

    public void main() {
        Electrodomestico[] Aparatos = new Electrodomestico[10];
        IngresarElectrodomestico(Aparatos);
    }

    public void IngresarElectrodomestico(Electrodomestico[] Aparatos){
        Lavadora lavadora1 = new Lavadora(150,"negro",'A',10,23);
        Television television1 = new Television(250,"azul",'C',50,42,true);
        Electrodomestico electrodomestico1 = new Electrodomestico(130,"gris",'F',30);
        Lavadora lavadora2 = new Lavadora(300,"blanco",'F',50,28);
        Lavadora lavadora3 = new Lavadora(210,"negro",'A',47,16);
        Electrodomestico electrodomestico2 = new Electrodomestico(214,"rojo",'D',24);
        Television television2 = new Television(324,"negro",'E',8,60,false);
        Electrodomestico electrodomestico3 = new Electrodomestico(111,"blanco",'E',19);
        Television television3 = new Television(109,"gris",'A',12,24,true);
        Lavadora lavadora4 = new Lavadora(265,"azul",'A',40,40);

        Aparatos[0]=lavadora1;
        Aparatos[1]=television1;
        Aparatos[2]=electrodomestico1;
        Aparatos[3]=lavadora2;
        Aparatos[4]=lavadora3;
        Aparatos[5]=electrodomestico2;
        Aparatos[6]=television2;
        Aparatos[7]=electrodomestico3;
        Aparatos[8]=television3;
        Aparatos[9]=lavadora4;

        ImprimirTotales(Aparatos);

    }

    private void ImprimirTotales(Electrodomestico[] Aparatos) {
        double valorGeneral = 0;
        double valorTV = 0;
        double valorLavadoras = 0;
        double valorTotal = 0;
        for (int i = 0; i < Aparatos.length; i++) {
            if(Aparatos[i] instanceof Television) valorTV += Aparatos[i].precioFinal();
            else if(Aparatos[i] instanceof Lavadora) valorLavadoras += Aparatos[i].precioFinal();
            else if(Aparatos[i] instanceof Electrodomestico) valorGeneral += Aparatos[i].precioFinal();
            valorTotal += Aparatos[i].precioFinal();
        }

        System.out.println("El precio total de los televisores fue: "+valorTV);
        System.out.println("El precio total de las lavadoras fue: "+valorLavadoras);
        System.out.println("El precio total de los Electrodomesticos generales fue: "+valorGeneral);
        System.out.println("El precio total de todos los electrodomesticos fue: "+valorTotal);
    }
}
