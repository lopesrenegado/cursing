package Calcular;
import java.util.Scanner;

public class Calculo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double p = 0.0, Valor = 0.0;

        System.out.print("(Porcentagem): "); //Porcentagem que voce quer
        p= sc.nextDouble();

        System.out.print("Valor: "); // valor a ser descontado
        Valor = sc.nextDouble();

        Double desconto = (100 -p / 100) * Valor;

        System.out.println("Resultado" + desconto);

         sc.close();   
        }

        
    }
    

