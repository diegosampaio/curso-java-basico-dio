import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     
        Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());

        System.out.println("Por favor, informe o Número da Conta: ");
        int numConta = sc.nextInt();

        System.out.println("Por favor, informe a Agência: ");
        String agencia = sc.next();

        System.out.println("Por favor, informe o nome do cliente: ");
        String nomeCliente = sc.next();

        System.out.println("Por favor, informe o valor do saldo: ");        
        float saldoConta = sc.nextFloat();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numConta + " e seu saldo " + saldoConta + " já está disponível para saque");

    }
}
