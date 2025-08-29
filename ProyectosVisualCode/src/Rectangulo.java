    
public class Rectangulo implements Figura {
    private final double ancho;
    private final double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

 

    @Override
    public double CalcularArea() {
        return ancho * alto;
    }
    
}
