
//5. Média de Valores Únicos:
//Implemente um programa que calcule a média aritmética dos valores únicos
//em uma lista de números inteiros, ou seja, excluindo os valores duplicados da média.

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exercicio05 {

    public static void main(String[] args) {
        List<Integer> lista = List.of(8, 6, 4, 10, 4, 8);
        
        System.out.println(lista);
        
        double media = calcularMedia(lista);
        
        System.out.println("media dos valores sem repetir " + media);
    }
    
    public static double calcularMedia(List<Integer> lista) {
        Set<Integer> numUnico = new HashSet<>();
        double soma = 0;
        
        for (Integer num : lista) {
            numUnico.add(num);
        }
        
        for (Integer num : numUnico) {
            soma += num;
        }
        
        return soma / numUnico.size();
    }
}

