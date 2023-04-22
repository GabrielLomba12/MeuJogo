import java.util.Scanner;
import java.util.Random;

public class SegundaFase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println(
                "Você jogou muito bem na temporada passada e isso despertou o interesse de vários clubes grandes!");
        System.out.println("Estes clubes estão localizados nestas duas regiões: Sul e Sudeste.");
        System.out.println(
                "\nAgora é com você! Escolha uma região e caso você acerte uma pergunta tem o direito de escolher o clube que deseja jogar!");

        System.out.println("1) Sul\n2) Sudeste");
        System.out.print("Sua escolha: ");
        String regiao = sc.nextLine();

        if (regiao.equals("1")) {
            System.out.println("Você escolheu a região: Sul.");
        } else if  {
            System.out.println("Você escolheu a região: Sudeste.");
        } else {
            while (true) {
                if (regiao.equals("1") || regiao.equals("2")) {
                    if (regiao.equals("1")) {
                        System.out.println("Você escolheu a região: Sul.");
                        break;
                    } else if (regiao.equals("2")) {
                        System.out.println("Você escolheu a região: Sudeste.");
                        break;
                    }
                } else {
                    System.out.print("Opção inválida. Digite novamente: ");
                    regiao = sc.nextLine();
                }
            }
        }

        System.out.println("\nQual o maior artilheiro da seleção brasileira?\na) Neymar\nb) Pelé\nc) Zico");
        System.out.print("Sua resposta: ");
        String resposta = sc.nextLine().toUpperCase();
        while (true) {
            if (resposta.equals("a".toUpperCase()) || resposta.equals("b".toUpperCase()) || resposta.equals("c".toUpperCase())) {
                break;
            } else {
                System.out.print("Opção inválida. Digite novamente: ");
                resposta = sc.nextLine();
            }
        }

        String clubesSul[] = new String[] {
                "Grêmio", "Internacional"
        };

        String clubesSudeste[] = new String[] {
                "Corinthians", "Palmeiras"
        };

        switch (resposta) {
            case "a":
            case "A":
                System.out.println("Resposta correta.\n\nOpções disponíveis:");
                if (regiao.equals("1")) {
                    int indiceClube = 1;
                    for (String clube : clubesSul) {
                        System.out.println(indiceClube + ") " + clube);
                        indiceClube += 1;
                    }
                    System.out.print("\nEscolha o time de sua preferência: ");
                    String escolha = sc.next();sc.next();
                    while (true) {
                        
                            break;
                        } else {
                            System.out.print("Opção inválida. Digite novamente: ");
                            escolha = sc.nextLine();
                        }
                    }
                    System.out.println("Parabéns! Você se tornou o novo jogador do " + clubesSul[Integer.parseInt(escolha) - 1] + ".");
                } else if (regiao.equals("2")) {
                    int indiceClube = 1;
                    for (String clube : clubesSudeste) {
                        System.out.println(indiceClube + ") " + clube);
                        indiceClube += 1;
                    }
                    System.out.print("\nEscolha o time de sua preferência: ");
                    String escolha = sc.nextLine();
                    while (true) {
                        if (escolha.equals("1") || escolha.equals("2")) {
                            break;
                        } else {
                            System.out.println("Opção inválida. Digite novamente: ");
                            
                        }
                    }
                    System.out.printf("Parabéns! Você se tornou o novo jogador do %s.", clubesSudeste[Integer.parseInt(escolha) - 1]);
                }
                break;

            case "b":
            case "B":
            case "c":
            case "C":
                System.out.println("Resposta incorreta.");
                String clubeSorteado;
                if (regiao.equals("1")) {
                    clubeSorteado = clubesSul[random.nextInt(clubesSul.length)];
                    System.out.println("\nSeu time será sorteado. \nSeu clube sorteado foi: " + clubeSorteado);
                } else if (regiao.equals("2")) {
                    clubeSorteado = clubesSudeste[random.nextInt(clubesSudeste.length)];
                    System.out.println("\nSeu time será sorteado. \nSeu clube sorteado foi: " + clubeSorteado);
                }
                break;

        }
        sc.close();
        System.out.println("Hello World!");
    }
}