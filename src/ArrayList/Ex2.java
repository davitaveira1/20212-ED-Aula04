package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {

        //declaração
        List<String> list;
        //instanciação
        list = new ArrayList<>();

        list.add("Davi");
        list.add("Marcelo");
        list.add("Renata");

        System.out.println("Imprimindo lista");
        System.out.println("");
        int cont = 0;
        for (String x : list) {
            System.out.println(cont + " | " + x);
            cont++;
        }

        System.out.println("============");
        System.out.println("Inserindo João na posição 1");
        System.out.println("");
        list.add(1, "João");
        cont=0;
        for (String x : list) {
            System.out.println(cont + " | " + x);
            cont++;
        }
        
        System.out.println("============");
        System.out.println("Informando o tamanho da lista");
        System.out.println("");        
        System.out.println("Tamanho: "+list.size());
        
        System.out.println("============");
        System.out.println("Excluindo Davi");
        System.out.println("");  
        list.remove("Davi");
        
        cont=0;
        for (String x : list) {
            System.out.println(cont + " | " + x);
            cont++;
        }     
        
        System.out.println("============");
        System.out.println("Informando o tamanho da lista");
        System.out.println("");        
        System.out.println("Tamanho: "+list.size());        

    }

}
