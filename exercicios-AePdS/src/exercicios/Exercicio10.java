package exercicios;

import java.util.Scanner;

/** Exercício 10 — Modularização e cálculo de consumo. */
public class Exercicio10 {
    public static double calcularConsumo(double potenciaWatts, double horasDia) {
        return (potenciaWatts * horasDia * 30) / 1000;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos computadores deseja informar? ");
        int quantidadeComputadores = sc.nextInt();

        for (int i = 1; i <= quantidadeComputadores; i++) {
            System.out.printf("\nComputador %d%n", i);
            System.out.print("Potência do computador em watts: ");
            double potenciaWatts = sc.nextDouble();
            System.out.print("Horas de uso por dia: ");
            double horasDia = sc.nextDouble();

            double consumoMensal = calcularConsumo(potenciaWatts, horasDia);
            System.out.printf("Consumo mensal: %.2f kWh%n", consumoMensal);
        }

        sc.close();
    }
}
