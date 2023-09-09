
public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco contaBanco = new ContaBanco();

        contaBanco.inserirNomeCliente();
        contaBanco.inserirAgencia();
        contaBanco.inserirConta();
        contaBanco.inserirSaldo();
        contaBanco.mostrarContaCliente();
    }
}
