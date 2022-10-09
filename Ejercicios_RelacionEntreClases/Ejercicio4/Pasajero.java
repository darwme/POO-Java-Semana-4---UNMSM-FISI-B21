package Ejercicio4;
public class Pasajero {
    String nombrePasajero;
    String dni;
    String numeroDeBoleto;
    public Pasajero(String nombre, String id, String boleto){
        nombrePasajero = nombre;
        dni = id;
        numeroDeBoleto = boleto;
    }
    public String getNombre(){return nombrePasajero;}
    public String getDNI(){return dni;}

    public String getBoleto(){return numeroDeBoleto;}

    @Override
    public String toString(){
        return this.getNombre() + "\t"  + this.getDNI() + "\t" + this.getBoleto();
    }

}
