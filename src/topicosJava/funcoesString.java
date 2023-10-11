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
        String s03 = original.trim(); //remove os espacos mantem a mesma formatacao
        String s04 = original.substring(2); // mostrar apartir do c caracter  da segunda posicao em diante nesse caso vai ser o "c"

        System.out.println("original: -" + original + "-");

        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");

    }

}
