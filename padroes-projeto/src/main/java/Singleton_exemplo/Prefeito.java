package Singleton_exemplo;

public class Prefeito {



    // Construtor privado: ninguém cria outro Prefeito

    private Prefeito() {}



    // Instância única criada dentro da classe

    private static Prefeito instance = new Prefeito();



    // Metodo para acessar o único prefeito

    public static Prefeito getInstance() {

        return instance;

    }



    // Alguns atributos do Prefeito

    private String nome;

    private String partido;



    // Getters e Setters

    public String getNome() {

        return nome;

    }



    public void setNome(String nome) {

        this.nome = nome;

    }



    public String getPartido() {

        return partido;

    }



    public void setPartido(String partido) {

        this.partido = partido;

    }

}