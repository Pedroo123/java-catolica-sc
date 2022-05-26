package com.agendaUm;

import java.util.Scanner;

public class Converte_Celsius {
    public static void main(String[] args) {
        Converte_Celsius();
    }

    public static void Converte_Celsius() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero em Fahrenheit: ");
        int temperaturaFahrenheit = entrada.nextInt();

        int temperaturaCelsius = (int) ((temperaturaFahrenheit -32 ) / 1.8);

        System.out.println("Conversão: " + temperaturaFahrenheit + " graus Fahrenheit equivalem a " + temperaturaCelsius + " graus em Celsius");
    }
}
