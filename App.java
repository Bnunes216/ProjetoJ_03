package carrinho;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto1 = new Produto("Pizza", 1, 15.00);
        Produto produto2 = new Produto("Coxinha", 2, 5.50);
        Produto produto3 = new Produto("Cigarrete", 3, 8.50);

        Fatura fatura = new Fatura();

        int opcao;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1 - Comprar");
            System.out.println("2 - Ver Fatura");
            System.out.println("3 - Encerrar Programa");
            System.out.println("----------------");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Produtos disponíveis:");
                    System.out.println("Código: " + produto1.getCodigo() + " - " + produto1.getNome() + " - R$ " + produto1.getPreco());
                    System.out.println("Código: " + produto2.getCodigo() + " - " + produto2.getNome() + " - R$ " + produto2.getPreco());
                    System.out.println("Código: " + produto3.getCodigo() + " - " + produto3.getNome() + " - R$ " + produto3.getPreco());
                    System.out.print("Digite o código do produto desejado: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Digite a quantidade comprada: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); 

                    Produto produtoSelecionado = null;
                    if (codigo == produto1.getCodigo()) {
                        produtoSelecionado = produto1;
                    } else if (codigo == produto2.getCodigo()) {
                        produtoSelecionado = produto2;
                    } else if (codigo == produto3.getCodigo()) {
                        produtoSelecionado = produto3;
                    }

                    if (produtoSelecionado != null) {
                        Item item = new Item(produtoSelecionado, quantidade);
                        fatura.adicionarItem(item);
                        System.out.println("Item adicionado à fatura.");
                    } else {
                        System.out.println("Código do produto inválido.");
                    }
                    break;
                case 2:
                    fatura.exibirFatura();
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}