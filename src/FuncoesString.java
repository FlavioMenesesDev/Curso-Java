public class FuncoesString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG ";

        String s01 = original.toLowerCase(); // Tudo Minusculo
        String s02 = original.toUpperCase(); // Tudo Maiusculo
        String s03 = original.trim();

        String s04 = original.substring(2); // Recebe Char na Posição escolhida
        String s05 = original.substring(2, 9); // Mostra os caracteres entre os valores escolhidos

        String s06 = original.replace('a', 'x'); // Troca um char pelo outro
        String s07 = original.replace("abc", "xy");

        int i = original.indexOf("bc"); // Recebe a posição onde inicia, nesse caso valor de B
        int j = original.lastIndexOf("bc");// Recebe a posição onde termina, nesse caso valor de C

        System.out.println("Original: -" + original + "-");
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
