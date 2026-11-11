package exercicios;

import java.util.Scanner;

/** Exercício 06 — Tabuada usando repetição. */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int entradaNumero = sc.nextInt();

        for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
            System.out.println(entradaNumero + " x " + multiplicador +
                    " = " + (entradaNumero * multiplicador));
        }

        sc.close();
    }
}
