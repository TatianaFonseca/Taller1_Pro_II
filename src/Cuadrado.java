public class Cuadrado {
    double lado;
    public Cuadrado(double lado){
        this.lado=lado;
    }
    public double calcularArea(){
        return lado*lado ;
    }

    public double calcularPerimetro() {
        return lado*4;
    }
}
