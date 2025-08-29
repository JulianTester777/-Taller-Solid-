public class CalcularArea {
    
      public double sumar(Figura[] figuras) {
        double areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.CalcularArea();
        }
        return areaTotal;
    }


}
