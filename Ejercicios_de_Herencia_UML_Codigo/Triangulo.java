package Ejercicios_de_Herencia_UML_Codigo;

// Clase Triangulo
public class Triangulo extends FigurasGeometricas {
    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        super("Triángulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("Área del triángulo: " + area);
    }
}