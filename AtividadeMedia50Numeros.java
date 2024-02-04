import javax.swing.*;

public class AtividadeMedia50Numeros {
    public static void main(String[] args) {


        double[] vetornumero = new double[50];

        double soma = 0;
        double media;

        for (int i = 0; i <= 49; i++) {

            vetornumero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para soma?"));
            soma = soma + vetornumero[i];
            System.out.println("a soma dos 50 valores digitados é " + soma);

        }

        media = soma / 49;

        System.out.println("A média dos numeros é " + media);


    }
}
