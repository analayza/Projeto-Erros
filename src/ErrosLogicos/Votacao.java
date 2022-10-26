package ErrosLogicos;
import java.util.Scanner;

public class Votacao {
    public void Votacao(){
        System.out.print("DIGITE A SEU VOTO: (EX:13) ");
        Scanner votacao = new Scanner(System.in);

        try{
            int voto = votacao.nextInt();
            if(voto<10 || voto>99){
                throw new ErroVotacao("Erro digite apenas 2 numeros") ;
            }
            System.out.println("Obrigada");
        }
        catch (ErroVotacao e){
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}
