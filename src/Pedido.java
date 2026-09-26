public class Pedido {

    private Cliente cliente;
    private Produto2 produto[];// Variável produto capaz de guardar um array de referência para objetos Produto2
    private int indice = 0;//serve para controlar onde inserir o próximo produto

    Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produto = new Produto2[3];// criando o array. já deixa o produto preparado para nascer com array "new Produto2[3]" (Main: Pedido pedido = new Pedido(cliente);)
                                        // O atributo "produto" desse objeto Pedido "this.produto"
    }
    public void adicionarProduto(Produto2 produto){// Metodo recebe um Produto2
        this.produto[indice] = produto; // mostra indice atual do array
        indice++;// incrementa somando a posição do array
    }
    public void Exibircliente(Cliente cliente){
        cliente.ExibirCliente();
    }
    public void ExibirProduto(Produto2 produto2){
        System.out.println("Produto: "+ produto2.getNome());
        System.out.println("Preço:" + produto2.getPreco());
    }
    // "int i" serve para controlar em qual posição o for está no array (int i ≠ variável indice)
    public void ExibirProdutos(){
        for(int i=0; i < produto.length;i++){//metodo que utiliza o for e .length para percorrer array
            if(produto[i] != null){//verifica se posiçã o no array não está nula
                System.out.println("Produto: " + produto[i]);
            }
        }
    }
}
