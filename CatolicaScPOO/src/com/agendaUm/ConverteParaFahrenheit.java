package com.agendaUm;
import java.util.Scanner;

public class ConverteParaFahrenheit {

    public static void main(String[] args) {
        Converte_Fahrenheit();
    }

    public static void Converte_Fahrenheit() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero em Celsius: ");
        int temperaturaCelsius = entrada.nextInt();

        int temperaturaFahrenheit = (int) ((1.8 * temperaturaCelsius) + 32);

        System.out.println("Conversão: " + temperaturaCelsius + " graus celsius equivalem a " + temperaturaFahrenheit + " graus em Fahrenheit");
    }
}
