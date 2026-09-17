public class Main{

    public static void main(String[] args){

        Cliente cliente = new Cliente("Maria Maria",1200);

        Pedido pedido = new Pedido(cliente);
        Produto2 produto2 = new Produto2("Mesa",1700);
        pedido.adicionarProduto(produto2);
        pedido.Exibircliente(cliente);
        pedido.ExibirProduto(produto2);
    }
}