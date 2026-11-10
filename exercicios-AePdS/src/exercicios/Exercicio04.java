package exercicios;

import java.util.Scanner;

/** Exercício 04 — Classificação do tempo de uso do servidor. */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempoDeUsoContinuo;
        System.out.print("Informe o tempo de uso contínuo do servidor: ");
        tempoDeUsoContinuo = sc.nextInt();
        String statusDeManutencao;

        if (tempoDeUsoContinuo <= 100) {
            statusDeManutencao = "Baixo";
        } else if (tempoDeUsoContinuo > 100 && tempoDeUsoContinuo <= 500) {
            statusDeManutencao = "Moderado";
        } else {
            statusDeManutencao = "Crítico";
        }

        System.out.printf("\nCLASSIFICAÇÃO DO STATUS DE MANUTENÇÃO: %s", statusDeManutencao);
    }
}
