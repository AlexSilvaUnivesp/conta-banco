import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        while (true)
            try {
                System.out.println("Por favor, digite o número da Conta: ");
                numeroConta = Integer.parseInt(scanner.nextLine());
                break;
            }
            catch (NumberFormatException nfe){
                System.out.println("Número da conta deve conter apenas números");
            }

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        double saldo;
        while (true)
            try {
                System.out.println("Por favor, digite o seu saldo: ");
                saldo = Double.parseDouble(scanner.nextLine());
                break;
            }
            catch (NumberFormatException nfe){
                System.out.println("Número da conta deve conter apenas números");
            }

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}
