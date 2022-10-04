package Rpg;

import java.util.Scanner;
import java.util.Random;

public class Rpg {

    static int ataqueUsuario(){
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Escolha seu ataque");
            System.out.println("(1)- Soco");
            System.out.println("(2)- Especial");
            return leitor.nextInt();
        }

    }

    static int ataquedoComputador(){
        Random gerador = new Random();
        return gerador.nextInt(3)+1;
    }
    
    static void imprimeHP(int hpUsuario, int hpComputador, int contagemEspeciais){
        System.out.println("==============");
        System.out.println("--HP usuario:" + hpUsuario);
        System.out.println("--HP computador:" + hpComputador);
        System.out.println("--Contagem Especiais:" + contagemEspeciais);
        System.out.println("==============");
    }


    static void batalha(){
        int hpUsuario = 100;
        int hpComputador = 16;
        int contagemEspeciais = 5;
        int escolhaAtaque;
        int i = 1;
       
        while(hpUsuario > 0){
            hpComputador = 10 +  i;

            System.out.println("=================");
            System.out.println("INIMIGO" + i);
            System.out.println("=================\n");

            while(hpUsuario > 0 && hpComputador > 0){
                imprimeHP(hpUsuario, hpComputador, contagemEspeciais);
                escolhaAtaque = ataqueUsuario();
                switch(escolhaAtaque){
                    case 1 :
                        System.out.println("Usuario realizou soco");
                        hpComputador -= 7;
                        break;
                    case 2 :
                        System.out.println("Usuario realizou ataque Especial ");
                        hpComputador -= 20;
                        contagemEspeciais--; //contagemEspecial = contagemEspecial -1
                        break;
                    default :
                        System.out.println("Opcao invalida");
                        break;
                }
                if(hpComputador > 0){
                    escolhaAtaque = ataquedoComputador();
                    switch(escolhaAtaque){
                        case 1:
                           System.out.println("Usuario realizou soco");
                           hpUsuario -= 2 + (int)(i / 10);  
                           break;
                        case 2:
                           System.out.println("Usuario realizou chute");
                           hpUsuario -= 3 + (int)(i / 10); ; 
                           break;
                        case 3:
                           System.out.println("Usuario realizou ataque Especial");
                           hpUsuario -= 4+ (int)(i / 20); ; 
                           break;      
                    }
                }
                else {
                    System.out.println("Inimigo derrotado");
                }
    
    
    
            }
            if(hpUsuario > 0){
                hpUsuario += 5;
                if(hpUsuario > 100){
                    hpUsuario = 100;
                }
                if(i % 10 == 0 ){
                    contagemEspeciais++;
                    if(contagemEspeciais > 5){
                        contagemEspeciais = 5;
                    }

                }

            }

            i++;
        }
    

        }
      
            


       

public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    int continua = 1;
    while(continua == 1){

        batalha();



        System.out.println("Fim de jogo, Deseja continuar? (1) Sim (2) Nao");
        continua = leitor.nextInt();
    }

    }
}  

