public class Produto {
    String nome;
    double preço;
    int quantidade;

    public void ExibirInformações(){
        System.out.printf("""
                \nProduto: %s
                Preço: R$ %.2f
                Quantidade em estoque: %d \n""", nome, preço, quantidade);
    }

    public void removerEstoque(int qtdVendida){
        if (qtdVendida <= quantidade) {
            this.quantidade -= qtdVendida;
            System.out.printf("\nVenda realizada! Novo estoque: %d", this.quantidade);
        } else {
            System.out.println("\nEstoque insulficiente!");
        }
    }
}