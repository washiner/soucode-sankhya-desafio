
//2. Verificação de Palíndromo:
//Crie um método que verifique se uma lista de caracteres forma um palíndromo.
//Um palíndromo é uma sequência que se lê da mesma forma tanto da esquerda
//para a direita quanto da direita para a esquerda.

public class exercicio02 {

    public static boolean Palindromo(char[] lista) {
        int n = lista.length;

        for (int i = 0; i < n / 2; i++) {
            if (lista[i] != lista[n - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[] lista01 = { 'a', 'b', 'c', 'b', 'a' };
        char[] lista02 = { 'a', 'a', 'd', 'u', 'r' };

        System.out.println("lista01 é " + (Palindromo(lista01) ? "verdadeira (palíndromo)" : "falsa (não palíndromo)") +
                " e lista02 é " + (Palindromo(lista02) ? "verdadeira (palíndromo)" : "falsa (não palíndromo)"));
    }
}
