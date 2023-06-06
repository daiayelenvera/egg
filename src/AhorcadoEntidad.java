
public class AhorcadoEntidad {
    
    //Atributos
    int n;
    int nroIntentos;
    int letrasEncontradas;
    String palabra[] = new String[n];

    public AhorcadoEntidad() {
    }

    public AhorcadoEntidad(int n, int nroIntentos, int letrasEncontradas) {
        this.n = n;
        this.nroIntentos = nroIntentos;
        this.letrasEncontradas = letrasEncontradas;
    }
    
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getNroIntentos() {
        return nroIntentos;
    }

    public void setNroIntentos(int nroIntentos) {
        this.nroIntentos = nroIntentos;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "AhorcadoEntidad{" + "n=" + n + ", nroIntentos=" + nroIntentos + ", letrasEncontradas=" + letrasEncontradas + ", palabra=" + palabra + '}';
    }
    
    
    
}
