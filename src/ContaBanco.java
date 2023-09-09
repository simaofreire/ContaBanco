import java.util.Scanner;

public class ContaBanco {
  private String nomeCliente;
  private String agencia;
  private int conta;
  private double saldo;

  private Scanner scanner = new Scanner(System.in);

  /**
   * Prompts the user to enter their name and stores it in the `nomeCliente`
   * field.
   * If the name is empty, it prompts again.
   */
  public void inserirNomeCliente() {
    System.out.println("Digite seu nome");
    nomeCliente = scanner.nextLine();

    if (nomeCliente == null || nomeCliente.isEmpty()) {
      System.out.println("Nome do cliente não pode ser vazio");
      inserirNomeCliente();
    }
  }

  /**
   * Prompts the user to enter their agency and stores it in the `agencia` field.
   * If the agency is empty, it prompts again.
   */
  public void inserirAgencia() {
    System.out.println("Digite sua agencia");
    agencia = scanner.nextLine();

    if (agencia == null || agencia.isEmpty()) {
      System.out.println("Agencia não pode ser vazia");
      inserirAgencia();
    }
  }

  /**
   * Prompts the user to enter their account number and stores it in the `conta`
   * field.
   * If the account number is empty or not a valid integer, it prompts again.
   */
  public void inserirConta() {
    try {
      System.out.println("Digite sua conta");
      conta = Integer.parseInt(scanner.nextLine());

      if (conta == 0) {
        System.out.println("Conta não pode ser vazia");
        inserirConta();
      }
    } catch (NumberFormatException e) {
      System.out.println("Por favor, insira um valor válido para a conta.");
      inserirConta();
    }
  }

  /**
   * Prompts the user to enter their balance and stores it in the `saldo` field.
   * If the balance is empty or not a valid double, it prompts again.
   */
  public void inserirSaldo() {
    try {
      System.out.println("Digite seu saldo");
      saldo = Double.parseDouble(scanner.nextLine());

      if (saldo == 0) {
        System.out.println("Saldo não pode ser vazio");
        inserirSaldo();
      }

    } catch (NumberFormatException e) {
      System.out.println("Por favor, insira um valor válido para o saldo.");
      inserirSaldo();
    }
  }

  /**
   * Displays the client's account details using the stored information in the
   * fields `nomeCliente`, `agencia`, `conta`, and `saldo`.
   */
  public void mostrarContaCliente() {
    System.out.println("Olá " + nomeCliente +
        ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia +
        ", conta: " + conta +
        " e seu saldo " + saldo + " já está disponível para saque.");
  }
}
