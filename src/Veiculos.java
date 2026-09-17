public class Veiculos {
        String marca;
        int ano;
        int aro;
        public void mostrar(){
            System.out.println("Marca: " + marca + "| Ano: " + ano + " | Aro: " + aro );
        }
        public Veiculos(String marca,int ano,int aro){
            this.marca = marca;
            this.ano = ano;
            this.aro = aro;
        }
        public Veiculos(String marca,int ano ){
            this(marca,ano,0);

        }
        public Veiculos(String marca){
            this(marca,0,0);
        }
    }
    class Veiculo1 extends Veiculos {
        public Veiculo1(String marca, int ano, int aro){
            super(marca,ano,aro);
        }
    }
    class Veiculo2 extends Veiculos {
        public Veiculo2(String marca,int ano){
            super(marca,ano);
        }
    }
    class Veiculo3 extends Veiculos {
        public Veiculo3(String marca){
            super(marca);
        }
    }


