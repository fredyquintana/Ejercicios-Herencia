
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Circle", 5.6);
        Rectangulo rectangulo = new Rectangulo("Rectangle", 7.0, 8.0);
        Triangulo triangulo = new Triangulo("Triangle", 2.0, 10.0);
        // Usage example
        System.out.println("----------------------------------------");
        System.out.println(circulo.nombre + ": The area is = " + circulo.calcularArea());
        System.out.println("----------------------------------------");
        System.out.println(rectangulo.nombre + ": The area is = " + rectangulo.calcularArea());
        System.out.println("----------------------------------------");
        System.out.println(triangulo.nombre + ": The area is = " + triangulo.calcularArea());
        System.out.println("----------------------------------------");
    }
}