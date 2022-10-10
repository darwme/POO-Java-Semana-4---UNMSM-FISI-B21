package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] celulas = new String[50][50];
        int gen, num;
        int vivas, muertas;

        System.out.println("¿Cuántas generaciones?");
        gen = scanner.nextInt();
        System.out.println("¿Cuántas células hay en esta generación?");
        num = scanner.nextInt();
        System.out.println("¿Cuántas células muertas hay?");
        muertas = scanner.nextInt();
        System.out.println("¿Cuántas células vivas hay?");
        vivas = scanner.nextInt();

        if (num != (vivas + muertas)){
            System.out.println("Lo siento, hubo un error al digitar.");
        }

        for (int i = 0; i < gen; i++){
            for (int j = 0; j < num; j++){
                if (i == 0){
                    String opcionCelula;
                    System.out.println("Célula [#" + (j+1) + "]: ");
                    System.out.println("¿Esta célula está viva? <s/n>");
                    opcionCelula = scanner.next();
                    if ("s".equals(opcionCelula) || "S".equals(opcionCelula)){
                        celulas[i][j] = "| * ";
                    } else if ("n".equals(opcionCelula) || "N".equals(opcionCelula)) {
                        celulas[i][j] = "|   ";
                    }else {
                        System.out.println("Lo siento, mal digitado.");
                    }
                }

                if (i >= 1){
                    if (j == 0){
                        if (("| * ".equals(celulas[i-1][j]) && "| * ".equals(celulas[i-1][j+1])) ){
                            celulas[i][j] = "| * ";
                        }
                        else {
                            celulas[i][j] = "|   ";
                        }
                    }else if (j >= 1){
                        if (("| * ".equals(celulas[i-1][j]) && "|   ".equals(celulas[i-1][j+1]) && "|   ".equals(celulas[i-1][j-1])) || ("|   ".equals(celulas[i-1][j]) && "| * ".equals(celulas[i-1][j+1])) || ("|   ".equals(celulas[i-1][j]) && "| * ".equals(celulas[i-1][j-1]))){
                            celulas[i][j] = "| * ";
                        }else {
                            celulas[i][j] = "|   ";
                        }
                    }

                }

            }
        }
        System.out.println("Celulas vivas en cada generación:\n");
        for (int i = 0; i < gen; i++){
            for (int j = 0; j < num; j++){
                System.out.print(celulas[i][j]);

                if (j == (num-1)){
                    System.out.print("|");
                }

            }
            System.out.print("\n");
        }
    }
}