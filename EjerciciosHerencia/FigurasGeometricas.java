public class FigurasGeometricas {
    // attribute
    protected String nombre;

    // Builder
    public FigurasGeometricas(String nombre) {
        this.nombre = nombre;
    }

    // Method to calculate the area will be overridden by derived classes
    public double calcularArea() {
        return 0.0; // Default, as it will be overridden in derived classes
    }
}

// Circle derived class
class Circulo extends FigurasGeometricas {
    // Specific attribute
    private double radio;

    // Builder
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // Override the calculateArea() method
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Rectangle derived class
class Rectangulo extends FigurasGeometricas {
    // Specific attributes
    private double base;
    private double altura;

    // Builder
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Override the calculateArea() method
    @Override
    public double calcularArea() {
        return base * altura;
    }
}

// Triangle derived class
class Triangulo extends FigurasGeometricas {
    // Specific attributes
    private double base;
    private double altura;

    // Builder
    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Override the calculateArea() method
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}