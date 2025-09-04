public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.numeroConta = "12345-6";
        conta1.titular = "Carlos Pereira";
        conta1.saldo = 1500.00;

        ContaBancaria conta2 = new ContaBancaria();
        conta2.numeroConta = "98765-4";
        conta2.titular = "Ana Costa";
        conta2.saldo = 300.50;

        System.out.println("--- Operações na Conta 1 (" + conta1.titular + ") ---");
        conta1.consultarSaldo();
        conta1.depositar(500.00);
        conta1.sacar(200.00);
        conta1.consultarSaldo();

        System.out.println("\n--- Operações na Conta 2 (" + conta2.titular + ") ---");
        conta2.consultarSaldo();
        conta2.sacar(400.00);
        conta2.depositar(100.75);
        conta2.consultarSaldo();
    }
}