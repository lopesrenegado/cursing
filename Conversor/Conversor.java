package Conversor;

public class Conversor {
    double celsiusParaFahreinheit(double c){
        return (9.0 * c) / 5.0 + 32.0;
    } 

    void tabelaTemperatura(){
        for (double t= 10.0; t<100.0; t = t+5){
            double f = celsiusParaFahreinheit(t);
            System.out.printf("%.1f Celsius => %.1f Fahrenheit\n", t, f); // celsius para Fahreinheit
        }
    }
    
}
