package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Pelicula pe1 = new Pelicula("Lo que el viento se llevó");
        Pelicula pe2 = new Pelicula ("Mar adentro");

        SalaCine s1 = new SalaCine("Palafox", 5);// 5 espectadores máximo
        SalaCine s2 = new SalaCine("Luchana", 15); // 15 espectadores máximo
        Fecha f1 = new Fecha (23,"Septiembre", 2015);
        Fecha f2 = new Fecha (24,"Septiembre", 2015);
        Pase p1 = new Pase (pe1, s1, f1); // pase para la pelicula pe1 en la sala s1 y en la fecha f1
        Pase p2 = new Pase (pe2, s2, f2);
        Usuario u1 = new Usuario ("Daniel Rosas");
        Usuario u2 = new Usuario ("Talita Rodriguez");
        Reserva r1 = new Reserva (u1, p1, 3); // reserva realizada por u1 para pase p1
        Reserva r2 = new Reserva (u1, p1, 1);
        Reserva r3 = new Reserva (u2, p1, 2);
        Reserva r4 = new Reserva (u2, p2, 7);
        Reserva r5 = new Reserva (u1, p2, 6);
        System.out.println("El pase " + p1 + " tiene" + p1.plazasLibres() + " plazas libres.");
        System.out.println("El pase " + p2 + " tiene" + p2.plazasLibres() + " plazas libres.");

        System.out.println("Se han realizado " + Reserva.cantidadReservas() + " reservas");
    }
}
