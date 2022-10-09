package Ejercicio2;
import java.util.ArrayList;
public class Banco {
    String nombre, direccionBanco;
    ArrayList<Clientes> clientes ;
    /*
    Los objetos del tipo cliente
    El ArrayList lo que hace es contener
    la lista de objetos "Clientes"
     */

    public Banco(String nom, String direc){
        nombre = nom;
        direccionBanco = direc;
        this.clientes = new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }

    public void agregarCliente(Clientes cliente){
        this.clientes.add(cliente);
    }
    public ArrayList<Clientes> ObtenerClientes(){
        return this.clientes;
    }
}
