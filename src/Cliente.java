public class Cliente {
    private String nome;
    private double Salario;

    Cliente(String nome,double Salario){
        this.nome=nome;
        this.Salario=Salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    public void ExibirCliente(){
        System.out.println("Nome do cliente: "+ nome);
        System.out.println("Salario do Cliente: "+ Salario);
    }
}
