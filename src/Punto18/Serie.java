package Punto18;

public class Serie {

    private String titulo;
    private int Num_Temporadas;
    private boolean entregado;
    private  String genero;
    private  String creador;

    private static final String titulo_defecto= "";
    private static final int Num_Temporadas_defecto=3;
    private static final boolean entregado_defecto=false;
    private static final String genero_defecto="";
    private static final String creador_defecto="";

    public Serie() {
        this.titulo = titulo_defecto;
        this.Num_Temporadas = Num_Temporadas_defecto;
        this.entregado = entregado_defecto;
        this.genero = genero_defecto;
        this.creador = creador_defecto;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.Num_Temporadas = Num_Temporadas_defecto;
        this.entregado = entregado_defecto;
        this.genero = genero_defecto;
    }

    public Serie(String titulo, int Num_Temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.Num_Temporadas = Num_Temporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNum_Temporadas() {
        return Num_Temporadas;
    }

    public void setNum_Temporadas(int num_Temporadas) {
        Num_Temporadas = num_Temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", Num_Temporadas=" + Num_Temporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }
}
