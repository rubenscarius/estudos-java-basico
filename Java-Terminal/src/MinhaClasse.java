import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) throws Exception {

        String nome;
        String sobrenome;
        int idade;
        double altura;
        try ( // String nome = args [0];
        // String sobrenome = args [1];
        // int idade = Integer.valueOf(args[2]);
        // double altura = Double.valueOf(args[3]);
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome");
            nome = scanner.next();
            System.out.println("Digite seu sobrenome");
            sobrenome = scanner.next();
            System.out.println("Digite sua idade");
            idade = scanner.nextInt();
            System.out.println("Digite sua altura");
            altura = scanner.nextDouble();
        }

        System.out.println("------------------------------------");
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
        System.out.println("------------------------------------");

    }
}
