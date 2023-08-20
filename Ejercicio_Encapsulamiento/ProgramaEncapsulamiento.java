public class ProgramaEncapsulamiento {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Fredy", 19);

        // Accediendo a los atributos encapsulados
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());

        // Modificando la edad
        persona1.setEdad(20);

        // Mostrando la información de la persona
        persona1.mostrarInformacion();
    }
}