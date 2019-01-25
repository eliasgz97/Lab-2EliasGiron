package lab.pkg2_eliasgiron;

public class Casas {
    private int casa;
    private int bloque;
    private String color;
    private int ancho;
    private int largo, pisos, banos, cuartos;
    private int estado;
    private String comprada, dueno, ingeniero, nuevoestado;

        public Casas(int casa, int bloque, String color, int ancho, int largo, int pisos, int banos, int cuartos, String comprada, String dueno, int estado, String ingeniero) {
        this.casa = casa;
        this.bloque = bloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.pisos = pisos;
        this.banos = banos;
        this.cuartos = cuartos;
        this.comprada = comprada;
        this.dueno = dueno;
        this.estado = estado;
        this.ingeniero = ingeniero;
        switch (estado){
            case 1:
                nuevoestado = "LISTA";
                break;
            case 2:
                nuevoestado = "EN CONSTRUCCION";
                break;
            case 3:
                nuevoestado = "CONSTRUCCION EN ESPERA";
                break;
            case 4:
                nuevoestado = "ESPERA DE DEMOLICION";
                break;
        }
    }
    
    
    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getBanos() {
        return banos;
    }

    public void setBaños(int baños) {
        this.banos = baños;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public String getComprada() {
        return comprada;
    }

    public void setComprada(String comprada) {
        this.comprada = comprada;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        if (estado > 5) {
            System.out.println("No puede ingresar más casas en construccion");  
        } else {
            this.estado = estado;
        }
         
    }

    public String getIngeniero() {
        return ingeniero;
    }

    public void setIngeniero(String ingeniero) {
        this.ingeniero = ingeniero;
    }
    public String toString(){
        return "Numero de casa: "+casa+ "\n"
                +"Numero de bloque: "+
                "Color: "+color+
                "Ancho: "+ancho+
                "Largo: "+largo+
                "Comprada: "+comprada+
                "Numero de pisos: "+pisos+
                "Numero de baños: "+banos+
                "Numero de cuartos: "+cuartos+
                "Nombre del dueño: "+dueno+
                "Estado: "+nuevoestado;
    }
    
    
    
}
