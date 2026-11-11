package exercicios;

import java.util.Scanner;

/** Exercício 09 — Busca de valor em matriz 3x3. */
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linhas = 3, colunas = 3;
        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Digite o valor para [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o valor X que deseja encontrar: ");
        int x = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] == x) {
                    encontrado = true;
                    System.out.printf("Valor %d encontrado na linha %d e coluna %d.%n",
                            x, i + 1, j + 1);
                }
            }
        }

        if (!encontrado) {
            System.out.printf("O valor %d não está presente na matriz.%n", x);
        }

        sc.close();
    }
}
