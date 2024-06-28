
//4. Remoção de Elementos Duplicados:
//Escreva um método que remova todos os elementos duplicados de uma lista,
//mantendo apenas a primeira ocorrência de cada elemento.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exercicio04 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(23);
        lista.add(45);
        lista.add(23);
        lista.add(87);
        lista.add(32);
        lista.add(45);
        
        System.out.println("insercao de numero da lista");
        System.out.println(lista);
        
        removerDuplicados(lista);
        
        System.out.println("lista sem duplicados");
        System.out.println(lista);
    }
    
    public static void removerDuplicados(List<Integer> lista) {
        Set<Integer> set = new HashSet<>(); // armazena sem repetir
        
        for (int i = 0; i < lista.size(); i++) {
            if (!set.add(lista.get(i))) {
                lista.remove(i);
                i--;
            }
        }
    }
}
