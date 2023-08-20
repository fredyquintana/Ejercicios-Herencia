package Ejercicios_de_Herencia_UML_Codigo;


public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 7);

        FigurasGeometricas[] figuras = {circulo, rectangulo, triangulo};

        for (FigurasGeometricas figura : figuras) {
            figura.calcularArea();
        }
    }
}

