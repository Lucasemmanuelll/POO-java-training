public class Produto {

        String nome;
        double preco;
        int quantidade;

        public Produto(String nome, double preco, int quantidade){ //construtor poo
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }
        public Produto(String nome,double preco){ // construtor 2
            this(nome,preco,0);
        }
        public Produto(String nome){ // construtor 3
            this(nome,0,0);
        }
        // metodo poo
        public void mostrarDados(){
            System.out.println("Produto: " + nome + "|" +preco+ "|" + quantidade);
        }

    }
    //herança class filha
    class Eletronico extends Produto {
        public Eletronico(String nome, double preco, int quantidade){
            super(nome,preco,quantidade);
        }
        //polimorfismo
        @Override
        public void mostrarDados(){
            System.out.println("Eletrônico: " +nome+ "|" +preco+ "|" +quantidade);
        }
    }



