public class Livro {

    private String livro;

    Livro(String livro){
        this.livro = livro;

    }

    public String getLivro() {
        return livro;
    }
    public void setLivro(String livro) {
        this.livro = livro;
    }
    public void mostrarLivro(){
        System.out.println(livro);
    }
}
