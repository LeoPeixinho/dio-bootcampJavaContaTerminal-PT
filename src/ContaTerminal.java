import java.util.Scanner;
import java.util.Locale;
import java.util.Random;
	
	public class ContaTerminal{
		public static void main (String[]args){
			Scanner scanner = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			Random random = new Random();
				System.out.println("Seja Bem Vindo, digite o seu nome: ");
				String nomeDoCliente = scanner.nextLine();
				System.out.println("Digite sua agência: ");
				String agencia = scanner.nextLine();
				System.out.println("Digite o número da sua agência: ");
				int numero = scanner.nextInt();
				double saldo = random.nextDouble();
				System.out.println("Digite seu saldo é de: " + saldo);
				System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
				scanner.close();
	}
}