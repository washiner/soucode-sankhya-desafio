
//1. Soma dos Elementos Pares:
//Escreva um programa que calcule a soma dos elementos pares de uma lista de inteiros.

public class exercicio01 {

    public static void main(String[] args) {
        
        int[] lista = {1, 2, 3, 4, 5};
        
        int somarPar = 0;
        
        for (int i = 0; i < lista.length; i++) {

            if (lista[i] % 2 == 0) {
                somarPar += lista[i];
            }
        }
        
        System.out.println("elementos pares somado da lista e " + somarPar);
    }
}

