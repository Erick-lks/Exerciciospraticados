package exerciciosrevisao.Aconstrutores;

import exerciciosrevisao.Aconstrutores.dominio.Estudante01;

public class Estudantetest {
    public static void main(String[] args) {
        Estudante01 estudante = new Estudante01("Junior",16 , "2 ano" , "Policial" );
       Estudante01 estudante02 = new Estudante01("Joao" , 10 , "5 ano" , "Bombeiro");


        estudante.imprime();
        estudante02.imprime();
    }
}
