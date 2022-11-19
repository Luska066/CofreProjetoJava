package cofre;

import java.util.Scanner;

public class CofreMain {

	public static void main(String[] args) {
		Moedas m = new Moedas();
		Scanner sc = new Scanner(System.in);
		// m.setvReal(20);
		// m.conversao(10, 20);
		int iniciar = -1;
		int opcao = 0;
		while (iniciar == -1) {

			System.out.println("---------------------|");
			System.out.println("1 - Cadastrar Valores|");
			System.out.println("2 - Listar           |");
			System.out.println("3 - Remover          |");
			System.out.println("4 - Total Convertido |");
			System.out.println("5 - Sair             |");
			System.out.println("---------------------|");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				
				int opcaoCadastro = 0;
				while (opcaoCadastro != 4) {
				System.out.println("Escolha a opção:---- ");
				System.out.println("1 - Real: ");
				System.out.println("2 - Dolar ");
				System.out.println("3 - Euro ");
				System.out.println("4 - sair ");
				opcaoCadastro = sc.nextInt();
		
					switch (opcaoCadastro) {
					
					case 1:
						System.out.println("Digite o valor em R$: ");
						m.setvReal(sc.nextDouble());
						break;
					case 2:
						System.out.println("Digite o valor em $: ");
						m.setvDolar(sc.nextDouble());
						break;

					case 3:
						System.out.println("Digite o valor em E: ");
						m.setvEuro(sc.nextDouble());
						break;
					case 4:
						System.out.println("Saindo da Opcao");
						break;
					}
				}
				break;
				
			case 2:
				System.out.println(" ");
				m.Listar();
				System.out.println(" ");
				break;
			case 3:
				int opcaoRemover = 0;
				while(opcaoRemover != 4) {
					
					System.out.println("Escolha a opcao: que deseja remover ");
					System.out.printf("1 - Real :\n2 - Dolar :\n3 - Euro\n4 - Sair ");
					opcaoRemover = sc.nextInt();
					
					switch(opcaoRemover) {
					case 1:
						int remover = 0;
						System.out.println("Escolha a opcao que deseja remover: :D");
						System.out.println("1 - Remover Todo o Valor:");
						System.out.println("2 - Remover Parcialmento o Valor:");
						remover = sc.nextInt();
						if(remover == 1) {
							m.setvReal(0);
						}else if(remover == 2 ) {
							System.out.println("Quanto deseja Remover: ");
							m.RemoveReal(sc.nextDouble());
						}else {
							System.out.println("Opcao Incorreta");
						}
						
						break;
						
					case 2:
						int removerDolar = 0;
						System.out.println("Escolha a opcao que deseja remover: :D");
						System.out.println("1 - Remover Todo o Valor:");
						System.out.println("2 - Remover Parcialmento o Valor:");
						remover = sc.nextInt();
						if(remover == 1) {
							m.setvDolar(0);
						}else if(remover == 2 ) {
							System.out.println("Quanto deseja Remover: ");
							m.RemoveDolar(sc.nextDouble());
						}else {
							System.out.println("Opcao Incorreta");
						}
						break;
						
					case 3: 
						int removerEuro = 0;
						System.out.println("Escolha a opcao Para Dar Continuidade");
						System.out.println("1 - Remover Todo o Valor:");
						System.out.println("2 - Remover Parcialmento o Valor:");
						remover = sc.nextInt();
						if(remover == 1) {
							m.setvEuro(0);
						}else if(remover == 2 ) {
							System.out.println("Quanto deseja Remover: ");
							m.RemoveEuro(sc.nextDouble());
						}else {
							System.out.println("Opcao Incorreta");
						}
						break;
						
					}
					
				}
				
				break;
				
			case 4:
				System.out.println("Convertido com Sucesso");
				m.conversao(m.getvDolar(), m.getvEuro());
				break;
				
			case 5 :
				iniciar = 2;
				break;
				//final switch
			}

		}

	}

}
