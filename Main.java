public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Cliente cliente = new Cliente();
        cliente.numeroTelefono = 1122334455;
        cliente.nombre = "Delfina";
        cliente.edad = 17;
        cliente.credito = 1;
        System.out.println(cliente.credito);
        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.numeroTelefono);
        System.out.println("esto es parte de la clase cliente");
        Trabajador trabajador = new Trabajador();
        trabajador.numeroTelefono = 1122334455;
        trabajador.nombre = "Delfina";
        trabajador.edad = 17;
        trabajador.salario = 1;
        System.out.println(cliente.credito);
        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.numeroTelefono);
        System.out.println("esto es parte de la clase trabajador");
    }
}
class Persona {
    int edad;
    String nombre;
    int numeroTelefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona{
    int salario;

}