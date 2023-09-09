
import java.util.Scanner;

public class ContaBanco {
  private String nomeCliente;
  private String agencia;
  private int conta;
  private double saldo;

  private Scanner scanner = new Scanner(System.in);

  public void inserirNomeCliente() {
    System.out.println("Digite seu nome");
    nomeCliente = scanner.nextLine();

    if (nomeCliente == null || nomeCliente.isEmpty()) {
      System.out.println("Nome do cliente não pode ser vazio");
      inserirNomeCliente();
    }
  }

  public void inserirAgencia() {
    System.out.println("Digite sua agencia");
    agencia = scanner.nextLine();

    if (agencia == null || agencia.isEmpty()) {
      System.out.println("Agencia não pode ser vazia");
      inserirAgencia();
    }
  }

  public void inserirConta() {
    try {
      System.out.println("Digite sua conta");
      conta = Integer.parseInt(scanner.nextLine());

      if (conta == 0) {
        System.out.println("Conta não pode ser vazia");
        inserirConta();
      }
    } catch (Exception e) {
      System.out.println("Por favor, insira um valor válido para a conta.");
      inserirConta();
    }
  }

  public void inserirSaldo() {
    try {
      System.out.println("Digite seu saldo");
      saldo = Double.parseDouble(scanner.nextLine());

      if (saldo == 0) {
        System.out.println("Saldo não pode ser vazio");
        inserirSaldo();
      }

    } catch (Exception e) {

      System.out.println("Por favor, insira um valor válido para o saldo.");
      inserirSaldo();
    }

  }

  public void mostrarContaCliente() {
    System.out
        .println(
            "Olá " + nomeCliente + "." + "\nObrigado por criar uma conta em nosso banco.\nSua agência é: " + agencia
                + " \nConta: " + conta + "\ne seu saldo de R$" + saldo + " já está disponível para saque.");
  }

}
