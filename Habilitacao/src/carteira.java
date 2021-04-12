
import java.util.Scanner;

public class carteira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Ler = new Scanner (System.in);
		
		String nome;
		int atual, nasc, idade;
		
		
		System.out.println("---------------------------------");
		System.out.println("      CARTEIRA DE HABILITACAO    ");
		System.out.println("---------------------------------");
		
		
		System.out.println("Qual o seu nome: ");
		nome = Ler.next();
		System.out.println("Por favor digite o ano atual:");
		atual = Ler.nextInt();
		System.out.println("Por favor digite o ano do seu nascimento:");
		nasc = Ler.nextInt();
		
		idade = atual - nasc;
		
		if (idade >=18) {
			System.out.println("Parabens " + nome + " voce esta com " + idade + " anos, e é apto para tirar sua Habilitação");
		}	 else {
				System.out.println("Infelismente " + nome + " voce ainda tem " + idade + " anos, e não é apto pode tirar sua habilitação");
		}
		
		
		
	}

}
