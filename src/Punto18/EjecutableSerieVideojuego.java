package Punto18;

public class EjecutableSerieVideojuego {

    public void main(){
        Serie [] vec_serie = new Serie[5];
        Videojuego[] vec_juego = new  Videojuego[5];
        llenarVectores(vec_serie,vec_juego);
    }

    public void llenarVectores(Serie[] vec_serie, Videojuego[] vec_juego){
        Serie serie1 = new Serie("Elite",4,"fantasia","Juan");
        Serie serie2 = new Serie("Rickandmorty",8,"animado","Carlos");
        Serie serie3 = new Serie("Lucifer",6,"accion","Lucy");
        Serie serie4 = new Serie("Oscuro",3,"fantasia","Watson");
        Serie serie5 = new Serie("LosSimpson",24,"animada","Matt");

        Videojuego juego1 = new Videojuego("Godofware",15,"accion","Alguna");
        Videojuego juego2 = new Videojuego("Fifa",22,"deportes","EAsport");
        Videojuego juego3 = new Videojuego("GTA",80,"accion","Rock");
        Videojuego juego4 = new Videojuego("Reddeadredemption",15,"accion","Rock");
        Videojuego juego5 = new Videojuego("CallDuty",30,"accion","O");

        vec_serie[0] = serie1;
        vec_serie[1] = serie2;
        vec_serie[2] = serie3;
        vec_serie[3] = serie4;
        vec_serie[4] = serie5;

        vec_juego[0] = juego1;
        vec_juego[1] = juego2;
        vec_juego[2] = juego3;
        vec_juego[3] = juego4;
        vec_juego[4] = juego5;

        vec_serie[1].entregar();
        vec_serie[3].entregar();

        vec_juego[0].entregar();
        vec_juego[2].entregar();
        vec_juego[4].entregar();

        int contSeries=contar_DevolverSerie(vec_serie);
        int contJuego=contar_DevolverJuego(vec_juego);

        Serie s = masHorasSerie(vec_serie);
        Videojuego j = masHorasJuego(vec_juego);

        System.out.println("Las veces que se entrego las series fue: "+contSeries);
        System.out.println("Las veces que se entrego los videojuegos fue: "+contJuego);

        System.out.println("La serie con mas temporadas es: "+s.getTitulo());
        System.out.println("El videojuego con mas horas estimadas es : "+j.getTitulo());

    }

    public int contar_DevolverSerie(Serie[] vec_serie){
        int contador = 0;
        for (int i = 0; i < vec_serie.length; i++) {
            if(vec_serie[i].isEntregado()) {
                contador++;
                vec_serie[i].devolver();
            }
        }
        return contador;
    }

    public int contar_DevolverJuego(Videojuego[] vec_juego){
        int contador = 0;
        for (int i = 0; i < vec_juego.length; i++) {
            if(vec_juego[i].isEntregado()) {
                contador++;
                vec_juego[i].devolver();
            }
        }
        return contador;
    }

    public Videojuego masHorasJuego(Videojuego[] vec_juego){
        Videojuego juego = vec_juego[0];

        for(int i = 0; i < vec_juego.length - 1; i++){
            if(juego.compareTo(vec_juego[i+1]) == 1)
                juego = juego;
            else
                juego = vec_juego[i+1];
        }
        return juego;
    }

    public Serie masHorasSerie(Serie[] vec_serie){
        Serie serie = vec_serie[0];
        for(int i = 0; i < vec_serie.length - 1; i++){
            if(serie.compareTo(vec_serie[i+1]) == 1)
                serie = serie;
            else
                serie = vec_serie[i+1];
        }
        return serie;
    }
}
