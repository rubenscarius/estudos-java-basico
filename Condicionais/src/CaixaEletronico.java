public class CaixaEletronico {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Caixa Eletrônico!");

        double saldo = 1000.0;
        double valorSaque = 200.0;
        
        if (saldo >= valorSaque) {
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }

        System.out.println("Saldo atual: " + saldo);

    }
}
