package Ejercicio1;

public class Dinero {
    //Atributo
    static int balance;

    //Métodos
    static void ingresarDinero(double saldo){

        if (saldo <= 0){
            return;
        }
        balance += saldo;
        System.out.println("Listo!.");
        Cuenta.Menu();
    }

    static void retirarDinero(double saldo){
        if (saldo <= 0){
            return;
        }
        balance -= saldo;
        System.out.println("Listo!.");
        Cuenta.Menu();
    }
    static void obtenerBalance(){
        System.out.println("su saldo es de: " + balance);
        Cuenta.Menu();

    }
}
