package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    //Para criar o método main basta digitar main e dar TAB
    public static void main(String[] args) {
        //Para trazer a função System.out.println sem esforço basta digitar sout e dar TAB.
        /*int a = 2;
        int b = 3;
        //Para rodar a função sem ter que configurar basta utilizar o atalho CTRL + SHIFT + F10
        System.out.println("Hello World! " + (a+b));
        // Após rodar a primeira vez basta utilizar o atalho SHIFT + f10
        CTRL + SHIFT + / -> Para comentar todo o bloco*/
        Gato gato = new Gato();
        gato.setCor("Azul");
        gato.setIdade(12);
        gato.setNome("Bastião");
        System.out.println(gato);
        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);

    }
}

class Livro{
    public String nome;
    public Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
