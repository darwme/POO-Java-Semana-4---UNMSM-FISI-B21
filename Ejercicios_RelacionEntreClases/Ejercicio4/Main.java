package Ejercicio4;

import Ejercicio2.Clientes;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Omnibus omnibus1 = new Omnibus("A59G8");
        Omnibus omnibus2 = new Omnibus("B6G34");

        Pasajero pasajero1 = new Pasajero("Daniel","77948523","6948");
        Pasajero pasajero2 = new Pasajero("Raul","77559382","9238");
        Pasajero pasajero3 = new Pasajero("Claudia","76872394","9435");
        Pasajero pasajero4 = new Pasajero("Milagros","70392834","1395");
        Pasajero pasajero5 = new Pasajero("Karls","21084359","5983");
        Pasajero pasajero6 = new Pasajero("José","37193683","1023");

        omnibus1.addPasajero(pasajero1);
        omnibus1.addPasajero(pasajero2);
        omnibus1.addPasajero(pasajero3);
        omnibus2.addPasajero(pasajero4);
        omnibus2.addPasajero(pasajero5);
        omnibus2.addPasajero(pasajero6);

        System.out.println("Omnibus de placa: " + omnibus1.getNumeroDePlaca());
        Iterator<Pasajero> it = omnibus1.getPasajeros().iterator();
        while (it.hasNext()){
            Pasajero obj = it.next();
            System.out.println(obj.toString());
        }
        System.out.println("\nOmnibus de placa: " + omnibus2.getNumeroDePlaca());
        it=omnibus2.getPasajeros().iterator();
        while(it.hasNext()){ // seguidamente uno/otro del mismo iterador(it)
            Pasajero obj= it.next();
            System.out.println(obj.toString());
        }

    }
}

