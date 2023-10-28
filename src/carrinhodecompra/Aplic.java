
package carrinhodecompra;

import java.util.Locale;

/**
 *
 * @author grazi
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
       
        Produto p1 = new Produto(10, "Mouse", 22.0);
        Produto p2 = new Produto(20, "Teclado", 55.0);
        Produto p3 = new Produto(30, "Monitor", 133.0);
        Produto p4 = new Produto(40, "Pen drive", 59.0);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        System.out.println(p1);
        
        carrinho.addProdutos(p1);
        carrinho.addProdutos(p2);
        carrinho.addProdutos(p3);
        carrinho.addProdutos(p4);
        
        System.out.println(carrinho);
        
        
        
       
    }
    
}
