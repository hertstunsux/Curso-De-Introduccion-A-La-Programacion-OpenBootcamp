public class Main {
    public static void main(String[] args) {
        Persona Sebastian = new Persona();
        Sebastian.setEdad(25);
        Sebastian.setNombre("Sebastian");
        Sebastian.setTelefono("77314995");
        System.out.println(Sebastian.getNombre() + " es una persona de " + Sebastian.getEdad() + " años con teléfono " +Sebastian.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;
    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono (String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}