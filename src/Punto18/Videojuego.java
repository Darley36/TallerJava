package Punto18;

public class Videojuego implements Entregable{
    private String titulo;
    private int horas_estimadas;
    private boolean entregado = false;
    private String genero;
    private String compania;

    private static final String titulo_defecto = "";
    private static final int horas_estimadas_defecto = 10;
    private static final boolean entregado_defecto = false;
    private static final String genero_defecto = "";
    private static final String compania_defecto = "";

    public Videojuego() {
        this.titulo = titulo_defecto;
        this.horas_estimadas = horas_estimadas_defecto;
        this.entregado = entregado_defecto;
        this.genero = genero_defecto;
        this.compania = compania_defecto;
    }

    public Videojuego(String titulo, int horas_estimadas) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.entregado = entregado_defecto;
        this.genero = genero_defecto;
        this.compania = compania_defecto;
    }

    public Videojuego(String titulo, int horas_estimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_estimadas() {
        return horas_estimadas;
    }

    public void setHoras_estimadas(int horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horas_estimadas=" + horas_estimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        Videojuego juegoComparacion = (Videojuego)a;
        int estado = -1;

        if(this.horas_estimadas > juegoComparacion.horas_estimadas)
            estado = 1;
        else if(this.horas_estimadas == juegoComparacion.horas_estimadas)
            estado = 0;
        return estado;
    }
}
