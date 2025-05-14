# Programação de Soluções Computacionais

## Exercício – Classe ContaBancaria

### Objetivo

- Praticar encapsulamento de atributos  
- Implementar construtor  
- Criar métodos getter e setter  

### Enunciado

Você deverá criar uma classe `ContaBancaria` que represente uma conta corrente em um banco. Essa classe deve atender aos seguintes requisitos:

### 1. Atributos privados

- `int numeroConta`  
- `String titular`  
- `double saldo`  

### 2. Construtor

Um construtor público que receba `numeroConta`, `titular` e `saldoInicial` e inicialize os atributos correspondentes.

### 3. Getters e Setters

- Métodos CgetNumeroConta()`, `setNumeroConta(int)`  
- Métodos `getTitular()`, `setTitular(String)`  
- Método `getSaldo()` *(apenas getter para saldo; o ajuste de saldo será feito pelos métodos abaixo)*

### 4. Métodos de operação

public void depositar(double valor) // aumenta o saldo

public boolean sacar(double valor) // diminui o saldo se houver fundos; retorna true se a operação foi bem-sucedida ou false caso contrário

### 5. Teste em main

- Crie uma classe Main com o método `public static void main(String[] args)`.
- Instancie duas contas com dados diferentes.
- Faça um depósito e um saque em cada conta, exibindo o saldo antes e depois de cada
operação.
