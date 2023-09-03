package interativo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca do carro esportivo: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o modelo do carro esportivo: ");
        String modelo = scanner.nextLine();
        
        System.out.println("Digite os ano do carro: ");
        int ano = scanner.nextInt();

        CarroEsportivo meuCarro = new CarroEsportivo(marca, modelo, ano);

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Ligar o carro");
            System.out.println("2. Desligar o carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Ativar Turbo");
            System.out.println("5. Frear");
            System.out.println("6. Verificar se é um Carro Antigo");
            System.out.println("7. Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    meuCarro.setLigado(true);
                    System.out.println("Carro ligado.");
                    System.out.println();
                    System.out.println("O que deseja fazer agora?");
                    break;
                case 2:
                    meuCarro.setLigado(false);
                    System.out.println("Carro desligado.");
                    break;
                case 3:
                    System.out.print("Digite a velocidade para acelerar: ");
                    int velocidade = scanner.nextInt();
                    meuCarro.acelerar(velocidade);
                    break;
                case 4:
                    meuCarro.ativarTurbo();
                    System.out.println("Turbo ativado.");
                    break;
                case 5:
                    meuCarro.frear();
                    break;
                case 6:
                	 if (meuCarro.ehCarroAntigo()) {
                         System.out.println("Este é um Carro Antigo.");
                     } else {
                         System.out.println("Este é um Carro Moderno.");
                     }
                     break;
                case 7:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
