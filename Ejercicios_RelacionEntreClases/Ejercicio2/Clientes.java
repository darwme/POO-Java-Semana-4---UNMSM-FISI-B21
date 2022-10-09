package Ejercicio2;
import java.util.GregorianCalendar;
public class Clientes {
    String nombre, dni;
    GregorianCalendar fechaNacimiento;
    public Clientes(String nom, String doc_i, GregorianCalendar fn){
        nombre = nom;
        dni = doc_i;
        fechaNacimiento = fn;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDni(){
        return dni;
    }
    public GregorianCalendar getFechaNacimiento(){
        return fechaNacimiento;
    }

    @Override
    public String toString(){
        return this.getNombre() + "\t" + this.getDni() + "\t" + this.getFechaNacimiento().getTime();
    }
}