public class Conta {
    private Cliente cliente;

    Conta(Cliente cliente){
        this.cliente = cliente;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}

