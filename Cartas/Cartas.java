package Cartas;

public class Cartas {
    public static void main (String[] args){
        String [] nipes={"Ouross","Copas","Espadas","Paus"};
        String [] faces={"Az","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei",};
        //As linhas abaixo recuperam de forma aletario o conteudo dos arrays
        String nipe = nipes[(int) (Math.random()*   4   )];
        String face = faces[(int) (Math.random()*    faces.length)];
        // na linha de baixo mostra a carta sorteada
        System.out.println(face + " de " + nipe);
    
    }
    
}
