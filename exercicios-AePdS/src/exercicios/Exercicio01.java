package exercicios;

import java.util.Scanner;

/** Exercício 01 — Estrutura Sequencial: área e custo do piso. */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double larguraSala, alturaSala, precoMetroQuadrado, areaSala, custoEstimado;

        System.out.print("Em metros, digite a largura da sala: ");
        larguraSala = sc.nextDouble();
        System.out.print("Agora, a altura da sala: ");
        alturaSala = sc.nextDouble();
        System.out.print("\nInforme o preço do metro quadrado do piso industrial: ");
        precoMetroQuadrado = sc.nextDouble();

        areaSala = larguraSala * alturaSala;
        custoEstimado = areaSala * precoMetroQuadrado;

        System.out.printf("""
            \nÁrea Total: %.2f m² | Custo estimado: R$ %.2f
            """, areaSala, custoEstimado);
    }
}
