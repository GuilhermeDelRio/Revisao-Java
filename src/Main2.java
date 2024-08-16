import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option = 0;
        Jogo j1 = new Jogo();

        while(option != 6) {
            System.out.println("Escolha uma opção: " +
                    "\n [1] Adicionar novo jogo " +
                    "\n [2] Aplicar desconto no jogo" +
                    "\n [3] Aumentar preço do jogo" +
                    "\n [4] Atualizar classificação etária do jogo" +
                    "\n [5] Mostrar detalhes dos jogos" +
                    "\n [6] Sair");
            option = input.nextInt();


            switch (option) {
                case 1:
                    addNovoJogo(j1);
                    break;
                case 2:
                    desconto(j1);
                    break;
                case 3:
                    aumentarPreco(j1);
                    break;
                case 4:
                    atualizarClassificacaoEtaria(j1);
                    break;
                case 5:
                    detalhesJogo(j1);
                    break;
            }
        }

    }

    private static void detalhesJogo(Jogo jogo) {
        if (jogo == null) System.out.println("Não há jogos cadastrados");
        System.out.println(jogo.toString());
    }

    private static void atualizarClassificacaoEtaria(Jogo jogo) {
        Scanner input = new Scanner(System.in);
        System.out.println("A classificação etária do jogo autualmente é " +
                jogo.getClassificacaoEtaria());

        System.out.println("Informe a nova classificação etária: ");
        int novaClassificacao = input.nextInt();

        jogo.atualizarClassificacao(novaClassificacao);

        System.out.println("A nova classificação etária foi atualizada para " +
                jogo.getClassificacaoEtaria() + " anos;");
    }

    private static void aumentarPreco(Jogo jogo) {
        Scanner input = new Scanner(System.in);
        System.out.println("O valor atual do jogo é de R$: " + jogo.getPreco());

        System.out.println("Informe o percentual para o aumento: ");
        jogo.aumentarPreco(input.nextInt());

        System.out.println("O valor do jogo atualizado é de R$: " + jogo.getPreco());
    }

    private static void desconto(Jogo jogo) {
        Scanner input = new Scanner(System.in);
        System.out.printf("O valor atual do jogo é de R$: " + jogo.getPreco());

        System.out.println("Informe o percentual de desconto: ");
        jogo.aplicarDesconto(input.nextInt());

        System.out.println("O valor do jogo atualizado é de R$: " + jogo.getPreco());
    }

    public static void addNovoJogo(Jogo jogo) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o nome do jogo: ");
        jogo.setTitulo(input.next());

        System.out.print("Informe a classificação etária do jogo: ");
        jogo.setClassificacaoEtaria(input.nextInt());

        System.out.print("Informe o valor do jogo: ");
        jogo.setPreco(input.nextDouble());

        System.out.println("Jogo criado com sucesso!");
    }
}
