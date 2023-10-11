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
        String s05 = original.substring(2, 9); // inicio na posicao 2 com limite ate  a posicao 9
        String s06 = original.replace('a', 'x'); // troca caracter
        String s07 = original.replace("abc", "xy");// trocar substring
        int i = original.indexOf("bc"); //descobrir a posicao de primeira ocorrencia (aparicao)
        int j = original.lastIndexOf("bc"); // descobrir a ultima ocorrencia

        System.out.println("original: -" + original + "-");

        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);

    }

}
