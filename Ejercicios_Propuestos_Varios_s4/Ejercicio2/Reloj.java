package Ejercicio2;

import java.util.Calendar;
import java.util.Scanner;

public class Reloj {
    static int hora;
    static int minuto;
    static Scanner scanner = new Scanner(System.in);
    static Calendar calendar = Calendar.getInstance();
    public static void horasMinutos(int horaz, int minutoz){
        horaz = calendar.get(Calendar.HOUR);
        minutoz = calendar.get(Calendar.MINUTE);
        System.out.println("Hora: " + horaz +  " Minutos: " + minutoz);
    }
    static void menuPrincipal(){
        int opcionPrincipal;
        System.out.println("::: BIENVENIDO A LINKI ROLEX :::");
        System.out.println("Hora actual: ");
        horasMinutos(hora, minuto);
        System.out.println("Elige una opción: ");
        System.out.println("1. Botón A (Ir a configuración)\n2. Botón B (Configurar horas/minutos)\n3. salir");
        opcionPrincipal = scanner.nextInt();
        switch (opcionPrincipal){
            case 1 ->{
                menuBotonA();
                break;
            }
            case 2 ->{
                menuBotonB();
                break;
            }
            case 3 ->{
                System.exit(1);
            }
            default -> menuPrincipal();
        }
    }
    static void menuBotonA(){
        int opcionMenuBoton;
        System.out.println("::: CONFIGURACIÓN DEL RELOJ LINKI :::");
        System.out.println("Elige una opción: ");
        System.out.println("1. Pasar de horas a minutos\n2. Pasar de minutos a horas \n3. Regresar");
        opcionMenuBoton = scanner.nextInt();
        switch (opcionMenuBoton){
            case 1:
                System.out.println("Los minutos actualmente son: " + calendar.get(Calendar.MINUTE));
                menuBotonA();
                break;
            case 2:
                System.out.println("Las horas actualmente son: " + calendar.get(Calendar.HOUR));
                menuBotonA();
                break;
            case 3:
                menuPrincipal();
        }
    }

    static void avanzar(int valor, int num){
        valor += num;
        System.out.println("Nuevo horario: " + valor);

    }
    static void retroceder(int valor, int num){
        valor += num;
        System.out.println("Nuevo minutero: " + valor);
    }
    static void menuBotonB(){
        int opcionMenuBotonB;
        int num;
        System.out.println("::: AVANZAR HORAS/MINUTOS :::");
        System.out.println("Elige una opción: ");
        System.out.println("1. Cambiar horas\n2.Cambiar minutos\n3. Regresar");
        opcionMenuBotonB = scanner.nextInt();
        switch (opcionMenuBotonB){
            case 1 ->{
                System.out.println("Nuevo horario?: ");
                num = scanner.nextInt();
                avanzar(hora, num);
                break;
            }
            case 2 ->{
                System.out.println("Nuevo minutero?: ");
                num = scanner.nextInt();
                retroceder(minuto, num);
                break;
            }
            case 3 ->{
                menuPrincipal();
            }
            default -> menuBotonB();
        }
    }

    public static void main(String[] args) {
        menuPrincipal();
    }
}
