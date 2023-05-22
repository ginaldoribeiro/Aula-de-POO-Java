
import java.util.Scanner;



public class CalculadoraIdade {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();
        
        int diasVividos = idade * 365;
        
        System.out.println("Você já viveu " + diasVividos + " dias.");
        
        System.out.println("Você Quer Viver Quantos dia a mais?");
        
        entrada.close();
    }
    

}
