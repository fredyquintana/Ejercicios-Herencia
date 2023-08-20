package Ejercicios_de_Herencia_UML_Codigo;

// Clase Rectangulo
public class Rectangulo extends FigurasGeometricas {
    public double base;
    public double altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }

    
   
@Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Área del rectángulo: " + area);
    }
}


    
