package com.agendaUm;

public class LoopAsteriscos {

    public static void main(String[] args) {
        Loop_Asteriscos(6);
    }

    public static void Loop_Asteriscos(int n) {

        String output = "";

        for (int i = 1; i <= n; i++) {

            //Loop Interno para controlar os espaços dos asteriscos
            for (int s = n - 1; s >= i; s--) {
                output += " ";
            }

            for (int j = 1; j <= i; j++) {
                output += "*";
            }

            output += "\n";
        }

        System.out.println(output);

    }
}
