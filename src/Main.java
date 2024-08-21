//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();

        c1.setNome("Eriwelton");
        c2.setNome("Borges");

        Conta cc = new ContaCorrente(c1);
        Conta cp = new ContaPoupanca(c2);

        cc.depositar(103000.0);
        cc.transferencia(90000, cp);
        cc.ImprimirExtrato();
        cp.ImprimirExtrato();
    }
}