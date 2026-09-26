public class Pedido {

    private Cliente cliente;
    private Produto2 produto[];// Variável produto capaz de guardar um array de referência para objetos Produto2
    private int indice = 0;//serve para controlar onde inserir o próximo produto

    Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
    public void adicionarProduto(Produto2 produto){
        this.produto[indice] = produto;
        indice++;
    }
    public void Exibircliente(Cliente cliente){
        cliente.ExibirCliente();
    }
    public void ExibirProduto(Produto2 produto2){
        System.out.println("Produto: "+ produto2.getNome());
        System.out.println("Preço:" + produto2.getPreco());
    }
}
