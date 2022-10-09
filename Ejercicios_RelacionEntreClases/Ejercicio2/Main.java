package Ejercicio2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Banco banco1=new Banco("Interbank","Perú");
        Banco banco2=new Banco("ScotiaBank", "Peru");
        Clientes cliente1=new Clientes("Laura","77687344",new GregorianCalendar(1970, Calendar.APRIL, 6));
        Clientes cliente2=new Clientes("Rolando","70194394",new GregorianCalendar(1980, Calendar.AUGUST,16));
        Clientes cliente3=new Clientes("Tania","71948344",new GregorianCalendar(1990, Calendar.MARCH,1));
//Agregando clientess al Banco
        banco1.agregarCliente(cliente1);
        banco1.agregarCliente(cliente2);
        banco2.agregarCliente(cliente1);
        banco2.agregarCliente(cliente3);
        //Imprimir los clientess
        System.out.println("Banco: " + banco1.getNombre());
        System.out.println("Nombre\tDNI\t\t\tFecha");
        Iterator<Clientes> it=banco1.ObtenerClientes().iterator();
        while(it.hasNext()){ // seguidamente uno/otro del mismo iterador(it)
            Clientes obj= it.next();
            System.out.println(obj.toString());
        }
        System.out.println("\nBanco: " + banco2.getNombre());
        System.out.println("Nombre\tDNI\t\t\tFecha");
        it=banco2.ObtenerClientes().iterator();
        while(it.hasNext()){ // seguidamente uno/otro del mismo iterador(it)
            Clientes obj= it.next();
            System.out.println(obj.toString());
        }
    }
}
