import java.util.ArrayList;
public class TesteArrayList {

    public static void main(String[] args) {

        ArrayList <Produto2> produtos; // "produtos" é uma variável referência capaz de apontar para um ArrayList que armazena objetos "Produto2"

        produtos = new ArrayList<>();

        //Esses objetos Produto2 são criados diretamente dentro da expressão do add() e sua referência é adicionada ao ArrayList. caso o .add tivesse que funcionar pelo main, deveria haver uma conexão com o array por dependência de classe por metodo.
        produtos.add(new Produto2("Armario",1900));
        produtos.add(new Produto2("Mesa",1700));

        //remoção por meio de objeto 
        Produto2 produto1 = new Produto2("Papel",1900);
        produtos.remove(produto1);

        //"produtos" é a variável referência que aponta para o objeto arraylist
        //.get(1) aponta para o índice 1 do arraylist.
        //getNome retorna o nome do Produto2
        System.out.println(produtos.get(1).getNome());

        //no array utiliza .length, no arraylist se utiliza .size().
        System.out.println(produtos.size());

        //percorrendo array list com for .size e consecutivamente retornando o nome através do .get
        for(int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i).getNome());
        }

        produtos.remove(1);
        System.out.println(produtos.size());

    }
}
