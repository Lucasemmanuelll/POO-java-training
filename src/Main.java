public class Main{

    public static void main(String[] args){

        Produto2 produto2 = new Produto2("Mesa",1700);
        Calculadora calculadora = new Calculadora();
        calculadora.exibirPreco(produto2);

        Cliente cliente = new Cliente("Maria Maria",1200);
        Conta conta = new Conta(cliente);
    }
}