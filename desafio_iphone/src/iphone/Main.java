package iphone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Iphone iphone = new Iphone();
	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("\n=== MENU iPHONE ===");
	            System.out.println("1. Reprodutor Musical");
	            System.out.println("2. Aparelho Telefônico");
	            System.out.println("3. Navegador de Internet");
	            System.out.println("0. Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    System.out.println("\n--- Reprodutor Musical ---");
	                    System.out.print("Digite o nome da música: ");
	                    String musica = scanner.nextLine();
	                    iphone.selecionarMusica(musica);
	                    iphone.tocar();
	                    System.out.print("Deseja pausar a música? (s/n): ");
	                    if (scanner.nextLine().equalsIgnoreCase("s")) {
	                        iphone.pausar();
	                    }
	                    break;

	                case 2:
	                    System.out.println("\n--- Aparelho Telefônico ---");
	                    System.out.print("Digite o número para ligar: ");
	                    String numero = scanner.nextLine();
	                    iphone.ligar(numero);
	                    System.out.print("Atender chamada? (s/n): ");
	                    if (scanner.nextLine().equalsIgnoreCase("s")) {
	                        iphone.atender();
	                    }
	                    System.out.print("Ouvir correio de voz? (s/n): ");
	                    if (scanner.nextLine().equalsIgnoreCase("s")) {
	                        iphone.iniciarCorreioVoz();
	                    }
	                    break;

	                case 3:
	                    System.out.println("\n--- Navegador de Internet ---");
	                    System.out.print("Digite a URL da página: ");
	                    String url = scanner.nextLine();
	                    iphone.exibirPagina(url);
	                    System.out.print("Adicionar nova aba? (s/n): ");
	                    if (scanner.nextLine().equalsIgnoreCase("s")) {
	                        iphone.adicionarNovaAba();
	                    }
	                    System.out.print("Atualizar página? (s/n): ");
	                    if (scanner.nextLine().equalsIgnoreCase("s")) {
	                        iphone.atualizarPagina();
	                    }
	                    break;

	                case 0:
	                    System.out.println("Encerrando...");
	                    break;

	                default:
	                    System.out.println("Opção inválida.");
	            }

	        } while (opcao != 0);

	        scanner.close();
	
	}

}
