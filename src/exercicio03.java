
//3. Ordenação de Lista de Números:
//Implemente um algoritmo de ordenação (por exemplo, Bubble Sort) para ordenar
//uma lista de números inteiros em ordem crescente.

public class exercicio03 {

    public static void main(String[] args) {
        int[] numeros = {57, 25, 8, 14, 10};
        
        System.out.println("Lista sem ordenacao");
        Array(numeros);
        
        bubbleSort(numeros);
        
        System.out.println("Lista ordenada");
        Array(numeros);
    }
    
    public static void Array(int[] numeros) {
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void bubbleSort(int[] numeros) {
        int n = numeros.length;
        boolean modificado;
        
        for (int i = 0; i < n - 1; i++) {
            modificado = false;
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    modificado = true;
                }
            }
            
            if (!modificado) {
                break;
            }
        }
    }
}

