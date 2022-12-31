public class Main {
    public static void main(String[] args) {

    Persona persona = new Persona();

    persona.setEdad(17);
    int edad = persona.getEdad();
    System.out.println(edad);

    persona.setNombre("Delfina Aylen Bravo");
    String nombre = persona.getNombre();
    System.out.println(nombre);

    persona.setNumeroTelefono(3105);
    int numeroTelefono = persona.getNumeroTelefono();
    System.out.println(numeroTelefono);

    }
}
class Persona {
    private int edad;
    private String nombre;
    private int numeroTelefono;

    public void setEdad(int valor){
        this.edad = valor;
    }
    public int getEdad (){
        return this.edad;
    }

    public void setNombre(String valor){
        this.nombre = valor;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setNumeroTelefono(int valor){
        this.numeroTelefono = valor;
    }
    public int getNumeroTelefono(){
        return this.numeroTelefono;
    }

}