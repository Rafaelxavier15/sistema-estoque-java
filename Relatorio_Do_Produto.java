void main() {
    Scanner leitor = new Scanner(System.in);
    ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    int opcao = 0;

    while (opcao != 4) {
        System.out.println("\n***** MENU *****");
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Vender Produto");
        System.out.println("3. Listar Estoque");
        System.out.println("4. Sair");
        System.out.print("Escolha: ");
        opcao = leitor.nextInt();
        leitor.nextLine();

    switch (opcao){

        case 1:
            Produto produto = new Produto();

            System.out.println("\nDigite o nome do produto: ");
            produto.nome = leitor.nextLine();

            System.out.println("Digite o preço do produto: ");
            produto.preço = leitor.nextDouble();

            System.out.println("Digite a quantidade em estoque: ");
            produto.quantidade = leitor.nextInt();

            listaDeProdutos.add(produto);
            break;

        case 2:
            System.out.println("\nDigite o nome do produto vendido: ");
            String busca = leitor.nextLine();
            for (Produto item : listaDeProdutos){
                if (item.nome.equalsIgnoreCase(busca)){
                    System.out.println("Quantidade vendida: ");
                    int qtd = leitor.nextInt();
                    item.removerEstoque(qtd);
                }
            }
            break;

        case 3:
            for (Produto item : listaDeProdutos) {
                System.out.println("\n***** ESTOQUE *****");
                item.ExibirInformações();
            }
            break;
        }
    }
}