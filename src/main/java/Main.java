public class Main {
    public static void main(String[] args) {

        Cliente gustavo = new Cliente();
        gustavo.setNome("Gustavo");

        Conta cc = new ContaCorrente(gustavo);
        Conta poupa = new ContaPoupanca(gustavo);

        cc.depositar(100);
        cc.transferir(100, poupa);

       cc.imprimirExtrato();
       poupa.imprimirExtrato();

    }
}
