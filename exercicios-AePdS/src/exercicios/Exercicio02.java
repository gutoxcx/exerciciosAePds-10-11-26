package exercicios;

import java.util.Scanner;

/** Exercício 02 — Cálculo de média ponderada. */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======== PROGRAMA DE NOTAS =========");
        float[] notas = new float[3];
        int[] pesosMedia = {2, 3, 5};
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota %d: ", i + 1);
            notas[i] = sc.nextFloat();
        }
        float somaPonderada = 0;
        int somaPesos = 0;
        for (int i = 0; i < notas.length; i++) {
            somaPonderada += notas[i] * pesosMedia[i];
            somaPesos += pesosMedia[i];
        }

        float totalMediaPonderada = somaPonderada / somaPesos;

        System.out.printf("----------------------------\nMédia: %.2f", totalMediaPonderada);
    }
}
