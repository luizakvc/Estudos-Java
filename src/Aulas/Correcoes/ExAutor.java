package Aulas.Correcoes;

public class ExAutor {
    // 3) Crie uma classe Autor que possui:
    //	* Atributos: nome, email;
    //	* Construtores:
    //		- Cria autores com base nos parâmetros nome e email;
    //	* Métodos:
    //		- alteraNome(String novoNome) => muda o nome atual do autor
    //		- alteraEmail(String novoEmail) => muda o email atual do autor
    String nome;
    String email;

    ExAutor (String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

     String setNome(String novonome) {
        this.nome = novonome;
         return this.nome;
     }

     String setEmail (String novoEmail) {
        this.email = novoEmail;
        return this.email;
     }

    public static void main (String [] args) {
        ExAutor autor1 = new ExAutor("Luiza", "Luiza@gmail.com");
        System.out.println(autor1.nome);
        System.out.println(autor1.setNome("Karla"));
        System.out.println(autor1.nome);
        System.out.println(autor1.email);
        System.out.println(autor1.setEmail("karla@gmail.com"));
        System.out.println(autor1.email);
    }
}
