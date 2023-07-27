package exerciciosrevisao.Aconstrutores.dominio;

import javax.swing.plaf.PanelUI;

public class Estudante01 {
    private String nome;
    private int idade;
            private String serie;
    private String sonho;

    public Estudante01(String nome , int idade , String serie , String sonho){
        this.nome = nome;
        this.idade = idade ;
        this.serie = serie ;
        this.sonho = sonho ;


    }


    public void imprime (){
        System.out.println("-------------------");
        System.out.print("  " +this.nome + " ");
        System.out.print(this.idade);
        System.out.print("  "+ this.serie);
        System.out.print( "  " + this.sonho);
        System.out.println("----------------------");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSonho() {
        return sonho;
    }

    public void setSonho(String sonho) {
        this.sonho = sonho;
    }
}
