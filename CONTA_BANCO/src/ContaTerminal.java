import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite o número da Agência: ");
		String agencia = sc.next();
		sc.nextLine();
		System.out.println("Agora, digite o número da conta bancaria: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do cliente");
		String nomeCliente = sc.next();
		sc.nextLine();
		System.out.println("Digite o saldo bancário");
		double saldo = sc.nextDouble();
		
		 System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", nomeCliente, agencia, numero, saldo);
		
		
		sc.close();
	}

}
