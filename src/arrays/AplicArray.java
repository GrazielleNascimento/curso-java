
package arrays;

import java.util.ArrayList;

/**
 *
 * @author grazi
 */
public class AplicArray {

    public static void main(String[] args) {
    

        ArrayList<String> carros = new ArrayList<>();
           
        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add(1,"Argo");
        
        for(String e:carros){
            System.out.println(e);
        }
             
    }
    
}
