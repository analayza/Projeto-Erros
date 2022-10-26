package ErrosSemanticos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eleitor {
    public void salaDeVotacao(){
        System.out.print("DIGITE A SUA SALA DE VOTACAO: (EX:98) ");
        Scanner saladevotacao = new Scanner(System.in);

        try{

            int sala = saladevotacao.nextInt();
            System.out.println("Obrigada");

        }
        catch (InputMismatchException e){
            System.out.println("ERRO: " + "digite um numero inteiro");
        }
    }
}

