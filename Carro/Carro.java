package Carro;

 

public class Carro {

    String Nome;
    String marca;
    int ano;
    int vel;
    public String nome;

    public void acelerar(int aceleraçao){
        vel+=aceleraçao;
    }

    void freiar(int reduzir){
        vel-=reduzir;
    }
    void buzinar(){
        System.out.println("bibibi");
    }
}
