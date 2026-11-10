package exercicios;

import java.util.Scanner;

/** Exercício 03 — Desconto em compras. */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double desconto = 0.10, valorCompra, valorFinal;

        System.out.print("Digite o valor total da compra: ");
        valorCompra = sc.nextDouble();

        //aplicação do desconto se cabivel
        if (valorCompra > 500) {
            valorFinal = valorCompra * (1 - desconto);
            System.out.printf("\nTOTAL A PAGAR (desconto aplicado): %.2f%n", valorFinal);
        } else {
            valorFinal = valorCompra;
            System.out.printf("\nTOTAL A PAGAR (sem desconto): %.2f%n", valorFinal);
        }
    }
}
