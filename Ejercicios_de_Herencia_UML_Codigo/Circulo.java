package Ejercicios_de_Herencia_UML_Codigo;

// Clase Circulo
public class Circulo extends FigurasGeometricas {
    
   
    public double radio;
    
        public Circulo(double radio) {
            
           
    super("Círculo");
            this.radio = radio;
        }
    
        @Override
        public void calcularArea() {
            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("Área del círculo: " + area);
        }
    }
    
