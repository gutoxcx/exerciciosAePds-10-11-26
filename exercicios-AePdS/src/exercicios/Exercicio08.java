package exercicios;

import java.util.Scanner;

/** Exercício 08 — Contagem de pares e ímpares em vetor. */
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorNumeros = new int[8];
        int quantPares = 0, quantImpares = 0;

        for (int i = 0; i < vetorNumeros.length; i++) {
          System.out.printf("Digite o %d° número: ", i+1);
          vetorNumeros[i] = sc.nextInt();
        }

        for (int numero : vetorNumeros) {
          if (numero % 2 == 0) {
            quantPares++;
          } else {
            quantImpares++;
          }
        }

        System.out.printf("Números pares: %d\nNúmeros ímpares: %d", 
            quantPares, quantImpares);

    }
}
