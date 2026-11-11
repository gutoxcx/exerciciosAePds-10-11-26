package exercicios;

import java.util.Scanner;

/** Exercício 07 — Estatística das temperaturas dos sensores. */
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] temperatura = new float[5];
        for (int i = 0; i < temperatura.length; i++) {
            System.out.printf("Digite a temperatura registrada pelo sensor %d%n: ", i + 1);
            temperatura[i] = sc.nextFloat();
        }

        float maiorTemperatura = temperatura[0];
        float somaTemperaturas = 0;
        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] > maiorTemperatura) {
                maiorTemperatura = temperatura[i];
            }
            somaTemperaturas += temperatura[i];
        }

        float mediaTemperaturas = somaTemperaturas / temperatura.length;

        System.out.printf("Maior temperatura: %.2f%n", maiorTemperatura);
        System.out.printf("Média das temperaturas: %.2f%n", mediaTemperaturas);
    }
}
