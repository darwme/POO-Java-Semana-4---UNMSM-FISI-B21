package Ejercicio1;

import java.util.Scanner;

public class Cuenta {
    static Scanner scanner = new Scanner(System.in); //objeto del tipo escaner para variable de entrada
    //Método Menú
    static void Menu(){
        int opcionMenu;
        int[] saldoProvicional = new int[2];
        System.out.println("::: BIENVENIDO A TU LINKI ACCOUNT :::");
        System.out.println("¿Qué transacción desea realizar?");
        System.out.println("1. Ingresar Ejercicio1.Dinero \n2. Retirar Ejercicio1.Dinero\n3. Ver saldo\n4. salir");
        opcionMenu = scanner.nextInt();
        switch (opcionMenu) {
            case 1 -> {
                System.out.println("Cuanto dinero desea ingresar?: ");
                saldoProvicional[0] = scanner.nextInt();
                Dinero.ingresarDinero(saldoProvicional[0]);
            }
            case 2 -> {
                System.out.println("Cuanto dinero desea retirar?: ");
                saldoProvicional[1] = scanner.nextInt();
                Dinero.retirarDinero(saldoProvicional[1]);
            }
            case 3 -> Dinero.obtenerBalance();
            case 4 -> System.exit(1);
            default -> Menu();
        }
    }

    //Método Principal
    public static void main(String[] args) {
        Menu();
    }
}

