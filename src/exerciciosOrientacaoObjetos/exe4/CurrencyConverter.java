package exerciciosOrientacaoObjetos.exe4;

/**
 *
 * @author grazielle
 */
public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double dolarToReal(double dolarPrice, double qtdDolar) {
        
       return ( dolarPrice * qtdDolar ) * (1.0  + IOF);

    }

}
