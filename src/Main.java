import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ContaBancaria contaPedro = new ContaBancaria(13531,"Pedro Sampaio",2223.50);
    ContaBancaria contaMaria = new ContaBancaria(15892,"Maria Leopoldina", 5321);

        System.out.println("Faça um Deposito na conta do banco");
        System.out.println("Conta 1: " + contaPedro.getTitular());
        System.out.println("Saldo Inicial: " + contaPedro.getSaldo());
        contaPedro.depositar(200);
        System.out.println("Saldo Atual: " + contaPedro.getSaldo());
        boolean ok = contaPedro.sacar(500.0);
        System.out.println("Tentativa de saque de R$500: " + (ok ? "sucesso" : "falha"));
        System.out.println("Saldo Atual: " + contaPedro.getSaldo());

        System.out.println("");

        System.out.println("Faça um Deposito na conta do banco");
        System.out.println("Conta 2: " + contaMaria.getTitular());
        System.out.println("Saldo Inicial: " + contaMaria.getSaldo());
        contaMaria.depositar(200);
        System.out.println("Saldo Atual: " + contaMaria.getSaldo());
        ok = contaMaria.sacar(500.0);
        System.out.println("Tentativa de saque de R$700: " + (ok ? "sucesso" : "falha"));
        System.out.println("Saldo Atual: " + contaMaria.getSaldo());
    }
}