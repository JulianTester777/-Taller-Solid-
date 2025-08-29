public class Circulo implements Figura {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

 
    @Override
    public double CalcularArea() {
        return Math.PI * radio * radio;
    }
}