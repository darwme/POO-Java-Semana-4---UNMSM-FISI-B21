package Ejercicio2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Reloj {
    static int hora;
    static int minuto;
    static void menuPrincipal(){
        System.out.println("::: BIENVENIDO A LINKI ROLEX :::");
        System.out.println("Hora actual: " + );
        System.out.println("Elige una opción: ");
        System.out.println("1. Botón A (Ir a configuración)\n2. Botón B (Configurar horas/minutos)\n3. salir");
    }
    static void menuBotonA(){
        System.out.println("::: CONFIGURACIÓN DEL RELOJ LINKI :::");
        System.out.println("Elige una opción: ");
        System.out.println("1. Pasar de horas a minutos\n2. Configuración\n3. salir");
    }
    static void menuBotonB(){
        System.out.println("::: AVANZAR HORAS/MINUTOS :::");
        System.out.println("Elige una opción: ");
        System.out.println("1. Pasar de horas a minutos\n2. Configuración\n3. salir");
    }
    public static void horasMinutos(int horas, int minutos){
        Calendar calendar = Calendar.getInstance();
        //DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
        horas = calendar.get(Calendar.HOUR);
        minutos = calendar.get(Calendar.MINUTE);
        System.out.println("Hora: " + horas +  " Minutos: " + minutos);
    }


    public static void main(String[] args) {
        String fechaActual = horasMinutos(hora, minuto);
        //menuPrincipal();
    }
}
