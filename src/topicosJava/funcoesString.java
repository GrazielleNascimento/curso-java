
package topicosJava;

/**
 *
 * @author grazielle
 */
public class funcoesString {

    public static void main(String[] args) {
      
        String original = "abcde FGHIJ ABB abc DEFG ";
     
        
        String s01 = original.toLowerCase();// minusculo
        String s02 = original.toUpperCase();//maiusculo
        
        System.out.println("original: -"  + original + "-");  
        
        System.out.println("toLowerCase: -" + s01 + "-");     
        System.out.println("toUpperCase: -" + s02 + "-");
    }
    
}