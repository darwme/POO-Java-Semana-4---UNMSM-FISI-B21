package Ejercicio4;
import java.util.ArrayList;
public class Omnibus {
    String numeroDePlaca;
    ArrayList<Pasajero> pasajeros;

    public Omnibus(String placa){
        numeroDePlaca = placa;
        this.pasajeros = new ArrayList<>();
    }

    String getNumeroDePlaca(){
        return numeroDePlaca;
    }

    public void addPasajero(Pasajero pasajero){this.pasajeros.add(pasajero);}
    public ArrayList<Pasajero> getPasajeros(){return this.pasajeros;}
}
