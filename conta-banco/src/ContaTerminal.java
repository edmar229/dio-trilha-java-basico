import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in,"UTF-8");

    System.out.println("Por favor, digite o número da sua conta: ");
    int accountNumber = scanner.nextInt();

    scanner.nextLine();

    System.out.println("Por favor, digite o número da Agência: ");
    String agency = scanner.nextLine();

    System.out.println("Por favor, informe o seu nome: ");
    String clientName = scanner.nextLine();

    System.out.println("Por favor, informe o seu saldo: ");
    double accountBalance = scanner.nextDouble();

    String completeMessage = "Olá ".concat(clientName)
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agency).concat(", conta ")
        .concat(String.valueOf(accountNumber)).concat(" e seu saldo R$").concat(String.valueOf(accountBalance))
        .concat(" já está disponível para saque.");
    System.out.println(completeMessage);

    scanner.close();
  }
}
