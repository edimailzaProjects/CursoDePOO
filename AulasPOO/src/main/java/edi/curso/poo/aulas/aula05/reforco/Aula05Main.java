package edi.curso.poo.aulas.aula05.reforco;

import java.util.Scanner;

public class Aula05Main
{
    public static void main(String[] args)
    {   
        System.out.println("-----------------------------------");
        System.out.println("       BANCO CAMINHO FELIZ        ");
        System.out.println("-----------------------------------");
        System.out.println(" Selecione um Serviço a ser Testado");
        System.out.println("-----------------------------------");
        System.out.println(" 1 - Criar Conta Corrente");
        System.out.println(" 2 - Criar Conta Poupanca");
        System.out.println(" 3 - Depositar na Conta Corrente");
        System.out.println(" 4 - Depositar na Conta Poupança");
        System.out.println(" 5 - Sacar na Conta Corrente");
        System.out.println(" 6 - Sacar na Conta Poupança");
        System.out.println(" 7 - Pagar Mensalidade da Conta Corrente");
        System.out.println(" 8 - Pagar Mensalidade da Conta Poupança");
        System.out.println(" 9 - Excluir conta");
        System.out.println("-----------------------------------");
                
        try (Scanner s = new Scanner(System.in))
        {
            int escolha = s.nextInt();
            System.out.println("-----------------------------------");
            switch (escolha)
            {
            case 1:
                CriarContaServico novaConta1 = new CriarContaServico();
                System.out.println(novaConta1.abrirConta(GeradorIdsUtils.gerarId(), "cc", "Jose"));
                break;
                
            case 2:
                CriarContaServico novaConta2 = new CriarContaServico();
                System.out.println(novaConta2.abrirConta(GeradorIdsUtils.gerarId(), "cc", "Ana"));
                break;

            default:
                break;
            }
        }

    }

}
