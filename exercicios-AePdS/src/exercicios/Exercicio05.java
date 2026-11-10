package exercicios;

import java.util.Scanner;

/** Exercício 05 — Validação de senha. */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senhaCorreta = "2026TADS";
        String entradaSenhaUser = "";
        System.out.print("========== ACESSO AO SISTEMA DO CAMPUS ===========");

        while (!entradaSenhaUser.equals(senhaCorreta)) {
            System.out.println("Digite a senha de acesso: ");
            entradaSenhaUser = sc.nextLine();
        }

        System.out.println("---------------------------\nSenha correta, acesso liberado!");
    }
}
