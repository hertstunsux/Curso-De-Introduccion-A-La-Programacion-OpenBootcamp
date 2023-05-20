public class Main {
    public static void main(String[] args) {
        Cliente Sebastian = new Cliente();
        Sebastian.setEdad(25);
        Sebastian.setNombre("Sebastian");
        Sebastian.setTelefono("77314995");
        Sebastian.setCredito(100000);
        System.out.println(Sebastian.getNombre() + " es un@ cliente de " + Sebastian.getEdad() + " años con teléfono " + Sebastian.getTelefono() + " y crédito de " + Sebastian.getCredito() + " $");
        Trabajador Silvia = new Trabajador();
        Silvia.setEdad(59);
        Silvia.setNombre("Silvia");
        Silvia.setTelefono("73110007");
        Silvia.setSalario(300);
        System.out.println(Silvia.getNombre() + " es un@ trabajador@ de " + Silvia.getEdad() + " años con teléfono " + Silvia.getTelefono() + " y salario de " + Silvia.getSalario() + " $");
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
class Cliente extends Persona {
    private int credito;
    public void setCredito (int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }
}
class Trabajador extends Persona {
    private int salario;
    public void setSalario (int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
}