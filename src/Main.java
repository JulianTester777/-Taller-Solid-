public class Main {
    public static void main(String[] args) {

         Figura[] figuras = {
            new Rectangulo(4.0, 5.0),
            new Circulo(3.0),
            new Triangulo(6.0, 2.0)
        };

        CalcularArea calculadora = new CalcularArea();
        double total = calculadora.sumar(figuras);

        System.out.println("El área total es: " + total);
    }
       
    }
