public class Main{

    public static void main(String[] args){

        Livro livro = new Livro("O Hobbit");

        Biblioteca biblioteca = new Biblioteca(livro);//

        livro.mostrarLivro();

        Curso curso = new Curso("Informática");
        Aluno aluno = new Aluno(curso);

    }
}